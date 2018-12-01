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

import java.util.ArrayList;
import java.util.List;

public class GroupsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupe);

        Test test = null;

        int idTest = 0;

        final List<String> names = new ArrayList<>();

        final String jsonText = getIntent().getExtras().getString(getString(R.string.json));

        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(jsonText);

            JSONArray tests = jsonObject.getJSONArray("teste");

            final List<Test> listaTeste = ItemParser.getItemListFromJsonArray(tests);

//            Toast toast1 = Toast.makeText(getApplicationContext(), listaTeste.get(0).getNumeTest(),  Toast.LENGTH_SHORT);
//            toast1.show();

            for(int i=0; i<listaTeste.size(); i++)
                 if(listaTeste.get(i).getNumeTest().equals(getIntent().getExtras().getString("nume")))
                {

                    Toast toast = Toast.makeText(getApplicationContext(), getIntent().getExtras().getString("nume"),  Toast.LENGTH_SHORT);
                    toast.show();

                    idTest = i;


                    test = listaTeste.get(i);

                    for(int j=0; j< test.getListaGrupe().size(); j++)
                        names.add(String.valueOf(listaTeste.get(i).getListaGrupe().get(j).getNumeGrupa()));
                }


            Button[] buttons = new Button[names.size()];
            for (int i = 0; i < names.size(); i++) {
                Button button = new Button(this);
                button.setId(i+1);
                button.setText(names.get(i));
                button.setY(i*150);
                buttons[i] = button;
            }

            LinearLayout layout = (LinearLayout)findViewById(R.id.linearLayout);
            for (int i = 0; i < names.size(); i++) {
                layout.addView(buttons[i]);
            }
            for (int i = 0; i < names.size(); i++) {
                final Test finalTest = test;
                final int finalI = i;
                final int finalIdTest = idTest;
                buttons[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), StudentsMarks.class);

                        Toast toast = Toast.makeText(getApplicationContext(), String.valueOf(finalIdTest), Toast.LENGTH_SHORT);
                        toast.show();

                        intent.putExtra(getString(R.string.json), jsonText);
                        intent.putExtra("grupa", String.valueOf(listaTeste.get(finalIdTest).getListaGrupe().get(finalI).getNumeGrupa()));
                        intent.putExtra("nume",  getIntent().getExtras().getString("nume"));

                        startActivity(intent);
                    }
                });

            }

        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}
