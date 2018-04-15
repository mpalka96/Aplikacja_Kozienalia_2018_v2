package com.example.marci.aplikacja_kozienalia_2018;

import java.util.Date;

/**
 * Created by marci on 06.04.2018.
 */

public class Wykonawca {

    private String nazwa;
    private String data;
    private int photo;
    private String photo_opis;
    private String opis;
    private String link;

    public Wykonawca() {
    }

    public Wykonawca(String nazwa, String data, int photo, String opis, String link, String photo_opis) {
        this.nazwa = nazwa;
        this.data = data;
        this.photo = photo;
        this.opis = opis;
        this.link = link;
        this.photo_opis = photo_opis;
    }

    //Getter

    public String getNazwa() {

        return nazwa;
    }

    public String getData() {

        return data;
    }

    public int getPhoto() {

        return photo;
    }

    public String getOpis() {
        return opis;
    }

    public String getLink() {
        return link;
    }

    public String getPhoto_opis() {
        return photo_opis;
    }

    //Setter


    public void setNazwa(String nazwa) {

        this.nazwa = nazwa;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setPhoto(int photo) {

        this.photo = photo;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setPhoto_opis(String photo_opis) {
        this.photo_opis = photo_opis;
    }
}
