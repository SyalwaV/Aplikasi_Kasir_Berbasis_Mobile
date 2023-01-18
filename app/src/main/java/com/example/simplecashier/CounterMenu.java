package com.example.simplecashier;

public class CounterMenu {
    private int Esteh,EsJeruk,NasiPecel,NasiRawon;

    public CounterMenu() {
        Esteh = 0;
        EsJeruk = 0;
        NasiPecel = 0;
        NasiRawon = 0;
    }

    public int getEsteh() {
        return Esteh;
    }

    public void setEsteh(int esteh) {
        Esteh = esteh;
    }

    public int getEsJeruk() {
        return EsJeruk;
    }

    public void setEsJeruk(int esJeruk) {
        EsJeruk = esJeruk;
    }

    public int getNasiPecel() {
        return NasiPecel;
    }

    public void setNasiPecel(int nasiPecel) {
        NasiPecel = nasiPecel;
    }

    public int getNasiRawon() {
        return NasiRawon;
    }

    public void setNasiRawon(int nasiRawon) {
        NasiRawon = nasiRawon;
    }
    public void addEsteh(){
        Esteh++;
    }
    public void addEsJeruk(){
        EsJeruk++;
    }
    public void addNasiPecel(){
        NasiPecel++;
    }
    public void addNasiRawon(){
        NasiRawon++;
    }
    public void Reset(){
        Esteh = 0;
        EsJeruk = 0;
        NasiRawon = 0;
        NasiPecel = 0;
    }
}
