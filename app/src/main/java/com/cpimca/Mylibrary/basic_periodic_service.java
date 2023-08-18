package com.cpimca.Mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class basic_periodic_service extends AppCompatActivity {

    AppCompatButton basic_service;
    String name,email;
    Integer tob;

    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    DatabaseReference reference = firebaseDatabase.getReference("Order");
    DatabaseReference two = reference.child("Periodic Service");



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_periodic_service);


        basic_service = findViewById(R.id.basic_service);

        name = getIntent().getStringExtra("name");
        email = getIntent().getStringExtra("email");




        basic_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(basic_periodic_service.this, goto_success.class);
                String rs = "6999";
                String value = " Basic Service";
                intent.putExtra("value", value);
                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("ruppes", rs);
                startActivity(intent);

            }
        });
    }
}
