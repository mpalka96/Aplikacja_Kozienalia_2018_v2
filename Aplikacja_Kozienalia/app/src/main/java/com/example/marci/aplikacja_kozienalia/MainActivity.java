package com.example.marci.aplikacja_kozienalia;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarBadge;
import com.roughike.bottombar.OnMenuTabClickListener;

public class MainActivity extends AppCompatActivity {
    BottomBar mBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBottomBar = BottomBar.attach(this, savedInstanceState);
        mBottomBar.setItemsFromMenu(R.menu.menu_main, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int i) {
                if (i == R.id.bottombaritem2) {
                    kalendarz f = new kalendarz();
                    getFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.bottombaritem3) {
                    ulubione f = new ulubione();
                    getFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.bottombaritem1) {
                    str_glowna f = new str_glowna();
                    getFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                }
            }

            @Override
            public void onMenuTabReSelected(int menuItemId) {

            }
        });
        mBottomBar.mapColorForTab(0, "#4CAF50");
        mBottomBar.mapColorForTab(1, "#2E7D32");
        mBottomBar.mapColorForTab(2, "#1B5E20");

        BottomBarBadge unread;
        unread = mBottomBar.makeBadgeForTabAt(0, "#4CAF50", 13);
        unread.show();

    }
}