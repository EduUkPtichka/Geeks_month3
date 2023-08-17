package com.example.lessomdz3v1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvSims;
    private ArrayList<String> SimsListMain = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSims = findViewById(R.id.rv_meSims);
        loadData();

        SimsAdapter adapter = new SimsAdapter(SimsListMain);
        rvSims.setAdapter(adapter);

    }

    private void loadData() {
        SimsListMain.add("Сабака: Лайка");
        SimsListMain.add("Кошка: Пуговка");
        SimsListMain.add("Имя: Анан");
        SimsListMain.add("Имя: Банан");
        SimsListMain.add("Имя: Блэйр");
        SimsListMain.add("Имя: Delia");
        SimsListMain.add("Имя: Derek");
        SimsListMain.add("Имя: Desmond");
        SimsListMain.add("Имя: Janessa");
        SimsListMain.add("Имя: Genevieve");
        SimsListMain.add("Имя: Isla");
        SimsListMain.add("Имя: King Randolph");
        SimsListMain.add("Имя: Alistair");
        SimsListMain.add("Имя: Break Summers");
        SimsListMain.add("Имя: Deandra");
        SimsListMain.add("Имя: Georgie Majors");
        SimsListMain.add("Имя: Di");
        SimsListMain.add("Имя: Deanne");
        SimsListMain.add("Имя: Dreamfish");
        SimsListMain.add("Имя: Zuma");
        SimsListMain.add("Имя: Kylie Morgan");


    }


}