package com.example.operator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class jobcard_detail extends AppCompatActivity {


    RecyclerView recycleView_jobcard;

    DatabaseReference database;

    MyAdapter_3 myAdapter_3;

    ArrayList<Job_card_data> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobcard_detail);

        recycleView_jobcard = findViewById(R.id.recycleView_jobcard);

        database = FirebaseDatabase.getInstance().getReference("JobCards");
        recycleView_jobcard.setHasFixedSize(true);
        recycleView_jobcard.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();
        myAdapter_3 = new MyAdapter_3(this, list);
        recycleView_jobcard.setAdapter(myAdapter_3);

        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for (DataSnapshot dataSnapshot : snapshot.getChildren()){

                    Job_card_data job_card_data = dataSnapshot.getValue(Job_card_data.class);
                    list.add(job_card_data);
                }

                myAdapter_3.notifyDataSetChanged();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}