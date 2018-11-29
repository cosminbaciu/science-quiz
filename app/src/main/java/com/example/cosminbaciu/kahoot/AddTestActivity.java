package com.example.cosminbaciu.kahoot;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class AddTestActivity extends AbstractActivity {

    EditText maxPoints;
    EditText promoteRequirements;
    EditText numberOfQuestions;
    Spinner spinner;
    Button button;
    Button viewTest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_test_activity);
        initComponent();
    }

    private void initComponent(){

        maxPoints = findViewById(R.id.editText2);
        promoteRequirements = findViewById(R.id.editText4);
        numberOfQuestions = findViewById(R.id.numberOfQuestion);
        spinner = findViewById(R.id.spinner);
        button = findViewById(R.id.button);
        viewTest = findViewById(R.id.button3);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.discipline_array, R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        button.setOnClickListener(saveEvent());
        viewTest.setOnClickListener(savEvent());

    }

        private View.OnClickListener saveEvent() {
            return new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                        if (isValid()) {

                        Integer it = Integer.parseInt(numberOfQuestions.getText().toString());
                        for (Integer i = 1; i <= it; i++)
                            startActivity(new Intent(getApplicationContext(), AddQuestionActivity.class));
                        }
                }
            };
        }

    private View.OnClickListener savEvent() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for(Integer i=1;i<= 2;i++)
                    startActivity(new Intent(getApplicationContext(), GenerateRoomCodeActivity.class));
            }
        };
    }


    private boolean isValid(){

        if(maxPoints.getText() == null || maxPoints.getText().toString().trim().isEmpty()){
            Toast.makeText(getApplicationContext(),  R.string.add_test_max_points_error, Toast.LENGTH_LONG).show();
            return false;
        }
        else if(promoteRequirements.getText() == null || promoteRequirements.getText().toString().trim().isEmpty()){
            Toast.makeText(getApplicationContext(),  R.string.add_test_promote_requirements_error, Toast.LENGTH_LONG).show();
            return false;
        }

        else if(numberOfQuestions.getText() == null || numberOfQuestions.getText().toString().trim().isEmpty()) {
            Toast.makeText(getApplicationContext(), R.string.add_test_number_of_questions_error, Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuItem item = menu.findItem(R.id.add_test);
        item.setVisible(false);
        return  true;
    }

}
