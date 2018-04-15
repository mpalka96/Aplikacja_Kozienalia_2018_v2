package com.example.marci.aplikacja_kozienalia_2018;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by marci on 07.04.2018.
 */

public class wykonawca_opis extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wykonawca_opis);

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        if(getIntent().hasExtra("Obrazek") && getIntent().hasExtra("Nazwa") && getIntent().hasExtra("Obrazek Opis")
                && getIntent().hasExtra("Data") && getIntent().hasExtra("Link") && getIntent().hasExtra("Opis")){

            String Obrazek = getIntent().getStringExtra("Obrazek");
            String Nazwa = getIntent().getStringExtra("Nazwa");
            String Obrazek_Opis = getIntent().getStringExtra("Obrazek Opis");
            String Data = getIntent().getStringExtra("Data");
            String Link = getIntent().getStringExtra("Link");
            String Opis = getIntent().getStringExtra("Opis");

            Setter(Obrazek, Nazwa, Obrazek_Opis, Data, Link, Opis);
        }
    }

    private void Setter(String Obrazek, String Nazwa, String Obrazek_Opis, String Data, String Link, String Opis){
        TextView nazwa = findViewById(R.id.nazwa_wyk);
        nazwa.setText(Nazwa);


        ImageView image_opis = findViewById(R.id.img_opis);
        Glide.with(this)
                .asBitmap()
                .load(Obrazek_Opis)
                .into(image_opis);

        TextView data = findViewById(R.id.data_wyk);
        data.setText(Data);

        TextView link = findViewById(R.id.link_yt);
        link.setText(Link);

        TextView opis = findViewById(R.id.opis_wyk);
        opis.setText(Opis);


    }

}
