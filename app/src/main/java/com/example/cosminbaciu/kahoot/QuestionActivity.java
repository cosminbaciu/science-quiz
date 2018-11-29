package com.example.cosminbaciu.kahoot;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuestionActivity extends AbstractActivity {

    TextView timer;

    TextView question;
    RadioButton variantaA;
    RadioButton variantaB;
    RadioButton variantaC;
    RadioButton variantaD;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_activity);
        init();
            question.setText(getString(R.string.intrebare) + getIntent().getExtras().getString(getString(R.string.no_question)));
            variantaA.setText(getString(R.string.varianta_a));
            variantaB.setText(getString(R.string.varianta_b));
            variantaC.setText(getString(R.string.varianta_c));
            variantaD.setText(getString(R.string.varianta_d));
            new CountDownTimer(10000, 1000) {
                public void onTick(long millisUntilFinished) {
                    timer.setText(getString(R.string.seconds_remaining) + millisUntilFinished / 1000);
                }

                public void onFinish() {
                    finish();
                }
            }.start();

    }

    private void init(){

        timer = findViewById(R.id.timer);
        question = findViewById(R.id.textView5);
        variantaA = findViewById(R.id.radioButton);
        variantaB = findViewById(R.id.radioButton2);
        variantaC = findViewById(R.id.radioButton3);
        variantaD = findViewById(R.id.radioButton4);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        return  true;
    }

}
