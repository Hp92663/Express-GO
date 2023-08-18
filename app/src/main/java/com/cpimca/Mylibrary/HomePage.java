package com.cpimca.Mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class HomePage extends AppCompatActivity {





    ImageView  logout2, goto_tyre2, goto_sterring, ac_repair, brake, cluthch, suspension, lights, side_mirror, glasees, body_parts;
    LinearLayout battery, denting,goto_tyre1, ac_repair1,profile, clutch2, periodicservice, custom_2, windshield;
    
    LinearLayout logout;

    FirebaseAuth auth;
    Button button;
    TextView textView;
    FirebaseUser user;
    TextView moreitem;
    private View LinearLayout;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

      //  logout2 = findViewById(R.id.logout2);
        battery = findViewById(R.id.battery);
        denting = findViewById(R.id.denting);
        moreitem = findViewById(R.id.moreitem);


        goto_tyre1 = findViewById(R.id.goto_tyre1);
        goto_tyre2 = findViewById(R.id.goto_tyre2);

        goto_sterring = findViewById(R.id.goto_sterring);

        ac_repair = findViewById(R.id.ac_repair);
        ac_repair1 = findViewById(R.id.ac_repair1);
        
        profile = findViewById(R.id.profile);

        brake = findViewById(R.id.brake);

        cluthch = findViewById(R.id.cluthch);
        clutch2 = findViewById(R.id.clutch2);

        suspension = findViewById(R.id.suspension);

        side_mirror = findViewById(R.id.side_mirror);

        glasees = findViewById(R.id.glasses);

        body_parts = findViewById(R.id.body_parts);

        lights = findViewById(R.id.lights);

        periodicservice = findViewById(R.id.periodicservice);

        custom_2 = findViewById(R.id.custom_2);

        windshield = findViewById(R.id.windshield);
        // more item

        moreitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, custom_service.class);
                startActivity(intent);
            }
        });

        custom_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, custom_service.class);
                startActivity(intent);
            }
        });

        //battery

        battery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, com.cpimca.Mylibrary.battery.class);
                startActivity(intent);
            }
        });

        // denting
        //battery

        denting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, com.cpimca.Mylibrary.denting.class);
                startActivity(intent);
            }
        });


        // logout
        auth = FirebaseAuth.getInstance();
        LinearLayout = findViewById(R.id.logout);
        user = auth.getCurrentUser();
        if (user == null){
            Intent intent = new Intent(getApplicationContext(), UserActivity.class);
            startActivity(intent);
            finish();
        }

        LinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext(), UserActivity.class);
                startActivity(intent);
                finish();

            }
        });

        // tyre activity

        goto_tyre1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this,tyres.class);
                startActivity(intent);
            }
        });

        goto_tyre2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this,tyres.class);
                startActivity(intent);
            }
        });

        // steering

        goto_sterring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this,sterring.class);
                startActivity(intent);
            }
        });

        // ac

        ac_repair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, ac_services.class);
                startActivity(intent);
            }
        });

        ac_repair1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, ac_services.class);
                startActivity(intent);
            }
        });
        
        // profile
        
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, Profile.class);
                startActivity(intent);
            }
        });

        // brake
        brake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, com.cpimca.Mylibrary.brake.class);
                startActivity(intent);
            }
        });

        // clutch

        cluthch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, clutch.class);
                startActivity(intent);
            }
        });

        clutch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, clutch.class);
                startActivity(intent);
            }
        });

        // suspension

        suspension.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, Suspension.class);
                startActivity(intent);
            }
        });

        // side mirror

        side_mirror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, side_mirror.class);
                startActivity(intent);
            }
        });

        // glasses

        glasees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, glasses.class);
                startActivity(intent);
            }
        });

        // body parts

        body_parts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, body_parts.class);
                startActivity(intent);
            }
        });

        // glasses

        lights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, lights.class);
                startActivity(intent);
            }
        });

        // windshield


        windshield.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, lights.class);
                startActivity(intent);
            }
        });


        // periodic service

        periodicservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, Periodic_services.class);
                startActivity(intent);
            }
        });


    }
}