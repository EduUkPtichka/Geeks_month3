package com.example.lessomdz3v1;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SimsAdapter extends RecyclerView.Adapter<SimsViewHolder>{
    private ArrayList<String> simsList;

    public SimsAdapter(ArrayList<String> simsList) {
        this.simsList = simsList;
    }

    @NonNull
    @Override
    public SimsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SimsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sims, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SimsViewHolder holder, int position) {
        holder.bind(simsList.get(position));
    }

    @Override
    public int getItemCount() {
        return simsList.size();
    }
}
