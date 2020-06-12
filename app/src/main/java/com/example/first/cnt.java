package com.example.first;


import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class cnt extends AppCompatActivity implements cntt {
    ListView lv;
    String cont[]={"Aman","Amandeep","Devang","vikram"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cnt);

        lv=findViewById(R.id.clv);

        ArrayAdapter <String> ad=new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,cont);
        lv.setAdapter(ad);

        registerForContextMenu(lv);
    }

    @Override
    public  void onCreateContextMenu(ContextMenu menu, View v, Context context)
    {
        super.onCreateContextMenu(menu, v, (ContextMenu.ContextMenuInfo) context);

        getMenuInflater().inflate(R.menu.cntmenu,menu);
        menu.setHeaderIcon(R.drawable.cal);
        menu.setHeaderTitle("contact via");


    }

    @Override
    public boolean onContextItemSelected(@org.jetbrains.annotations.NotNull MenuItem item)
    {
        if(item.getItemId() == R.id.call){
            Toast.makeText(this, "CALL", Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId()==R.id.sms){
            Toast.makeText(this, "SMS", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "nothing", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

}
