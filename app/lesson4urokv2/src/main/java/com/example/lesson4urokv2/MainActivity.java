package com.example.lesson4urokv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.lesson4urokv2.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //private TextView tvOne, tvTwo, tvThree, tvFoutr;
    private ActivityMainBinding binding; // ActivityMainBinding - имя нашего XML-файла.
    private CountryAdapter adapter;
    private ArrayList<CountryModel> countryList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Используем его место setContentView.
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        //setContentView(R.layout.activity_main);
        setContentView(binding.getRoot()); // Дай мне права, запрос на права.

        // initView();

        loadData();
        adapter = new CountryAdapter(countryList);
        binding.rvCountry.setAdapter(adapter);
    }

    private void loadData() {
        countryList.add(new CountryModel("Kg", "Bishkek", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Flag_of_Kyrgyzstan.svg/250px-Flag_of_Kyrgyzstan.svg.png"));
        countryList.add(new CountryModel("Kz", "Astana", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Flag_of_Kazakhstan.svg/250px-Flag_of_Kazakhstan.svg.png"));
        countryList.add(new CountryModel("Rs", "Moscow", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Flag_of_Russia.svg/250px-Flag_of_Russia.svg.png"));
        countryList.add(new CountryModel("Uzbekistan", "Tashkent", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/84/Flag_of_Uzbekistan.svg/250px-Flag_of_Uzbekistan.svg.png"));
        countryList.add(new CountryModel("USA", "Washinkton", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/US_flag_51_stars.svg/300px-US_flag_51_stars.svg.png"));
        countryList.add(new CountryModel("Kanada", "Toronto", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/250px-Flag_of_Canada_%28Pantone%29.svg.png"));
        countryList.add(new CountryModel("Spain", "Madrid", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Flag_of_Spain.svg/250px-Flag_of_Spain.svg.png"));
        countryList.add(new CountryModel("Argentina", "Argentina", "https://upload.wikimedia.org/wikipedia/commons/1/1a/Flag_of_Argentina.svg"));
        countryList.add(new CountryModel("Estonia", "Taailin", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/Flag_of_Estonia.svg/250px-Flag_of_Estonia.svg.png"));
        countryList.add(new CountryModel("Great Britain", "London", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Flag_of_the_United_Kingdom_%281-2%29.svg/250px-Flag_of_the_United_Kingdom_%281-2%29.svg.png"));
        countryList.add(new CountryModel("India", "New dail", "https://destan.kg/files/resized/products/hindistan-bayragi-5404.700x800.png"));
        countryList.add(new CountryModel("Germany", "Berlin", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/Flag_of_Germany_%283-2_aspect_ratio%29.svg/250px-Flag_of_Germany_%283-2_aspect_ratio%29.svg.png"));
        countryList.add(new CountryModel("Jordan", "Aman", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Flag_of_Japan.svg/250px-Flag_of_Japan.svg.png"));

    }

    //    private void initView() {
//        tvOne = findViewById(R.id.tv_one);
//        tvTwo = findViewById(R.id.tv_two);
//        tvThree = findViewById(R.id.tv_three);
//        tvFoutr = findViewById(R.id.tv_four);
//
//        tvTwo.setText("Какашка:)");
//    }

    //Бомба!
//        binding.tvOne.setText("Один");
//        binding.tvTwo.setText("Два");
//        binding.tvThree.setText("Три");
//        binding.tvFour.setText("Четыgt");
//    }

}




