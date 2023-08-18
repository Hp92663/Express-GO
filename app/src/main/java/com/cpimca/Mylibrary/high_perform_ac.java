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

public class high_perform_ac extends AppCompatActivity {

    TextView back;

    AppCompatButton add;
    String name,email;
    Integer tob;


    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference reference = database.getReference("Order");
    DatabaseReference two = reference.child("AC");
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_perform);

        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(high_perform_ac.this,ac_services.class);
                startActivity(intent);
            }
        });


        add = findViewById(R.id.add);

        name = getIntent().getStringExtra("name");
        email = getIntent().getStringExtra("email");


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(high_perform_ac.this, goto_success.class);
                String rs = "9799";
                String value = "High Perform AC ";
                intent.putExtra("value", value);
                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("ruppes", rs);
                startActivity(intent);

            }
        });

    }
}