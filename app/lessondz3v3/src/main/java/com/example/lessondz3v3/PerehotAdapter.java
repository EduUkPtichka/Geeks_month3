package com.example.lessondz3v3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PerehotAdapter extends RecyclerView.Adapter<PerehotViewHolder> {
    private ArrayList<String> perehotList;

    public PerehotAdapter(ArrayList<String> perehotList) {
        this.perehotList = perehotList;
    }

    @NonNull
    @Override
    public PerehotViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PerehotViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_btm, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PerehotViewHolder holder, int position) {
        holder.bind(perehotList.get(position));
    }

    @Override
    public int getItemCount() {
        return perehotList.size();
    }
}
