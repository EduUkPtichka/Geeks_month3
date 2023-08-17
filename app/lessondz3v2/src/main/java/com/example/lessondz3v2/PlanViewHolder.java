package com.example.lessondz3v2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class PlanViewHolder extends RecyclerView.ViewHolder{

    private TextView textView;
    public PlanViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.tv_plan);

    }

    public void bind(String contact){
        textView.setText(contact);
        //Обработчик данных.
    }


}
