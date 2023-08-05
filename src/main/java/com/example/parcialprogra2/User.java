package com.example.parcialprogra2;

public class User {
    private String myTVChamba;
    private String myTVAmnsiendad;
    private String myTVTemperature;

    public User(String myTVChamba, String myTVAmnsiendad, String myTVTemperature) {
        this.myTVChamba = myTVChamba;
        this.myTVAmnsiendad = myTVAmnsiendad;
        this.myTVTemperature = myTVTemperature;
    }

    public String getMyTVChamba() {
        return myTVChamba;
    }

    public void setMyTVChamba(String myTVChamba) {
        this.myTVChamba = myTVChamba;
    }

    public String getMyTVAmnsiendad() {
        return myTVAmnsiendad;
    }
}