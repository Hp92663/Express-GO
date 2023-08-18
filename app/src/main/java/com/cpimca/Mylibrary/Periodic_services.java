package com.cpimca.Mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Periodic_services extends AppCompatActivity {

    TextView back;

    LinearLayout BS, SS;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periodic_services);

        back = findViewById(R.id.back);

        BS = findViewById(R.id.BS);
        SS = findViewById(R.id.SS);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Periodic_services.this, HomePage.class);
                startActivity(intent);
            }
        });


        BS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Periodic_services.this, basic_periodic_service.class);
                startActivity(intent);
            }
        });

        SS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Periodic_services.this, standard_periodic_services.class);
                startActivity(intent);
            }
        });



    }
}