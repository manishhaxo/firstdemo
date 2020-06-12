package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class radioo extends AppCompatActivity {
    RadioGroup rg;
    RadioButton male,female,rs;
    ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radioo);

        rg=findViewById(R.id.rg);
        male=findViewById(R.id.male);
        female=findViewById(R.id.female);
       button =findViewById(R.id.bg);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sid=rg.getCheckedRadioButtonId();

                rs=findViewById(sid);

                Toast.makeText(radioo.this, rs.getText(), Toast.LENGTH_SHORT).show();

                

            }
        });

    }
}
