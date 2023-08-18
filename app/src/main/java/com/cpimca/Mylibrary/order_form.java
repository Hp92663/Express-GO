package com.cpimca.Mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class order_form extends AppCompatActivity {

    TextInputEditText Name, Email, Phoneno, Address1;

    Button order;

    FirebaseDatabase order_summary;

    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_form);

        Name = findViewById(R.id.name);
        Email = findViewById(R.id.email);
        Phoneno = findViewById(R.id.phoneno);
        Address1 = findViewById(R.id.address1);

        order = findViewById(R.id.order);


        String user = Name.getText().toString();
        String pass = Email.getText().toString();
        String ema = Phoneno.getText().toString();
        String mob = Address1.getText().toString();
        String ex = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        String n = "[a-zA-Z]+[0-9]";
        String m = "^[0-9\\-\\+]{9,15}$";
        String p = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}$";


        if (!user.isEmpty()) {
            Name.setError(null);
            if (!pass.isEmpty() && pass.matches(ex)) {
                Email.setError(null);
                if (!ema.isEmpty() && ema.matches(m)) {
                    Phoneno.setError(null);
                    if ((!mob.isEmpty())) {
                        Address1.setError(null);
                        String name = Name.getText().toString();
                        String email = Email.getText().toString();
                        String phoneno = Phoneno.getText().toString();
                        String address1 = Address1.getText().toString();


                        order_summary = FirebaseDatabase.getInstance();
                        reference = order_summary.getReference("Orders");


                        Order_Summary orderSummary = new Order_Summary(name, email, phoneno, address1);
                        reference.child(name).setValue(orderSummary);
                        Intent intent = new Intent(order_form.this, success_payment.class);
                        startActivity(intent);
                        finish();
                        Toast.makeText(order_form.this, "Detail Save Successful!", Toast.LENGTH_SHORT).show();

                } else {
                    Name.setError("Please Enter name..");
                }
            } else {
                Phoneno.setError("Please Enter valid mobile..");
            }
        } else {
            Email.setError("Please Enter valid email..");
        }

    }else {
            Phoneno.setError("Please Enter Mobile No.");
        }

    }
  }


