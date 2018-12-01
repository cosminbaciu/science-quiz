package com.example.cosminbaciu.kahoot;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cosminbaciu.kahoot.network.ItemParser;
import com.example.cosminbaciu.kahoot.network.Test;
import com.example.cosminbaciu.kahoot.network.fetchData;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class ProfMenuActivity extends AbstractActivity {

    Button changePassword;
    Button addTest;
    Button showTests;
    Button jsondata;
    Switch profLogOut;

    List<Test> listaTeste;
    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prof_menu_activity);

        addTest = findViewById(R.id.button5);
        showTests = findViewById(R.id.button6);
        changePassword = findViewById(R.id.button4);
        jsondata = findViewById(R.id.button9);

        addTest.setOnClickListener(addTest());
        showTests.setOnClickListener(showTests());
        changePassword.setOnClickListener(changePassword());
        jsondata = (Button) findViewById(R.id.button9);
        data = findViewById(R.id.textView7);
        jsondata.setOnClickListener(showJson());


        profLogOut =findViewById(R.id.prof_switch_login);
        profLogOut.setOnCheckedChangeListener(isLogin());

        fetchData process = new fetchData();
        process.execute();



    }

    private CompoundButton.OnCheckedChangeListener isLogin() {
        return new Switch.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(profLogOut.isChecked()){
                    Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
    }

    private View.OnClickListener changePassword() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ChangePasswordActivity.class);
                startActivity(intent);

            }
        };
    }

    private View.OnClickListener addTest() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),AddTestActivity.class);
                startActivity(intent);

            }
        };
    }

    private View.OnClickListener showTests() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ShowTestsActivity.class);

                intent.putExtra(getString(R.string.json), data.getText().toString());
                startActivity(intent);

            }
        };
    }

    private View.OnClickListener showJson() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    JSONObject jsonObject = new JSONObject(data.getText().toString());

                    JSONArray tests = jsonObject.getJSONArray("teste");
//
//                    for(int i= 0; i< tests.length(); i++){
//                        JSONObject jsonTest = tests.getJSONObject(i);
//
//                        String numeTest = jsonTest.getString("numeTest");
//                        Integer punctajMaxim = Integer.valueOf(jsonTest.getString("punctajMaxim"));
//                        Integer nrIntrebari = Integer.valueOf(jsonTest.getString("nrIntrebari"));
//
//                        JSONArray grupeStudentiJSON = jsonTest.getJSONArray("grupeStudenti");
//
//                        for(int j=0;j< grupeStudentiJSON.length(); j++)
//                        {
//                            JSONObject jsonGrupa = grupeStudentiJSON.getJSONObject(j);
//                            String numeGrupa = jsonGrupa.getString("numeGrupa");
//                            String specializare jsonGrupa.getString("specializare");
//                            Integer nrPromovati = Integer.valueOf(jsonGrupa.getString("nrPromovati"));
//                            Integer an = Integer.valueOf(jsonGrupa.getString("an"));
//
//                            JSONArray studentiJson = jsonGrupa.getJSONArray("studenti");
//
//                            for(int k =0; k<studentiJson.length(); k++)
//                            {
//                                JSONObject jsonStudent = studentiJson.getJSONObject(k);
//                                String numeStudent = jsonStudent.getString("numeStudent");
//                                Integer notaTest = Integer.valueOf(jsonStudent.getString("nota"));
//                                String feedback = jsonStudent.getString("feedback");
//
//
//                            }
//
//
//
//
//
//                            Toast toast = Toast.makeText(getApplicationContext(), numeGrupa, Toast.LENGTH_LONG);
//                            toast.show();
//                        }
//

                    listaTeste = ItemParser.getItemListFromJsonArray(tests);

                    Toast toast = Toast.makeText(getApplicationContext(), listaTeste.toString(), Toast.LENGTH_LONG);
                    toast.show();


                    } catch (JSONException e1) {
                    e1.printStackTrace();
                }
            }
        };
    }


}
