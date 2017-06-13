package com.example.nikhil.blowout;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class progress extends AppCompatActivity {
    static int count=0;
    Button B1;
    TextView T1,T2,T3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        B1=(Button)findViewById(R.id.B1);
        T1=(TextView)findViewById(R.id.t1);
        T2=(TextView)findViewById(R.id.t2);
        T3=(TextView)findViewById(R.id.t3);
    }

    public void onB1Click(View v)
    {

        SharedPreferences.Editor editor = getPreferences(MODE_PRIVATE).edit();
        int defaultValue = getPreferences(MODE_PRIVATE).getInt("count_key",count);
        ++defaultValue;
        getPreferences(MODE_PRIVATE).edit().putInt("count_key",defaultValue).commit();
        count = getPreferences(MODE_PRIVATE).getInt("count_key",count);
        T1.setText("Number of cigarettes smoked:  "+Integer.toString(count));
        T2.setText("Money spent (wasted):  "+Integer.toString(count*13)+" rupees");
        T3.setText("Life span reduced:   "+Integer.toString(count*2)+" minutes");

    }
















}
