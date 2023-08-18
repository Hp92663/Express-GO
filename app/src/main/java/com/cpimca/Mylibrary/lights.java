package com.cpimca.Mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class lights extends AppCompatActivity {

    TextView back;

    LinearLayout FH, RT, FL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lights);

        back = findViewById(R.id.back);

        FH = findViewById(R.id.FH);
        RT = findViewById(R.id.RT);
        FL = findViewById(R.id.FL);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lights.this, front_headlight.class);
                startActivity(intent);
            }
        });

        FH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lights.this, rear_taillight.class);
                startActivity(intent);
            }
        });

        RT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lights.this, fog_light.class);
                startActivity(intent);
            }
        });

        FL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lights.this, HomePage.class);
                startActivity(intent);
            }
        });


    }
}