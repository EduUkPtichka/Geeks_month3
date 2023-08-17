package com.example.lessondz3v3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPerehot;
    private ArrayList<String> perehotListMain = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvPerehot = findViewById(R.id.rv_btn_list);

        Perehodnoe();

        PerehotAdapter adapter = new PerehotAdapter(perehotListMain);
        rvPerehot.setAdapter(adapter);

    }

    private void Perehodnoe() {
        perehotListMain.add("Перейти: ");

    }
}