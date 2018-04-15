package com.example.marci.aplikacja_seminaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view){
        Intent intent;
        switch(view.getId()){
            case R.id.abc:
                intent = new Intent (MainActivity.this, row.class);
                startActivity(intent);
                break;
            case R.id.def:
                intent = new Intent (MainActivity.this, lista_kmadej.class);
                startActivity(intent);
                break;
        }
    }
}
