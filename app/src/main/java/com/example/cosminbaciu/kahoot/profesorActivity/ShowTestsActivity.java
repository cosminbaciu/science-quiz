package com.example.cosminbaciu.kahoot.profesorActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.cosminbaciu.kahoot.R;
import com.example.cosminbaciu.kahoot.network.ItemParser;
import com.example.cosminbaciu.kahoot.network.Test;
import com.example.cosminbaciu.kahoot.profesorActivity.GroupsActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ShowTestsActivity extends AppCompatActivity {

    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afisare_teste);

        final List<String> names = new ArrayList<>();

        final String jsonText = getIntent().getExtras().getString(getString(R.string.json));

        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(jsonText);

            JSONArray tests = jsonObject.getJSONArray("teste");

            List<Test> listaTeste = ItemParser.getItemListFromJsonArray(tests);

            for(int i=0; i<listaTeste.size(); i++)
            {
                names.add(listaTeste.get(i).getNumeTest());
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }


        Button[] buttons = new Button[names.size()];
        for (int i = 0; i < names.size(); i++) {
            Button button = new Button(this);
            button.setId(i + 1);
            button.setText(names.get(i));
            button.setY(i*150);
            buttons[i] = button;
        }

        ConstraintLayout layout = findViewById(R.id.linearLayout2);
        for (int i = 0; i < names.size(); i++) {
            layout.addView(buttons[i]);
            final int finalI = i;
            final int finalI1 = i;
            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), GroupsActivity.class);
                    intent.putExtra(getString(R.string.json), jsonText);
                    intent.putExtra("nume",  names.get(finalI));
                    startActivity(intent);
                }
            });
        }
    }
}
