package com.cpimca.Mylibrary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.location.Address;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Profile extends AppCompatActivity {

    private DatePickerDialog datePickerDialog;
    private Button dob;
    Button save;
    RadioGroup radioGroup,radioGroup_fuel;
    RadioButton selectedRadioButton,selectedRadioButton_fuel;

    FirebaseFirestore dbroot;
    String uid ,useruid;
    TextInputEditText mname, memail, phoneno, mvehicleno, mvehicleissuedate, address1;
    FirebaseAuth fAuth;
    String authResult;
    private String key;
    DocumentReference firebaseFirestore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        FirebaseAuth mAuth = FirebaseAuth.getInstance();
//        authResult = FirebaseDatabase.getInstance().getReference().child(mAuth.getCurrentUser().getUid()).toString();
        authResult =FirebaseAuth.getInstance().getCurrentUser().getUid().toString();
        String ph = mAuth.getCurrentUser().getPhoneNumber();
        uid = mAuth.getCurrentUser().getUid();

        mname = findViewById(R.id.name);
        memail = findViewById(R.id.email);
        mvehicleno = findViewById(R.id.vehicleno);
        address1 = findViewById(R.id.address1);


        useruid = FirebaseAuth.getInstance().getCurrentUser().getUid();

        phoneno = findViewById(R.id.phoneno);
        // fetch phone number
        phoneno.setText(ph);

        dbroot = FirebaseFirestore.getInstance();

        String user_id = mAuth.getCurrentUser().getUid();

        save = findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setUser(authResult);

            }
        });
    }

    private void setUser(String authResult) {
        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance();

//////////////////////////Finding selected radio button value of GENDER/////////////////

        radioGroup = findViewById(R.id.radioGroup);
        int selectedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        selectedRadioButton = findViewById(selectedRadioButtonId);

//////////////////////////////////////////////////////////////////////////////////
// ////////////////////////Finding selected radio button value of GENDER/////////////////

        radioGroup_fuel = findViewById(R.id.radioGroup_fuel);
        int selectedRadioButtonId_fuel = radioGroup_fuel.getCheckedRadioButtonId();
        selectedRadioButton_fuel = findViewById(selectedRadioButtonId_fuel);

//////////////////////////////////////////////////////////////////////////////////

        Map<String, String> data = new HashMap<>();

        data.put("uid", authResult);
        data.put("name", mname.getText().toString());
        data.put("email", memail.getText().toString());
        data.put("vehicleno", mvehicleno.getText().toString());
        data.put("phoneno", phoneno.getText().toString());
        data.put("Address", address1.getText().toString());
        String selectedRbText = selectedRadioButton.getText().toString();
        data.put("gender", selectedRbText);

        String selectedRbText_fuel = selectedRadioButton_fuel.getText().toString();
        data.put("fuel", selectedRbText_fuel);

        data.put("role", "Profile");



            firebaseFirestore.collection("users").document(authResult).set(data)
                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void unused) {
                            Toast.makeText(Profile.this, "Insert Data Successfully", Toast.LENGTH_SHORT).show();
                            Log.e("authResult", authResult);
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {

                        }
                    });
        }

    

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.male:
                if (checked)
                    break;
            case R.id.female:
                if (checked)
                    break;
            case R.id.petrol:
                if (checked)
                    break;
            case R.id.diesel:
                if (checked)
                    break;
            case R.id.cng:
                if (checked)
                    break;
        }
    }

    //   Start DatePicker Code
    private String getTodaysDate() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        month = month+1;
        int day = cal.get(Calendar.DAY_OF_MONTH);

        return makeDateString(day, month, year);
    }

    private void initDatePicker() {
        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month = month + 1;
                String date  = makeDateString(dayOfMonth, month , year);
                dob.setText(date);
            }
        };
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        int style = AlertDialog.THEME_HOLO_LIGHT;

        datePickerDialog = new DatePickerDialog(this, style, dateSetListener, year ,month,day);
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
    }
    private String makeDateString(int dayOfMonth, int month, int year) {
        return getMonthFormat(month) + " " + dayOfMonth  + " " + year;
    }
    private String getMonthFormat(int month) {
        if(month == 1)
            return "JAN";
        if(month == 2)
            return "FEB";
        if(month == 3)
            return "MAR";
        if(month == 4)
            return "APR";
        if(month == 5)
            return "MAY";
        if(month == 6)
            return "JUN";
        if(month == 7)
            return "JUL";
        if(month == 8)
            return "AUG";
        if(month == 9)
            return "SEP";
        if(month == 10)
            return "OCT";
        if(month == 11)
            return "NOV";
        if(month == 12)
            return "DEC";
        return "JAN";
    }

    public void openDatePicker(View view) {
        datePickerDialog.show();
    }
    //   End DatePicker Code
}