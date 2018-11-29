package com.example.cosminbaciu.kahoot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NoteListActivity extends AppCompatActivity {

   private ListView listView;
   private MyAdapter adapter;
   ArrayList<Item> items=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_list);
        getItems();
        listView=findViewById(R.id.note_listview);
        adapter=new MyAdapter(items,this);
        listView.setAdapter(adapter);
      
    }

    private void getItems() {
        items.add(new Item(getString(R.string.test1)));
        items.add(new Item(getString(R.string.test2)));
        items.add(new Item(getString(R.string.test3)));
        items.add(new Item(getString(R.string.test4)));
        items.add(new Item(getString(R.string.test5)));
        items.add(new Item(getString(R.string.test6)));
        items.add(new Item(getString(R.string.test7)));
        items.add(new Item(getString(R.string.test8)));
    }


}
