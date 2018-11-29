package com.example.cosminbaciu.kahoot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class GroupsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupe);

        String[] names = {getString(R.string._1060),getString(R.string._1061),getString(R.string._1062), getString(R.string._1063), getString(R.string._1064)};
        Button[] buttons = new Button[names.length];
        for (int i = 0; i < names.length; i++) {
            Button button = new Button(this);
            button.setId(i+1);
            button.setText(names[i]);
            button.setY(i*150);
            buttons[i] = button;
        }

        LinearLayout layout = (LinearLayout)findViewById(R.id.linearLayout);
        for (int i = 0; i < names.length; i++) {
            layout.addView(buttons[i]);
        }
        for (int i = 0; i < names.length; i++) {
            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), StudentsMarks.class);
                    startActivity(intent);
                }
            });

        }

    }
}
