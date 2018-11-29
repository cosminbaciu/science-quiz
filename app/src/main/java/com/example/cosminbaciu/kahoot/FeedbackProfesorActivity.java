package com.example.cosminbaciu.kahoot;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FeedbackProfesorActivity extends AppCompatActivity {

    private Button btnSendFeedback;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trimitere_feedback_profesor);
        initComponents();

        btnSendFeedback.setOnClickListener(back());
    }

    private void initComponents() {

        TextInputEditText numeStudent = findViewById(R.id.feedback_profesor_til_numestudent);
        TextInputEditText grupa = findViewById(R.id.feedback_profesor_til_grupa);
        btnSendFeedback=findViewById(R.id.feedback_profesor_btn_sendfeedback);


    }

    private View.OnClickListener back() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), NoteListActivity.class));
            }
        };
    }
}
