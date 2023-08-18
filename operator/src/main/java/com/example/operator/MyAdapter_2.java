package com.example.operator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.firestore.auth.User;

import java.util.ArrayList;

public class MyAdapter_2 extends RecyclerView.Adapter<MyAdapter_2.MyViewHolder> {

    Context context;
    ArrayList<UserData> userDataArrayList;

    public MyAdapter_2(Context context, ArrayList<UserData> userDataArrayList) {
        this.context = context;
        this.userDataArrayList = userDataArrayList;
    }

    @NonNull
    @Override
    public MyAdapter_2.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.user_recycle_format, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter_2.MyViewHolder holder, int position) {

        UserData userData = userDataArrayList.get(position);

        holder.name.setText(userData.name);
        holder.email.setText(userData.email);
        holder.gender.setText(userData.gender);
        holder.phoneno.setText(userData.phoneno);
        holder.Address.setText(userData.Address);
        holder.vehicleno.setText(userData.vehicleno);
        holder.fuel.setText(userData.fuel);

    }

    @Override
    public int getItemCount() {
        return userDataArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView name, email, gender, phoneno, Address, vehicleno, fuel;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            name = itemView.findViewById(R.id.Name);
            email = itemView.findViewById(R.id.Email);
            gender = itemView.findViewById(R.id.Gender);
            phoneno = itemView.findViewById(R.id.Mobile);
            Address = itemView.findViewById(R.id.address);
            vehicleno = itemView.findViewById(R.id.Vehicle);
            fuel = itemView.findViewById(R.id.Fuel);

        }
    }
}
