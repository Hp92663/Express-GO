package com.cpimca.Mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class fail_payment extends AppCompatActivity {

    TextView cancel;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fail_payment);

        cancel = findViewById(R.id.canceltext);

        String can = getIntent().getStringExtra("name");

        cancel.setText("Sorry "+can+" Your booking is fail try again");
    }
}