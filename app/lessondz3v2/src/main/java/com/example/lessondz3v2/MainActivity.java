package com.example.lessondz3v2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPlan;
    private ArrayList<String> PlanListMain = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvPlan = findViewById(R.id.rv_plan);
        Lenivec();

        PlanAdapter adapter = new PlanAdapter(PlanListMain);
        rvPlan.setAdapter(adapter);
    }

    private void Lenivec() {
        PlanListMain.add("Планы: 10:00 Встать");
        PlanListMain.add("Планы: 11:00 Geeks ");
        PlanListMain.add("Планы: 12:00 Spring");
        PlanListMain.add("Планы: 13:00 Скушать Сэндвич");
        PlanListMain.add("Планы: План капка Аргене :) ");
        PlanListMain.add("Планы: 16:00 План капкан раскрылся");
        PlanListMain.add("Планы: Кофе выпеть");
        PlanListMain.add("Планы: Папарить");
        PlanListMain.add("Планы: Жвачку купить");
        PlanListMain.add("Планы: Нескем не дилится");
        PlanListMain.add("Планы: 14:00 Очки почистить");
        PlanListMain.add("Планы: 15:00 Начать делать д-з Geeks");
        PlanListMain.add("Планы: Аватар Бабуган");
        PlanListMain.add("Планы: Чекичан");
        PlanListMain.add("Планы: Рик и морти");
        PlanListMain.add("Планы: Блич");
        PlanListMain.add("Планы: Наруто");
        PlanListMain.add("Планы: ВЕРНУТЬ САСКЕ В КОНОХУ");
        PlanListMain.add("Планы: Спать");
        PlanListMain.add("Планы: Видеть сны");
        PlanListMain.add("Планы: Встать пасать");
    }
}