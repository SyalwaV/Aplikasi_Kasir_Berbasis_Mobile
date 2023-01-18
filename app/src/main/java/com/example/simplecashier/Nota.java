package com.example.simplecashier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Nota extends AppCompatActivity {
    TextView nota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nota);
        nota = findViewById(R.id.Nota);
        Bundle bundle = null;
        bundle = getIntent().getExtras();
        if (bundle!=null){
//            String barang  = bundle.getString("barang");
//            int harga = bundle.getInt("harga");
//            int qty  = bundle.getInt("qty");
//            nota.setText("Menu adalah : " +barang+"\nHarga : "+harga+"\njumlah : "+qty);
//            ArrayList<String> myList = (ArrayList<String>) getIntent().getSerializableExtra("note");
            ArrayList<Barang> myList = getIntent().getParcelableExtra("note");
        }



    }
}