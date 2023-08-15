package com.example.lesson_2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainFragment extends Fragment {

    TextView textView;
    Button buttonPlus, buttonMinus;
    int namber = 0;


    //Нам даже это не нужно в Fragment
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        }
//    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView = requireActivity().findViewById(R.id.tv_nolic);
        buttonMinus = requireActivity().findViewById(R.id.bt_minus);
        buttonPlus = requireActivity().findViewById(R.id.bt_plus);

        nPlusMinusOne();
    }

    private void nPlusMinusOne() {
        buttonPlus.setOnClickListener(View->{
            namber++;
            textView.setText(String.valueOf(namber));
        });

        buttonMinus.setOnClickListener(View->{
            namber--;
            textView.setText(String.valueOf(namber));
        });


    }

}
