package com.example.cosminbaciu.kahoot.profesorActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cosminbaciu.kahoot.login.MainActivity;
import com.example.cosminbaciu.kahoot.R;

public class ProfessorActivity extends AppCompatActivity {

    private EditText fname, lname, inputEmail, inputPassword, inputConfirmation;
    private Button btnRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prof_register);

        fname = (EditText)findViewById(R.id.fname);
        lname = (EditText)findViewById(R.id.lname);
        inputEmail = (EditText) findViewById(R.id.input_email);
        inputPassword = (EditText) findViewById(R.id.input_password);
        inputConfirmation = (EditText) findViewById(R.id.input_confirm);

        btnRegister = (Button) findViewById(R.id.button);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitForm(fname.getText().toString(), lname.getText().toString(), inputEmail.getText().toString(), inputPassword.getText().toString(), inputConfirmation.getText().toString());
            }
        });
    }

    private void submitForm(String first, String last, String email, String pass, String pass2)
    {
        if(first.isEmpty() || last.isEmpty() || email.isEmpty() || pass.isEmpty() || pass2.isEmpty() ) {
            Toast.makeText(this, R.string.mandatory, Toast.LENGTH_SHORT).show();
        }
        else
        {
            if(!(pass.equals(pass2)))
            {
                Toast.makeText(this, R.string.not_match, Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(this, R.string.registered, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        }
        }
    
}
