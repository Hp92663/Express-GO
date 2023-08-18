package com.cpimca.Mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class tyres extends AppCompatActivity {

    TextView back;
    LinearLayout AAH,YGA, CWC;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tyres);

        back = findViewById(R.id.back);

        AAH = findViewById(R.id.AAH);
        YGA = findViewById(R.id.YGA);
        CWC = findViewById(R.id.CWC);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tyres.this, HomePage.class);
                startActivity(intent);
            }
        });

        AAH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tyres.this, apollo_tyre.class);
                startActivity(intent);
            }
        });

        YGA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tyres.this, yokohama_tyre.class);
                startActivity(intent);
            }
        });

        CWC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tyres.this, complete_wheel_care.class);
                startActivity(intent);
            }
        });





    }
}