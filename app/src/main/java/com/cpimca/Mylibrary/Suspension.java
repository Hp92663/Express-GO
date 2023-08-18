package com.cpimca.Mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Suspension extends AppCompatActivity {

    TextView back;

    LinearLayout FSAR, LRR, CS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suspension);

        back = findViewById(R.id.back);
        FSAR = findViewById(R.id.FSAR);
        LRR = findViewById(R.id.LRR);
        CS = findViewById(R.id.CS);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Suspension.this, HomePage.class);
                startActivity(intent);
            }
        });

        FSAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Suspension.this, front_shock.class);
                startActivity(intent);
            }
        });

        LRR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Suspension.this, link_road.class);
                startActivity(intent);
            }
        });

        CS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Suspension.this, complete_suspension.class);
                startActivity(intent);
            }
        });


    }
}