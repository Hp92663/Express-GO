package com.cpimca.Mylibrary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class front_brake extends AppCompatActivity {

    String name,email;
    Integer tob;

    AppCompatButton brake1;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference reference = database.getReference("Order");
    DatabaseReference two = reference.child("Brake");



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_brake);


        brake1 = findViewById(R.id.brake1);

        name = getIntent().getStringExtra("name");
        email = getIntent().getStringExtra("email");




        brake1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent = new Intent(front_brake.this, goto_success.class);
                    String rs = "6999";
                    String value = "Basic Periodic Service";
                    intent.putExtra("value", value);
                    intent.putExtra("name", name);
                    intent.putExtra("email", email);
                    intent.putExtra("ruppes", rs);
                    startActivity(intent);

            }
        });
    }
}
