package com.example.cosminbaciu.kahoot;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Button;

public class FeedbackStudentActivity extends AbstractActivity {

    TextInputLayout tieNumeProfesor;
    TextInputLayout tieGrupa;
    TextInputLayout tieFeedbackText;
    Button btnSend;
    Button btnInapoi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trimitere_feedback_student);
        initComponents();

        btnInapoi.setOnClickListener(back());
    }

    private void initComponents() {

        tieNumeProfesor=findViewById(R.id.feedback_student_nume_profesor_til);
        tieGrupa=findViewById(R.id.feedbackstudent_grupa_til);
        tieFeedbackText=findViewById(R.id.feedbackstudent_text_til);
        btnSend =findViewById(R.id.feedbackstudent_btn_save);
        btnInapoi =findViewById(R.id.feedbackstudent_btn_inapoi);


    }

    private View.OnClickListener back() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), StudentsMarks.class));
            }
        };
    }
}
