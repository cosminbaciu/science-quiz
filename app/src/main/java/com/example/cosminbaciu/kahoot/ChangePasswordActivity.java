package com.example.cosminbaciu.kahoot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChangePasswordActivity extends AppCompatActivity {

    private EditText oldPass;
    private EditText newPass;
    private EditText newPass2;
    private Button change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_password_activity);

        oldPass = findViewById(R.id.etOld);
        newPass = findViewById(R.id.etNew);
        newPass2 = findViewById(R.id.etNew2);
        change = findViewById(R.id.btn_change);

        change.setOnClickListener(returnMenu());
    }

        private View.OnClickListener returnMenu() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isValid()) {
                    Intent intent = new Intent(getApplicationContext(), ProfMenuActivity.class);
                    startActivity(intent);
                }
            }
        };
    }

    private Boolean isValid() {
        if (oldPass.equals(newPass)) {
            Toast.makeText(ChangePasswordActivity.this, R.string.old_pass, Toast.LENGTH_SHORT).show();
            return false;}
         else if (!(newPass.equals(newPass2))) {
                Toast.makeText(ChangePasswordActivity.this, R.string.not_match, Toast.LENGTH_SHORT).show();
                return false;
            } else {
                Toast.makeText(ChangePasswordActivity.this, R.string.changed, Toast.LENGTH_SHORT).show();
                return true;
            }
        }

    }


