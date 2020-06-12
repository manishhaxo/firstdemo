package com.example.first;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class mailinte extends AppCompatActivity {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mailinte);
        b=findViewById(R.id.mi);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("message/rfc822");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"contact@tutorialspoint.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Welcome to tutorialspoint.com");
                startActivity(Intent.createChooser(intent, "Choose default Mail App"));


            }
        });



    }
}
