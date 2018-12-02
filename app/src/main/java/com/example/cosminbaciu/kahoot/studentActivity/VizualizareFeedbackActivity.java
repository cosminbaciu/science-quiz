package com.example.cosminbaciu.kahoot.studentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cosminbaciu.kahoot.R;
import com.example.cosminbaciu.kahoot.profesorActivity.StudentsMarks;

public class VizualizareFeedbackActivity extends AppCompatActivity {

    private TextView rezultatTestTitlu;
    private TextView rezultatTest;
    private Button btnInapoi;
    private Button btnFeedback;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vizualizare_feedback_student);
        init();
    }

    private void init() {
        rezultatTestTitlu=findViewById(R.id.vizualizare_feedback_tie);
        rezultatTest=findViewById(R.id.vizualizare_feedback_et);
        btnInapoi=findViewById(R.id.vizualizare_feedback_btn_inapoi);
        btnInapoi.setOnClickListener(back());
        btnFeedback = findViewById(R.id.vizualizare_feedback_btn_feedback);
        btnFeedback.setOnClickListener(feedback());


    }

    private View.OnClickListener feedback() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FeedbackProfesorActivity.class);
                startActivity(intent);
                finish();

            }
        };
    }

    private View.OnClickListener back() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), NoteListActivity.class));
                finish();
            }
        };
    }

}
