package com.example.lesson4urokv2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class CountryViewHolder extends RecyclerView.ViewHolder {

    private TextView tvCountName, tvCapital;
    private ImageView imgFlag;

    public CountryViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCountName = itemView.findViewById(R.id.tv_country_name);
        tvCapital = itemView.findViewById(R.id.tv_capital);
        imgFlag = itemView.findViewById(R.id.ing_flag);



    }
    public void bind(CountryModel country){
        tvCountName.setText(country.getName());
        tvCapital.setText(country.getName());
        Glide.with(imgFlag).load(country.getFlag()).into(imgFlag);


    }
}
