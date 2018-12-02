package com.example.cosminbaciu.kahoot.studentActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.cosminbaciu.kahoot.R;
import com.example.cosminbaciu.kahoot.util.Item;
import com.example.cosminbaciu.kahoot.util.MyAdapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class NoteListActivity extends AppCompatActivity {

   private ListView listView;
   private MyAdapter adapter;
   ArrayList<Item> items=new ArrayList<>();

   @SuppressLint("SimpleDateFormat")
   SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy");
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_list);
        try {
            getItems();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        listView=findViewById(R.id.note_listview);
        adapter=new MyAdapter(items,this);
        listView.setAdapter(adapter);
      
    }


    private void getItems() throws ParseException {
        items.add(new Item(getString(R.string.test1),  simpleDateFormat.parse("10-10-2018")));
        items.add(new Item(getString(R.string.test2),  simpleDateFormat.parse("10-10-2018")));
        items.add(new Item(getString(R.string.test3),  simpleDateFormat.parse("10-10-2018")));
        items.add(new Item(getString(R.string.test4),  simpleDateFormat.parse("10-10-2018")));
        items.add(new Item(getString(R.string.test5),  simpleDateFormat.parse("10-10-2018")));
        items.add(new Item(getString(R.string.test6),  simpleDateFormat.parse("10-10-2018")));
        items.add(new Item(getString(R.string.test7),  simpleDateFormat.parse("10-10-2018")));
        items.add(new Item(getString(R.string.test8),  simpleDateFormat.parse("10-10-2018")));
    }


}
