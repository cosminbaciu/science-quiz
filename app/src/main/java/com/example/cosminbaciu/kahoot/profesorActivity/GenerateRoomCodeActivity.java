package com.example.cosminbaciu.kahoot.profesorActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cosminbaciu.kahoot.AbstractActivity;
import com.example.cosminbaciu.kahoot.R;

import java.util.Random;

public class GenerateRoomCodeActivity extends AbstractActivity {

    Button generate;
    TextView code;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.generate_room_code_activity);
        initComponent();
        generate.setOnClickListener(generate());
        back.setOnClickListener(back());
    }

    void initComponent(){
        generate = findViewById(R.id.button7);
        code = findViewById(R.id.textView4);
        back = findViewById(R.id.button10);
    }

    private View.OnClickListener generate() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char[] chars1 = getString(R.string.cod_acess).toCharArray();
                StringBuilder sb1 = new StringBuilder();
                Random random1 = new Random();
                for (int i = 0; i < 6; i++)
                {
                    char c1 = chars1[random1.nextInt(chars1.length)];
                    sb1.append(c1);
                }
                code.setText(sb1.toString());

            }
        };
    }

    private View.OnClickListener back() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        };
    }
}
