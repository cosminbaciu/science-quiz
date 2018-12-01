package com.example.cosminbaciu.kahoot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.cosminbaciu.kahoot.network.ItemParser;
import com.example.cosminbaciu.kahoot.network.Test;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class GroupsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupe);

        Test test = null;

        final String[] names = new String[100];

        final String jsonText = getIntent().getExtras().getString(getString(R.string.json));

        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(jsonText);

            JSONArray tests = jsonObject.getJSONArray("teste");

            List<Test> listaTeste = ItemParser.getItemListFromJsonArray(tests);

            for(int i=0; i<listaTeste.size(); i++)
            {
                 if(listaTeste.get(i).getNumeTest().equals(getIntent().getExtras().getString("nume")));
                {
                    
                    test = listaTeste.get(i);

                    for(int j=0; j< test.getListaGrupe().size(); j++)
                        names[j] = String.valueOf(listaTeste.get(i).getListaGrupe().get(j).getNumeGrupa());
                }
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }


        Button[] buttons = new Button[names.length];
        for (int i = 0; i < names.length; i++) {
            Button button = new Button(this);
            button.setId(i+1);
            button.setText(names[i]);
            button.setY(i*150);
            buttons[i] = button;
        }

        LinearLayout layout = (LinearLayout)findViewById(R.id.linearLayout);
        for (int i = 0; i < names.length; i++) {
            layout.addView(buttons[i]);
        }
        for (int i = 0; i < names.length; i++) {
            final Test finalTest = test;
            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), StudentsMarks.class);
                    Toast toast = Toast.makeText(getApplicationContext(), finalTest.toString(),  Toast.LENGTH_SHORT);
                    toast.show();
                    startActivity(intent);
                }
            });

        }

    }
}
