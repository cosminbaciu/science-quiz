package com.example.cosminbaciu.kahoot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainStudentActivity extends AppCompatActivity {
   private Button accesGame;
   private Switch accesSwitch;
   private Button mainScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_student);
        accesGame =findViewById(R.id.main_acces_gameroom);
        accesGame.setOnClickListener(AccesGame());
        accesSwitch =findViewById(R.id.main_switch_login);
        accesSwitch.setOnCheckedChangeListener(isLogin());
        mainScore =findViewById(R.id.main_score);
        mainScore.setOnClickListener(AccesScore());
    }

    private View.OnClickListener AccesScore() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),NoteListActivity.class);
                startActivity(intent);
            }
        };
    }

    private View.OnClickListener AccesGame(){
        return new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), AccesGameActivity.class);
                startActivity(intent1);
            }
        };
    }
// acest switch este pentru delogare, in momentul in care este checked ne duce la pagina de login
    private Switch.OnCheckedChangeListener isLogin(){
        return new Switch.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(accesSwitch.isChecked()){
                    Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
    }
}
