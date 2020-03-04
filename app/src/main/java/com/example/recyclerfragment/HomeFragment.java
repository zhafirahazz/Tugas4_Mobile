package com.example.recyclerfragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private RecyclerView rvHero;
    private ArrayList<ModelPahlawan> listHero = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvHero = view.findViewById(R.id.fragmenthome_hero);
        rvHero.setHasFixedSize(true);
        listHero.addAll(DataPahlawan.getHeroList());

        showRecyclerList();
    }

    private void showRecyclerList() {
        rvHero.setLayoutManager(new LinearLayoutManager(getActivity()));
        AdapterPahlawan adapterPahlawan = new AdapterPahlawan(DataPahlawan.getHeroList(), getActivity());
        rvHero.setAdapter(adapterPahlawan);
    }
}
