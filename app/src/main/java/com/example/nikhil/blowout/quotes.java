package com.example.nikhil.blowout;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class quotes extends AppCompatActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);
        mListView=(ListView) findViewById(R.id.listview);
        ArrayList<Card> list=new ArrayList<>();
        list.add(new Card("drawable://" + R.drawable.car1,"Quotes for life"));
        list.add(new Card("drawable://" + R.drawable.car2,"Quotes for life"));
        list.add(new Card("drawable://" + R.drawable.car3,"Quotes for life"));
        list.add(new Card("drawable://" + R.drawable.car4,"Quotes for life"));
        list.add(new Card("drawable://" + R.drawable.car5,"Quotes for life"));
        list.add(new Card("drawable://" + R.drawable.car6,"Quotes for life"));
        list.add(new Card("drawable://" + R.drawable.car7,"Quotes for life"));
        list.add(new Card("drawable://" + R.drawable.car8,"Quotes for life"));
        list.add(new Card("drawable://" + R.drawable.car9,"Quotes for life"));
        list.add(new Card("drawable://" + R.drawable.car10,"Quotes for life"));
        list.add(new Card("drawable://" + R.drawable.car11,"Quotes for life"));
        list.add(new Card("drawable://" + R.drawable.car12,"Quotes for life"));


        CustomListAdapter adapter = new CustomListAdapter(this,R.layout.activity_quotes,list);
        mListView.setAdapter(adapter);




    }

}
