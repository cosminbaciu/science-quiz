package com.example.cosminbaciu.kahoot.studentActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.cosminbaciu.kahoot.R;
import com.example.cosminbaciu.kahoot.database.DatabaseRepository;
import com.example.cosminbaciu.kahoot.network.Test;
import com.example.cosminbaciu.kahoot.util.Item;
import com.example.cosminbaciu.kahoot.util.MyAdapter;
import com.example.cosminbaciu.kahoot.util.Teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class NoteListActivity extends AppCompatActivity {

   private ListView listView;
   private MyAdapter adapter;
   List<Teste> teste=new ArrayList<>();

//   @SuppressLint("SimpleDateFormat")
//   SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy");

   DatabaseRepository repository=new DatabaseRepository(this);
   
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
        adapter=new MyAdapter(teste,this);
        listView.setAdapter(adapter);
      
    }


    private void getItems() throws ParseException {
        repository.open();
        teste=repository.findAllTesteStud();


//        items.add(new Item(getString(R.string.test1),  simpleDateFormat.parse("10-10-2018")));
//        items.add(new Item(getString(R.string.test2),  simpleDateFormat.parse("10-10-2018")));
//        items.add(new Item(getString(R.string.test3),  simpleDateFormat.parse("10-10-2018")));
//        items.add(new Item(getString(R.string.test4),  simpleDateFormat.parse("10-10-2018")));
//        items.add(new Item(getString(R.string.test5),  simpleDateFormat.parse("10-10-2018")));
//        items.add(new Item(getString(R.string.test6),  simpleDateFormat.parse("10-10-2018")));
//        items.add(new Item(getString(R.string.test7),  simpleDateFormat.parse("10-10-2018")));
//        items.add(new Item(getString(R.string.test8),  simpleDateFormat.parse("10-10-2018")));

        repository.close();
    }


}
