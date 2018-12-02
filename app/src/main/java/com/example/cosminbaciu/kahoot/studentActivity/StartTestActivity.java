package com.example.cosminbaciu.kahoot.studentActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cosminbaciu.kahoot.R;

public class StartTestActivity extends AppCompatActivity {
       TextView tvWelcome;
       TextView tvReady;
       Button buttonStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_test);
        init();
    }

    private void init() {
      tvWelcome =findViewById(R.id.textView_welcome);
      tvWelcome.setText(getString(R.string.welcome)+" "+ getIntent().getExtras().getString(getString(R.string.nickname)) + " !");
      tvReady =findViewById(R.id.textView_ready);
      buttonStart =findViewById(R.id.button_start_test);
      buttonStart.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent1 = new Intent(getApplicationContext(), TestPageActivity.class);
              startActivity(intent1);
              for(int i=3;i>=1;i--) {
                  Intent intent=new Intent(getApplicationContext(),QuestionActivity.class);
                  intent.putExtra(getString(R.string.no_question), String.valueOf(i));
                  startActivity(intent);
              }
          }
      });

    }


}
