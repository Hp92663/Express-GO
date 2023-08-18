package com.cpimca.Mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class battery extends AppCompatActivity {

    LinearLayout amaron_battery, exide_battery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery);

        amaron_battery = findViewById(R.id.amaron_battery);
        exide_battery = findViewById(R.id.exide_battery);

        amaron_battery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(battery.this, com.cpimca.Mylibrary.amaron_battery.class);
                startActivity(intent);
            }
        });

        exide_battery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(battery.this, com.cpimca.Mylibrary.exide_battery.class);
                startActivity(intent);
            }
        });

    }
}