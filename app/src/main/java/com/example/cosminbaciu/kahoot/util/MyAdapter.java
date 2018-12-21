package com.example.cosminbaciu.kahoot.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.cosminbaciu.kahoot.R;
import com.example.cosminbaciu.kahoot.network.Test;
import com.example.cosminbaciu.kahoot.studentActivity.VizualizareFeedbackActivity;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends BaseAdapter  {
    public List<Teste> lista;//lista de iteme
     Activity context;

    public MyAdapter(List<Teste> list, Activity context) {
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
            listViewHolder.tvPromovare = row.findViewById(R.id.adapterDate);
            row.setTag(listViewHolder);//
        }
        else{
            row=convertView;
            listViewHolder= (ListViewHolder) row.getTag();//
        }
        final Teste tests= (Teste) getItem(position);//item-ul de pe pozitia respectiva
        listViewHolder.tvTestName.setText(tests.getName());//setam numele testului
        listViewHolder.tvPromovare.setText(String.valueOf(tests.getPromoteLevel()));
        listViewHolder.btnItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,VizualizareFeedbackActivity.class);
                context.startActivity(intent);
                context.finish();
            }
        });
            return row;
        }



    }



