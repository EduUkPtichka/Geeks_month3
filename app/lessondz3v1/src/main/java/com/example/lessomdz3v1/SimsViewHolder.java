package com.example.lessomdz3v1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class SimsViewHolder extends RecyclerView.ViewHolder{

    private TextView textView;
    public SimsViewHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.tv_nameSims);
    }

    public void bind(String contact){
        textView.setText(contact);
        //Обработчик данных.
    }


}
