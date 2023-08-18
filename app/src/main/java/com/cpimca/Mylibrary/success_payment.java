package com.cpimca.Mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class success_payment extends AppCompatActivity {

    TextView name,date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_payment);

        name = findViewById(R.id.bookname);
        date = findViewById(R.id.bookdate);

        String name1 = getIntent().getStringExtra("name");
        String date1 = getIntent().getStringExtra("date");

        name.setText("Name is : "+name1);
        date.setText("Booking date is : "+date1);
    }
}