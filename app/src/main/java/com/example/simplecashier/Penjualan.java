package com.example.simplecashier;

import java.util.ArrayList;

public class Penjualan {
    private ArrayList<Barang> daftarBarang;
    public void add (Barang brg){
    daftarBarang.add(brg);
    }
    public void reset(){
        daftarBarang=new ArrayList<Barang>();
    }
    public int getTotal(){
        return 0;
    }
}
