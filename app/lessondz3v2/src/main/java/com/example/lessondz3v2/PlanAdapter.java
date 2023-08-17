package com.example.lessondz3v2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PlanAdapter extends RecyclerView.Adapter<PlanViewHolder>{

    private ArrayList<String> planList;

    public PlanAdapter(ArrayList<String> planList) {
        this.planList = planList;
    }

    @NonNull
    @Override
    public PlanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PlanViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_plan, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PlanViewHolder holder, int position) {
        holder.bind(planList.get(position));
    }

    @Override
    public int getItemCount() {
        return planList.size();
    }
}
