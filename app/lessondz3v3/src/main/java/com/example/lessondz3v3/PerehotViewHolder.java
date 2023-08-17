package com.example.lessondz3v3;

import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PerehotViewHolder extends RecyclerView.ViewHolder{

    private Button button;
    public PerehotViewHolder(@NonNull View itemView) {
        super(itemView);

        button = itemView.findViewById(R.id.btm_perehod);
    }

    public void bind(String contact){
        button.setText(contact);
        //Обработчик данных.
    }
}
