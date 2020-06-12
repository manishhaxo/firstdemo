package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class in1 extends AppCompatActivity {
    EditText e1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in1);
        e1=findViewById(R.id.ed1);
        b1=findViewById(R.id.bt1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=(e1.getText()).toString();

                Intent i=new Intent(getApplicationContext(),in2.class);
                i.putExtra("text",a);
                i.putExtra("as","hello");
                startActivity(i);

            }
        });

    }
}
