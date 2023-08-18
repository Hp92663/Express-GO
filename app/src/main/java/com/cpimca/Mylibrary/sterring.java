package com.cpimca.Mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class sterring extends AppCompatActivity {

    TextView back;

    LinearLayout eps, rac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sterring);

        back = findViewById(R.id.back);

        eps = findViewById(R.id.eps);
        rac = findViewById(R.id.rac);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sterring.this, HomePage.class);
                startActivity(intent);
            }
        });


        eps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sterring.this, EPS_module.class);
                startActivity(intent);
            }
        });


        rac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sterring.this, sterring_rack.class);
                startActivity(intent);
            }
        });


    }
}