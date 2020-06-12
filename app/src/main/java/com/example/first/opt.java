package com.example.first;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class opt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opt);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
    public boolean onCreateOptionsMenu(Menu menu)

    {
        getMenuInflater().inflate(R.menu.menu,menu);
        return  true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id=item.getItemId();
        switch (id)
        {
            case R.id.i1:
                Toast.makeText(this, "item 1"+id, Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.i2:
                Toast.makeText(this, "item 2"+id, Toast.LENGTH_SHORT).show();
                return  true;

                default:
                    return super.onOptionsItemSelected(item);

        }

    }

}
