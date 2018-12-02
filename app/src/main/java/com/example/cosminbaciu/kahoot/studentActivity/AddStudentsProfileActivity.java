package com.example.cosminbaciu.kahoot.studentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.cosminbaciu.kahoot.login.MainActivity;
import com.example.cosminbaciu.kahoot.R;

public class AddStudentsProfileActivity extends AppCompatActivity {
    TextInputEditText tieFirstName;
    TextInputEditText tieLastName;
    TextInputEditText tieGrupa;
    TextInputEditText tieEmail;
    TextInputEditText tiePassword;
    TextInputEditText tiePassword2;
    Spinner spnSerie;
    Button addStudents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_students_profile);
        init();
    }

    private void init() {
        tieFirstName = findViewById(R.id.student_Fname_tie);
        tieLastName = findViewById(R.id.student_Lname_tie);
        tieGrupa = findViewById(R.id.student_grupa_tie);
        tieEmail = findViewById(R.id.student_email_tie);
        tiePassword = findViewById(R.id.student_password);
        tiePassword2 = findViewById(R.id.student_password_2);

        spnSerie = findViewById(R.id.student_seria_tie);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.select_serie, R.layout.support_simple_spinner_dropdown_item);
        spnSerie.setAdapter(adapter);
        addStudents = findViewById(R.id.student_add);
        addStudents.setOnClickListener(Add());
    }

    private View.OnClickListener Add() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isValid()) {
                    Toast.makeText(getApplicationContext(), getString(R.string.student_adaugat), Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }
            }
        };
    }


        private boolean isValid() {
            if (tieFirstName.getText() == null || tieFirstName.getText().toString().trim().isEmpty()) {
                Toast.makeText(getApplicationContext(), getString(R.string.student_first_name_valid_error), Toast.LENGTH_LONG).show();
                return false;
            } else if (tieLastName.getText() == null || tieLastName.getText().toString().trim().isEmpty()) {
                Toast.makeText(getApplicationContext(), getString(R.string.student_last_name_valid_error), Toast.LENGTH_LONG).show();
                return false;
            } else if (tieGrupa.getText() == null || tieGrupa.getText().toString().trim().isEmpty()) {
                Toast.makeText(getApplicationContext(), getString(R.string.student_grupa_valid_error), Toast.LENGTH_LONG).show();
                return false;
            } else if (tieEmail.getText() == null || tieEmail.getText().toString().trim().isEmpty()) {
                Toast.makeText(getApplicationContext(), getString(R.string.student_email_valid_error), Toast.LENGTH_LONG).show();
                return false;
            } else if(!Patterns.EMAIL_ADDRESS.matcher(tieEmail.getText().toString()).matches()){
                Toast.makeText(getApplicationContext(),getString(R.string.student_email_format_valid_error),Toast.LENGTH_LONG).show();
                return false;
            } else if (tiePassword.getText() == null || tiePassword.getText().toString().trim().isEmpty()) {
                Toast.makeText(getApplicationContext(), getString(R.string.student_password_valid_error), Toast.LENGTH_LONG).show();
                return false;
            } else if (tiePassword2.getText() == null || tiePassword2.getText().toString().trim().isEmpty()) {
                Toast.makeText(getApplicationContext(), getString(R.string.student_repassword_valid_error), Toast.LENGTH_LONG).show();
                return false;
            }
            else if (!tiePassword.getText().toString().trim().equals(tiePassword2.getText().toString().trim())) {
                Toast.makeText(getApplicationContext(), getString(R.string.student_passwords_valid_error), Toast.LENGTH_LONG).show();
                return false;
            }
            else return true;
         };
        }


