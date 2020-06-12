package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class order extends AppCompatActivity {
CheckBox c1,c2,c3;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        c1=findViewById(R.id.cf);
        c2=findViewById(R.id.t);
        c3=findViewById(R.id.i);
        b=findViewById(R.id.ob);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total_amount=0;
                StringBuilder or=new StringBuilder();

                or.append("Items selected");

                if(c1.isChecked()){
                    or.append("\n coffee 80rs");
                    total_amount+=80;
                }
                if(c2.isChecked()){
                    or.append("\n tea 40rs");
                    total_amount+=40;
                }
                if(c3.isChecked()){
                    or.append("\n Ice Cream 50rs");
                    total_amount+=50;
                }
                or.append("\n total="+total_amount);
                Toast.makeText(order.this, or.toString(), Toast.LENGTH_SHORT).show();

            }
        });

    }
}
