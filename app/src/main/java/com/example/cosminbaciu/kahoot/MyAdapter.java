package com.example.cosminbaciu.kahoot;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter  {
    public ArrayList<Item> lista;//lista de iteme
     Activity context;

    public MyAdapter(ArrayList<Item> list, Activity context) {
        this.lista = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return lista.size();
    }
//pozitia item-ului
    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        final ListViewHolder listViewHolder;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);// view objects
            row = inflater.inflate(R.layout.item_note, null);//setam layoutul item_note ca elementele ale listview-ului
            listViewHolder=new ListViewHolder();//initializam o nou lista in care punem elementele pentru un item
            listViewHolder.tvTestName=row.findViewById(R.id.name_test);
            listViewHolder.btnItem=row.findViewById(R.id.button_item);
            listViewHolder.tvDate = row.findViewById(R.id.adapterDate);
            row.setTag(listViewHolder);//
        }
        else{
            row=convertView;
            listViewHolder= (ListViewHolder) row.getTag();//
        }
        final Item items= (Item) getItem(position);//item-ul de pe pozitia respectiva
        listViewHolder.tvTestName.setText(items.nameTest);//setam numele testului
        listViewHolder.tvDate.setText(String.valueOf(items.getDateTest()));
        listViewHolder.btnItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,VizualizareFeedbackActivity.class);
                context.startActivity(intent);
            }
        });
            return row;
        }



    }



