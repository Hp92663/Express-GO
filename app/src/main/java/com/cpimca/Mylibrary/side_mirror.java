package com.cpimca.Mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class side_mirror extends AppCompatActivity {

    TextView back;

    LinearLayout DGR, SMR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side_mirror);

        back = findViewById(R.id.back);

        DGR = findViewById(R.id.DGR);
        SMR = findViewById(R.id.SMR);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(side_mirror.this, HomePage.class);
                startActivity(intent);
            }
        });



    }
}