package com.example.nikhil.blowout;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;

import com.example.nikhil.blowout.R;
import com.example.nikhil.blowout.model.DataItem;
import com.example.nikhil.blowout.sample.SampleDataProvider;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.RecyclerView;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.ListView;
        import android.widget.Toast;

public class tips extends AppCompatActivity {


    List<DataItem> dataItemList = SampleDataProvider.dataItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        Collections.sort(dataItemList, new Comparator<DataItem>() {
            @Override
            public int compare(DataItem o1, DataItem o2) {
                return o1.getItemName().compareTo(o2.getItemName());
            }
        });

        DataItemAdapter adapter = new DataItemAdapter(this, dataItemList);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvItems);
        recyclerView.setAdapter(adapter);
    }


}
