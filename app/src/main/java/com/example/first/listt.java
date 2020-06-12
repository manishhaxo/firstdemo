package com.example.first;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class listt extends AppCompatActivity {

    ListView lv;
    TextView tv;
    String[] litem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listt);

        lv=findViewById(R.id.lv);
        tv=findViewById(R.id.lt);

        litem=getResources().getStringArray(R.array.festivals);

        final ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1
        ,android.R.id.text1,litem);
        lv.setAdapter(adapter);

    }
}
