package com.example.operator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class register extends AppCompatActivity {

    private FirebaseAuth auth;
    private EditText signupEmail, signupPassword,firstname,lastname,mobile;
    private Button registr;

    private TextView login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        auth = FirebaseAuth.getInstance();
        signupEmail = findViewById(R.id.edtemail);
        signupPassword = findViewById(R.id.edtpass);
        firstname = findViewById(R.id.edFirstname);
        lastname = findViewById(R.id.edLastname);
        mobile =  findViewById(R.id.edMobile);
        registr = findViewById(R.id.btnSubmit);
        login = findViewById(R.id.rtlogin);

        registr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = signupEmail.getText().toString().trim();
                String pass = signupPassword.getText().toString().trim();
                String fname = firstname.getText().toString().trim();
                String lname = lastname.getText().toString().trim();
                String mob = mobile.getText().toString().trim();


                if (user.isEmpty()){
                    signupEmail.setError("Email cannot be empty");
                }
                if (lname.isEmpty()){
                    lastname.setError("Lastname cannot be empty");
                }
                if (fname.isEmpty()){
                    firstname.setError("Firstname cannot be empty");
                }
                if (mob.isEmpty()){
                    mobile.setError("Mobile cannot be empty");
                }
                if (pass.isEmpty()){
                    signupPassword.setError("Password cannot be empty");
                } else{
                    auth.createUserWithEmailAndPassword(user, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(register.this, "SignUp Successful", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(register.this, admin_dashboard.class));
                            } else {
                                Toast.makeText(register.this, "SignUp Failed" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(register.this, login.class));
            }
        });
    }
}