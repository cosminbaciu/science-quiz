package com.example.cosminbaciu.kahoot;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class VizualizareFeedbackActivity extends AppCompatActivity {

    private TextView rezultatTestTitlu;
    private TextView rezultatTest;
    private Button btnInapoi;

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
