package com.cpimca.Mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class EPS_module extends AppCompatActivity {

    String name,email;
    Integer tob;

    AppCompatButton ESP_module;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference reference = database.getReference("Order");
    DatabaseReference two = reference.child("Steering");



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eps_module);


        ESP_module = findViewById(R.id.ESP_module);

        name = getIntent().getStringExtra("name");
        email = getIntent().getStringExtra("email");




        ESP_module.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(EPS_module.this, goto_success.class);
                String rs = "12000";
                String value = "EPS module Repair";
                intent.putExtra("value", value);
                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("ruppes", rs);
                startActivity(intent);

            }
        });
    }
}
