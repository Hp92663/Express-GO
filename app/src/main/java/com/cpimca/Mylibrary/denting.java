
package com.cpimca.Mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class denting extends AppCompatActivity {

    LinearLayout dent_1, dent_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denting);

        dent_1 = findViewById(R.id.dent_1);
        dent_2 = findViewById(R.id.dent_2);

        dent_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(denting.this,dent1.class);
                startActivity(intent);
            }
        });

        dent_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(denting.this,dent2.class);
                startActivity(intent);
            }
        });


    }
}