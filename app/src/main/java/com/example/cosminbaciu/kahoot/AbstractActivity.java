package com.example.cosminbaciu.kahoot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class AbstractActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;

        switch (item.getItemId()) {
            case R.id.add_test:
                intent = new Intent(getApplicationContext(), AddTestActivity.class);
                break;
            default:
                intent = null;
        }
        if (intent != null) {
            startActivity(intent);
        }
        
        return true;
    }

}
