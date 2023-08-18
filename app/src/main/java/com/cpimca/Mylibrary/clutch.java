package com.cpimca.Mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class clutch extends AppCompatActivity {

    TextView back;

    LinearLayout FT, CO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clutch);

        back = findViewById(R.id.back);

        FT = findViewById(R.id.FT);
        CO = findViewById(R.id.CO);

       back.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(clutch.this, HomePage.class);
               startActivity(intent);
           }
       });


        FT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(clutch.this, fly_wheel.class);
                startActivity(intent);
            }
        });


        CO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(clutch.this, clutch_overhaul.class);
                startActivity(intent);
            }
        });

    }
}