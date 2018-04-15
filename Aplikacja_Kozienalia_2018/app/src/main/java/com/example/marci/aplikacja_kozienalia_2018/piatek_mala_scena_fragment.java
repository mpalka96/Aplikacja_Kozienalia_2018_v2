package com.example.marci.aplikacja_kozienalia_2018;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class piatek_mala_scena_fragment extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Wykonawca> lstWykonawca;

    public piatek_mala_scena_fragment() {
        // Required empty public constructor
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.piatek_mala_scena_fragment, container, false);
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
        lstWykonawca.add(new Wykonawca("PTK MAŁA SCENA", "2018-05-19 20:00", R.drawable.chocolate, "Opis", "Link", "https://goingapp.pl/storage/app/uploads/public/5a5/395/d8b/thumb_167481_600x350_0_0_crop.jpg"));
        lstWykonawca.add(new Wykonawca("Test", "Test", R.drawable.chocolate, "Test", "Link", "https://goingapp.pl/storage/app/uploads/public/5a5/395/d8b/thumb_167481_600x350_0_0_crop.jpg"));
        lstWykonawca.add(new Wykonawca("CHØCØLATE", "2018-05-19 20:00", R.drawable.chocolate, "Opis", "Link", "https://goingapp.pl/storage/app/uploads/public/5a5/395/d8b/thumb_167481_600x350_0_0_crop.jpg"));
        lstWykonawca.add(new Wykonawca("CHØCØLATE", "2018-05-19 20:00", R.drawable.chocolate, "Opis", "Link", "https://goingapp.pl/storage/app/uploads/public/5a5/395/d8b/thumb_167481_600x350_0_0_crop.jpg"));
        lstWykonawca.add(new Wykonawca("CHØCØLATE", "2018-05-19 20:00", R.drawable.chocolate, "Opis", "Link", "https://goingapp.pl/storage/app/uploads/public/5a5/395/d8b/thumb_167481_600x350_0_0_crop.jpg"));

    }

}
