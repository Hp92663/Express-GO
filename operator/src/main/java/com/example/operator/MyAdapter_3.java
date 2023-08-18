package com.example.operator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter_3 extends RecyclerView.Adapter<MyAdapter_3.MyViewHolder> {

    Context context;

    ArrayList<Job_card_data> list;

    public MyAdapter_3(Context context, ArrayList<Job_card_data> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item2, parent, false);
        return  new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Job_card_data job_card_data = list.get(position);

        holder.jobno.setText(job_card_data.getJobno());
        holder.dob.setText(job_card_data.getDob());
        holder.cname.setText(job_card_data.getCname());
//        holder.mobileno.setText(job_card_data.getMobileno());
        holder.carregino.setText(job_card_data.getCarregino());
        holder.year.setText(job_card_data.getYear());
        holder.milege.setText(job_card_data.getMileage());
        holder.carmake.setText(job_card_data.getCarmake());
        holder.carmodel.setText(job_card_data.getCarmodel());
        holder.engineno.setText(job_card_data.getEngineno());
        holder.requirement.setText(job_card_data.getRequirement());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView jobno, dob, cname, mobileno, carregino, year, milege, carmake, carmodel, engineno, requirement;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            jobno = itemView.findViewById(R.id.Jobno);
            dob = itemView.findViewById(R.id.Dob);
            cname = itemView.findViewById(R.id.Cname);
            //mobileno = itemView.findViewById(R.id.Mobile);
            carregino = itemView.findViewById(R.id.Cname);
            year = itemView.findViewById(R.id.Year);
            milege = itemView.findViewById(R.id.Mileage);
            carmake = itemView.findViewById(R.id.Carmake);
            carmodel = itemView.findViewById(R.id.Carmodel);
            engineno = itemView.findViewById(R.id.Engineno);
            requirement = itemView.findViewById(R.id.Requirement);
        }
    }
}
