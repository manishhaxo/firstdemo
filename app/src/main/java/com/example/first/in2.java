package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class in2 extends AppCompatActivity {
    TextView t;
    Button b2;
    CheckBox c1,c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in2);
        t=findViewById(R.id.t1);
        b2=findViewById(R.id.bt2);
        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);

    b2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Boolean Cbs=c1.isChecked();
            Boolean cb=c2.isChecked();

            String a=Cbs.toString();
            String b=cb.toString();

            Toast.makeText(in2.this, "one :"+a+"two :"+b, Toast.LENGTH_SHORT).show();
        }
    });



//         Intent i=getIntent();
//        String msg=i.getStringExtra("text");
//        String ms=i.getStringExtra("as");
//        t.setText(ms+" "+msg);


    }
}
