package com.example.cosminbaciu.kahoot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.nio.charset.Charset;
import java.util.Random;

public class GenerateRoomCodeActivity extends AbstractActivity {

    Button generate;
    TextView code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.generate_room_code_activity);
        initComponent();
        generate.setOnClickListener(generate());
    }

    void initComponent(){
        generate = findViewById(R.id.button7);
        code = findViewById(R.id.textView4);
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
}
