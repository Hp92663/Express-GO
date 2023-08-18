package com.example.operator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class user_details extends AppCompatActivity {


     RecyclerView recycleViewUser;
     ArrayList<UserData> userDataArrayList;
     MyAdapter_2 myAdapter_2;
     FirebaseFirestore db;

     ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);


        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Fetching Data...");
        progressDialog.show();

        recycleViewUser = findViewById(R.id.recycleViewUser);

        recycleViewUser.setHasFixedSize(true);

        recycleViewUser.setLayoutManager(new LinearLayoutManager(this));

        db = FirebaseFirestore.getInstance();
        userDataArrayList = new ArrayList<UserData>();
        myAdapter_2 = new MyAdapter_2(user_details.this, userDataArrayList);

        recycleViewUser.setAdapter(myAdapter_2);

        EventchangeListener();
    }

    private void EventchangeListener() {

        db.collection("users").orderBy("name", Query.Direction.ASCENDING)
                .addSnapshotListener(new EventListener<QuerySnapshot>() {
                    @Override
                    public void onEvent(@Nullable QuerySnapshot value, @Nullable FirebaseFirestoreException error) {

                        if (error != null){

                            if (progressDialog.isShowing())
                                progressDialog.dismiss();

                            Log.e("Firestore Error",error.getMessage());
                            return;
                        }

                        for (DocumentChange dc : value.getDocumentChanges()){

                            if (dc.getType() == DocumentChange.Type.ADDED){
                                userDataArrayList.add(dc.getDocument().toObject(UserData.class));
                            }

                            myAdapter_2.notifyDataSetChanged();

                            if (progressDialog.isShowing())
                                progressDialog.dismiss();

                        }
                    }
                });
    }
}