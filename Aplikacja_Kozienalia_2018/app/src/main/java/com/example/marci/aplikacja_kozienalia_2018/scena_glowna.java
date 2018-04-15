package com.example.marci.aplikacja_kozienalia_2018;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class scena_glowna extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scena_glowna);

        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //tutaj dodajemy fragmenty

        adapter.AddFragment(new piatek_duza_scena_fragment(), "Piątek 18.05.2018");
        adapter.AddFragment(new sobota_duza_scena_fragment(), "Sobota 19.05.2018");
        adapter.AddFragment(new niedziela_duza_scena_fragment(), "Niedziela 20.05.2018");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
