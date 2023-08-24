package com.example.lessondz3v4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;

import com.example.lessondz3v4.databinding.FragmentContinentBinding;

import java.util.ArrayList;

import androidx.annotation.Nullable;


public class ContinentFragment extends Fragment implements OnItemClick {

    private FragmentContinentBinding binding;
    private ArrayList<Continent> continentList;
    private ContinentAdapter adapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new ContinentAdapter(continentList, this);
        binding.recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        continentList = new ArrayList<>();
        continentList.add(new Continent("North America"));
        continentList.add(new Continent("South America"));
        continentList.add(new Continent("Eurasia"));
        continentList.add(new Continent("Africa"));
        continentList.add(new Continent("Australia"));
    }

    @Override
    public void onClick(Integer position) {
        Bundle bundle = new Bundle();
        bundle.putInt("key", position);

        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);

        requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, countryFragment).addToBackStack(null).commit();
    }

}


