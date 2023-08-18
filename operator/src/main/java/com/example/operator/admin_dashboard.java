package com.example.operator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class admin_dashboard extends AppCompatActivity {

    CardView users, service,orders, create_jobcard, view_card;

    ImageView logout;

    LinearLayout logout3;
    TextView logout1;

    FirebaseAuth auth;

    FirebaseUser user;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        users = findViewById(R.id.users);
        service = findViewById(R.id.service);
        orders = findViewById(R.id.orders);
        create_jobcard = findViewById(R.id.create_jobcard);
        view_card = findViewById(R.id.view_card);
       // logout = findViewById(R.id.logout);





        users.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin_dashboard.this, user_details.class);
                startActivity(intent);
            }
        });

        service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin_dashboard.this, manage_service.class);
                startActivity(intent);
            }
        });

        orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin_dashboard.this, manage_orders.class);
                startActivity(intent);
            }
        });

        create_jobcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin_dashboard.this, job_card.class);
                startActivity(intent);
            }
        });

        view_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin_dashboard.this, jobcard_detail.class);
                startActivity(intent);
            }
        });
    }
}