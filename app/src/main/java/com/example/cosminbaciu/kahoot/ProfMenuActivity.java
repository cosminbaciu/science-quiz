package com.example.cosminbaciu.kahoot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class ProfMenuActivity extends AbstractActivity {

    Button changePassword;
    Button addTest;
    Button showTests;
    Switch profLogOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prof_menu_activity);

        addTest = findViewById(R.id.button5);
        showTests = findViewById(R.id.button6);
        changePassword = findViewById(R.id.button4);

        addTest.setOnClickListener(addTest());
        showTests.setOnClickListener(showTests());
        changePassword.setOnClickListener(changePassword());

        profLogOut =findViewById(R.id.prof_switch_login);
        profLogOut.setOnCheckedChangeListener(isLogin());

    }

    private CompoundButton.OnCheckedChangeListener isLogin() {
        return new Switch.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(profLogOut.isChecked()){
                    Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
    }

    private View.OnClickListener changePassword() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ChangePasswordActivity.class);
                startActivity(intent);

            }
        };
    }

    private View.OnClickListener addTest() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),AddTestActivity.class);
                startActivity(intent);

            }
        };
    }

    private View.OnClickListener showTests() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ShowTestsActivity.class);
                startActivity(intent);

            }
        };
    }
}