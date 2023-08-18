package com.cpimca.Mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class complete_wheel_care extends AppCompatActivity {

    AppCompatButton add;
    String name,email;
    Integer tob;


    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference reference = database.getReference("Order");
    DatabaseReference two = reference.child("Brake");


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_wheel_care);


        add = findViewById(R.id.add);

        name = getIntent().getStringExtra("name");
        email = getIntent().getStringExtra("email");




        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(complete_wheel_care.this, goto_success.class);
                String rs = "2999";
                String value = "Complete Wheel Care";
                intent.putExtra("value", value);
                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("ruppes", rs);
                startActivity(intent);

            }
        });
    }
}
