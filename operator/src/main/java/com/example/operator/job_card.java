package com.example.operator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;

public class job_card extends AppCompatActivity {

    private DatePickerDialog datePickerDialog;
    private Button jdob, next1;
    TextInputEditText jjobno, jcname, jmobileno, jcarregino, jyear, jmileage, jcarmake, jcarmodel, jengineno, jrequirement;
    int count=0;
    int i=0;
    DatabaseReference jobcardreference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_card);
        initDatePicker();

        jjobno = findViewById(R.id.jobno);
        jdob = findViewById(R.id.dob);
        jcname = findViewById(R.id.cname);
        jmobileno = findViewById(R.id.mobileno);
        jcarregino = findViewById(R.id.carregino);
        jyear = findViewById(R.id.year);
        jmileage = findViewById(R.id.mileage);
        jcarmake = findViewById(R.id.carmake);
        jcarmodel = findViewById(R.id.carmodel);
        jengineno = findViewById(R.id.engineno);
        jrequirement = findViewById(R.id.requirement);

        jdob.setText(getTodaysDate());
        next1 = findViewById(R.id.next1);


        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createjobcard();
            }
        });
    }

    private void createjobcard() {
        String jobno = jjobno.getText().toString().trim();
        String dob = jdob.getText().toString().trim();
        String cname = jcname.getText().toString().trim();
        String mobileno = jmobileno.getText().toString().trim();
        String carregino = jcarregino.getText().toString().trim();
        String year = jyear.getText().toString().trim();
        String mileage = jmileage.getText().toString().trim();
        String carmake = jcarmake.getText().toString().trim();
        String carmodel = jcarmodel.getText().toString().trim();
        String engineno = jengineno.getText().toString().trim();
        String requirement = jrequirement.getText().toString().trim();

        dataholder obj = new dataholder(jobno,dob, cname, mobileno, carregino, year, mileage, carmake, carmodel, engineno, requirement);

        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference node = db.getReference("JobCards");

        node.child(jobno).setValue(obj);

        jjobno.setText("");
        jdob.setText("");
        jcname.setText("");
        jmobileno.setText("");
        jcarregino.setText("");
        jyear.setText("");
        jmileage.setText("");
        jcarmake.setText("");
        jcarmodel.setText("");
        jengineno.setText("");
        jrequirement.setText("");

        Toast.makeText(job_card.this,"JobCard Created!", Toast.LENGTH_SHORT).show();
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
                jdob.setText(date);
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