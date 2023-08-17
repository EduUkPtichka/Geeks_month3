package com.example.lessonurok3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView rvContact;
    private ArrayList<String> contactListMain = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvContact = findViewById(R.id.rv_past);
        loadData();

        ContactAdapter adapter = new ContactAdapter(contactListMain);
        rvContact.setAdapter(adapter);

    }

    //Имитация
    private void loadData() {
        contactListMain.add("Ашотик");
        contactListMain.add("Ваншотик");
        contactListMain.add("МеталлаБаза");
        contactListMain.add("Фигурки");
        contactListMain.add("Арматура Юля");
        contactListMain.add("Камаз Бишкек Кант");
        contactListMain.add("Анна");
        contactListMain.add("Хз");
        contactListMain.add("Не брать");
        contactListMain.add("Арсаншот");
        contactListMain.add("Тимашот");
        contactListMain.add("Пеклошоп");
        contactListMain.add("Никита");
        contactListMain.add("Эгина");
    }
}