package com.cpimca.Mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button  btnUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // btnAdmin = findViewById(R.id.btn_admin);
        btnUser = findViewById(R.id.btn_user);

        //btnAdmin.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
                // Code for admin button click
              //  Intent intent = new Intent(MainActivity.this , AdminActivity.class);
                //startActivity(intent);            }
    //    });

        btnUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for user button click
                Intent intent = new Intent(MainActivity.this , UserActivity.class);
                startActivity(intent);            }
        });
    }
}
