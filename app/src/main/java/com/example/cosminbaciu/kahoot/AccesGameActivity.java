package com.example.cosminbaciu.kahoot;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AccesGameActivity extends AppCompatActivity {
  TextInputEditText codeAcces;
  static TextInputEditText nickname;
   Button accesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acces_game);
        init();
    }

    private void init(){
        codeAcces =findViewById(R.id.acces_game_code);
        nickname=findViewById(R.id.acces_game_nickname);
        accesButton =findViewById(R.id.acces_button_open);
        accesButton.setOnClickListener(addInSession());
    }

    private View.OnClickListener addInSession(){
        return new View.OnClickListener(){

            @Override
            public void onClick(View v) {
               if(isValid()){
                   Intent intent = new Intent(getApplicationContext(), StartTestActivity.class);
                   startActivity(intent);
               }
            }
        };
    }

    public boolean isValid(){
        if(codeAcces.getText()==null|| codeAcces.getText().toString().trim().isEmpty()){
            Toast.makeText(getApplicationContext(),getString(R.string.acces_code_valid_error),Toast.LENGTH_LONG).show();
            return false;
        }
        else if(!codeAcces.getText().toString().equals("0000")){
            Toast.makeText(getApplicationContext(),getString(R.string.acces_code_format_valid_error),Toast.LENGTH_LONG).show();
            return false;
        }
        else if(nickname.getText()==null||nickname.getText().toString().trim().isEmpty()){
            Toast.makeText(getApplicationContext(),getString(R.string.acces_nickname_valid_error),Toast.LENGTH_LONG).show();
            return false;
        }
        else return true;
    }


}
