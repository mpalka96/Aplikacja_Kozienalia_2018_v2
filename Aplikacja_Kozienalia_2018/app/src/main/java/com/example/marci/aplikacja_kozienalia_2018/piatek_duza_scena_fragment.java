package com.example.marci.aplikacja_kozienalia_2018;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marci on 06.04.2018.
 */

public class piatek_duza_scena_fragment extends android.support.v4.app.Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Wykonawca> lstWykonawca;


    public piatek_duza_scena_fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.piatek_duza_scena_fragment, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.recyclerview_wykonawcy);
        RVA_Wykonawca recyclerAdapter = new RVA_Wykonawca(getContext(), lstWykonawca);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstWykonawca = new ArrayList<>();
        lstWykonawca.add(new Wykonawca("Otsochodzi", "2018-05-19 18:00", R.drawable.otsochodzi, "Opis", "Link", "https://vignette.wikia.nocookie.net/hhpl/images/8/80/Otsochodzi.jpg/revision/latest?cb=20180318165043&path-prefix=pl"));
        lstWykonawca.add(new Wykonawca("Łona i Webber", "2018-05-19 19:00", R.drawable.lona, "Test", "Link", "http://bi.gazeta.pl/im/cb/37/10/z17002699V,Lona-i-Webber.jpg"));
        lstWykonawca.add(new Wykonawca("Taco Hemingway", "2018-05-19 20:00", R.drawable.taco, "Opis", "Link", "http://newonce.net/wp-content/uploads/2017/07/taco-min.jpg"));
        lstWykonawca.add(new Wykonawca("Ten Typ Mes", "2018-05-19 21:30", R.drawable.typmes, "Opis", "Link", "http://newonce.net/wp-content/uploads/2016/07/ten-typ-mes-%E2%80%94-kopia.jpg"));
    }
}
