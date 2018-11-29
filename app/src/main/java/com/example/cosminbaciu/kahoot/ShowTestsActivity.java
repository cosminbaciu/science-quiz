package com.example.cosminbaciu.kahoot;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ShowTestsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afisare_teste);

        String[] names = {getString(R.string.DAM), getString(R.string.POO), getString(R.string.RETELE), getString(R.string.JAVA)};
        Button[] buttons = new Button[names.length];
        for (int i = 0; i < names.length; i++) {
            Button button = new Button(this);
            button.setId(i + 1);
            button.setText(names[i]);
            button.setY(i*150);
            buttons[i] = button;
        }

        ConstraintLayout layout = findViewById(R.id.linearLayout2);
        for (int i = 0; i < names.length; i++) {
            layout.addView(buttons[i]);
        }


        for (int i = 0; i < names.length; i++) {
            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), GroupsActivity.class);
                    startActivity(intent);
                }
            });

        }
    }
}
