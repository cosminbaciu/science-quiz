package com.example.cosminbaciu.kahoot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AbstractActivity{

    private Button studentForm;
    private Button professorForm;
    private Button login;
    private String profName = Constants.adminEmail;
    private String profPassword = Constants.adminPassword;
    private String studentName = Constants.studEmail;
    private String studentPassword = Constants.studPassword;
    EditText login_email_pt;
    EditText login_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentForm = findViewById(R.id.login_btn_account_student);
        professorForm = findViewById(R.id.login_btn_account_profesor);
        login = findViewById(R.id.login_btn_save);
        login_email_pt = findViewById(R.id.login_email_pt);
        login_password = findViewById(R.id.login_et_password);

        login.setOnClickListener(login());


        studentForm.setOnClickListener(registerStudent());
        professorForm.setOnClickListener(registerProfessor());
    }


    private View.OnClickListener login() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (login_email_pt.getText().toString().equals(studentName) && login_password.getText().toString().equals(studentPassword))
                {
                    Intent intent=new Intent(getApplicationContext(),MainStudentActivity.class);
                    startActivity(intent);
                }

                else if (login_email_pt.getText().toString().equals(profName) && login_password.getText().toString().equals(profPassword))
                {
                    Intent intent=new Intent(getApplicationContext(),ProfMenuActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),getString(R.string.validare),Toast.LENGTH_LONG).show();
                }
            }
        };
    }



    private View.OnClickListener registerStudent() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent=new Intent(getApplicationContext(),AddStudentsProfileActivity.class);
                    startActivity(intent);

            }
        };
    }

    private View.OnClickListener registerProfessor() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent=new Intent(getApplicationContext(),ProfessorActivity.class);
                    startActivity(intent);
            }
        };
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will bla bla bla
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        super.onOptionsItemSelected(item);
        return true;
    }
}
