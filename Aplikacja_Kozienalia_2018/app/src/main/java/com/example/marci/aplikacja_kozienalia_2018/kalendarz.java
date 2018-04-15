package com.example.marci.aplikacja_kozienalia_2018;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class kalendarz extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalendarz);
        BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
                = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.strona_glowna:
                        Intent intent0 = new Intent(kalendarz.this, MainActivity.class);
                        startActivity(intent0);
                        break;
                    case R.id.kalendarz:
                        return true;
                    case R.id.ulubione:
                        Intent intent2 = new Intent(kalendarz.this, ulubione.class);
                        startActivity(intent2);
                        break;
                    case R.id.mapa:
                        Intent intent3 = new Intent(kalendarz.this, mapa.class);
                        startActivity(intent3);
                        break;
                }
                return false;
            }
        };
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        Menu menu = navigation.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);
    }
}
