package com.cpimca.Mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class standard_periodic_services extends AppCompatActivity {

    TextView back;

    AppCompatButton standard_service;

    String name,email;
    Integer tob;

    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    DatabaseReference reference = firebaseDatabase.getReference("Order");
    DatabaseReference two = reference.child("Periodic Service");

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard_periodic_services);

        back = findViewById(R.id.back);

        standard_service = findViewById(R.id.standard_service);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(standard_periodic_services.this, period_service.class);
                startActivity(intent);
            }
        });

        name = getIntent().getStringExtra("name");
        email = getIntent().getStringExtra("email");




        standard_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(standard_periodic_services.this, goto_success.class);
                String rs = "9999";
                String value = "Standard Service";
                intent.putExtra("value", value);
                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("ruppes", rs);
                startActivity(intent);

            }
        });

    }
}