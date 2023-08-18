package com.cpimca.Mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ac_services extends AppCompatActivity {

    LinearLayout regular_ac, high_ac, cooling_coil;
    TextView back, animation;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac_services);

        regular_ac = findViewById(R.id.regular_ac);
        high_ac = findViewById(R.id.high_ac);
        cooling_coil = findViewById(R.id.cooling_coil);

        back = findViewById(R.id.back);
        animation = findViewById(R.id.animation);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ac_services.this, HomePage.class);
                startActivity(intent);
            }
        });

        animation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ac_services.this, goto_success.class);
                startActivity(intent);
            }
        });

        regular_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ac_services.this, regular_ac.class);
                startActivity(intent);
            }
        });

        high_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ac_services.this, high_perform_ac.class);
                startActivity(intent);
            }
        });

        cooling_coil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ac_services.this, cooling_coil.class);
                startActivity(intent);
            }
        });
    }
}