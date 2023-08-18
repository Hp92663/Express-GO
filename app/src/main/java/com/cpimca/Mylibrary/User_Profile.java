package com.cpimca.Mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.cpimca.Mylibrary.databinding.ActivityUserBinding;
import com.cpimca.Mylibrary.databinding.ActivityUserProfileBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class User_Profile extends AppCompatActivity {

    ActivityUserProfileBinding binding;
    TextInputEditText Name,Email,Phoneno,Address1,Vehicleno;

    FirebaseDatabase userdatabase;

    DatabaseReference userrefer;
    Button Save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        Name = findViewById(R.id.name);
        Email = findViewById(R.id.email);
        Phoneno = findViewById(R.id.phoneno);
        Address1 = findViewById(R.id.address1);
        Vehicleno = findViewById(R.id.vehicleno);

        Save = findViewById(R.id.save);

        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                userdatabase = FirebaseDatabase.getInstance();
                userrefer = userdatabase.getReference("user");


                // get value

                String name = Name.getText().toString();
                String email = Email.getText().toString();
                String phoneno = Phoneno.getText().toString();
                String address1 = Address1.getText().toString();
                String vehicleno = Vehicleno.getText().toString();

                UserData userData = new UserData(name, email,phoneno, address1,vehicleno);

                userrefer.child(name).setValue(userData);

                Toast.makeText(User_Profile.this, "Data Insert Successfully", Toast.LENGTH_SHORT).show();






            }
        });





    }
}