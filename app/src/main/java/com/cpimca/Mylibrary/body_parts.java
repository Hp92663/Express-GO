package com.cpimca.Mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class body_parts extends AppCompatActivity {

    TextView back;

    LinearLayout front_body, rear_body, front_door_body, rear_door_body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_parts);

        back = findViewById(R.id.back);

        front_body = findViewById(R.id.front_body);
        rear_body = findViewById(R.id.rear_body);
        front_door_body = findViewById(R.id.front_door_body);
        rear_door_body = findViewById(R.id.rear_door_body);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(body_parts.this, HomePage.class);
                startActivity(intent);
            }
        });

        front_body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(body_parts.this, front_bumper.class);
                startActivity(intent);
            }
        });

        rear_body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(body_parts.this, rear_bumper.class);
                startActivity(intent);
            }
        });

        front_door_body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(body_parts.this, front_door.class);
                startActivity(intent);
            }
        });

        rear_door_body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(body_parts.this, rear_door.class);
                startActivity(intent);
            }
        });

    }
}