package com.example.marci.aplikacja_kozienalia_2018;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Strona Glowna";

    //zmienne
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<Integer> mImages = new ArrayList<Integer>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
                = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.strona_glowna:
                        return true;
                    case R.id.kalendarz:
                        Intent intent1 = new Intent(MainActivity.this, kalendarz.class);
                        startActivity(intent1);
                        break;
                    case R.id.ulubione:
                        Intent intent2 = new Intent(MainActivity.this, ulubione.class);
                        startActivity(intent2);
                        break;
                    case R.id.mapa:
                        Intent intent3 = new Intent(MainActivity.this, mapa.class);
                        startActivity(intent3);
                        break;
                }
                return false;
            }
        };
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        Menu menu = navigation.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);
        initImageBitmaps();


    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: Preparing bitmaps.");

        mImages.add(R.drawable.duza_scena);
        mNames.add("DUŻA SCENA");

        mImages.add(R.drawable.mala_scena);
        mNames.add("SCENA PERŁA EXPORT");

        mImages.add(R.drawable.poster);
        mNames.add("WYDARZENIA TOWARZYSZĄCE");

        mImages.add(R.drawable.duza_scena);
        mNames.add("DOJAZD");

        mImages.add(R.drawable.duza_scena);
        mNames.add("PARTNERZY");

        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: Preparing recyclerview...");
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImages);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
