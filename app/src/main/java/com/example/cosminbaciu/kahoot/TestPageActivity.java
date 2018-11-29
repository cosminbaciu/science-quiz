package com.example.cosminbaciu.kahoot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TestPageActivity extends AppCompatActivity {

     TextView score, passingScore;
     Button feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_page);

        score = (TextView) findViewById(R.id.score);
        passingScore =(TextView) findViewById(R.id.passing_score);
        feedback=findViewById(R.id.button8);

        if(Integer.parseInt(score.getText().toString())>=Integer.parseInt((passingScore.getText().toString())))
        {
            Toast.makeText(this, getString(R.string.felicitari), Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, getString(R.string.picat), Toast.LENGTH_LONG).show();
        }


        feedback.setOnClickListener(sendFeedback());
    }

    private View.OnClickListener sendFeedback() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),FeedbackProfesorActivity.class);
                startActivity(intent);
            }
        };
    }


}
