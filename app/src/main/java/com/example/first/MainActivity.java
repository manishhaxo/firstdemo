package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     EditText ee;
     Editable a;
     Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
b=(Button)findViewById(R.id.b);

b.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

//    LayoutInflater li=getLayoutInflater();
//        View layout=li.inflate(R.layout.cst,(ViewGroup)findViewById(R.id.ll));
//
//        Toast toast=new Toast(MainActivity.this);
//        toast.setDuration(Toast.LENGTH_LONG);
//        toast.setGravity(Gravity.CENTER,0,0);
//        toast.setView(layout);
//        toast.setText("Custom_Layout");
//        toast.show();

        Intent i=new Intent(MainActivity.this,two.class);
        i.putExtra("key","value");
        startActivity(i);

//        startActivity(new Intent(getApplicationContext(),two.class));
    }
});

//        ee=findViewById(R.id.e1);
//         a=ee.getText();
//
//
//               Toast.makeText(getApplicationContext(),a,Toast.LENGTH_LONG).show();



    }
}