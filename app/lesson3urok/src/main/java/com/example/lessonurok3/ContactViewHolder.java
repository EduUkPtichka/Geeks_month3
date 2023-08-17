package com.example.lessonurok3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    private TextView tvTitle;
    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);

        tvTitle = itemView.findViewById(R.id.tv_title);
    }

    public void bind(String contact){
        tvTitle.setText(contact);

        //Обработчик данных.
    }
}
