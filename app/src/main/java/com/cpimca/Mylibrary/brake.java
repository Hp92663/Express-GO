package com.cpimca.Mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class brake extends AppCompatActivity {

    TextView back;
    LinearLayout front_brake, rear_brake, wheel_cylinder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brake);

        back = findViewById(R.id.back);

        front_brake = findViewById(R.id.front_brake);
        rear_brake = findViewById(R.id.rear_brake);
        wheel_cylinder = findViewById(R.id.wheel_cylinder);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(brake.this, HomePage.class);
                startActivity(intent);
            }
        });

        front_brake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(brake.this, front_brake.class);
                startActivity(intent);
            }
        });

        rear_brake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(brake.this, rear_brake.class);
                startActivity(intent);
            }
        });

        wheel_cylinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(brake.this, wheel_cylinder.class);
                startActivity(intent);
            }
        });


    }
}