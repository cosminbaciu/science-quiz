package com.example.cosminbaciu.kahoot;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.cosminbaciu.kahoot.network.ItemParser;
import com.example.cosminbaciu.kahoot.network.Test;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class ShowTestsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afisare_teste);

        final String[] names = new String[100];

        final String jsonText = getIntent().getExtras().getString(getString(R.string.json));

        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(jsonText);

            JSONArray tests = jsonObject.getJSONArray("teste");

            List<Test> listaTeste = ItemParser.getItemListFromJsonArray(tests);

            for(int i=0; i<listaTeste.size(); i++)
            {
                names[i] = listaTeste.get(i).getNumeTest();
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }


        Button[] buttons = new Button[names.length];
        for (int i = 0; i < names.length; i++) {
            Button button = new Button(this);
            button.setId(i + 1);
            button.setText(names[i]);
            button.setY(i*150);
            buttons[i] = button;
        }

        ConstraintLayout layout = findViewById(R.id.linearLayout2);
        for (int i = 0; i < names.length; i++) {
            layout.addView(buttons[i]);
            final int finalI = i;
            final int finalI1 = i;
            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), GroupsActivity.class);
                    intent.putExtra(getString(R.string.json), jsonText);
                    intent.putExtra("nume",  names[finalI]);
                    Toast toast = Toast.makeText(getApplicationContext(), names[finalI],  Toast.LENGTH_SHORT);
                    toast.show();
                    startActivity(intent);
                }
            });
        }
    }
}
