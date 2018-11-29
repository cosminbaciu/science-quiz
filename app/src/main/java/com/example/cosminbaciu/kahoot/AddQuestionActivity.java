package com.example.cosminbaciu.kahoot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddQuestionActivity extends AbstractActivity {


    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_question_activity);
        init();
    }


    void init(){
        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(saveEvent());
    }

    private View.OnClickListener saveEvent() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        };
    }


}
