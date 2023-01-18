package com.example.simplecashier;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnEsteh,btnEsJeruk,btnNasiPecel,btnNasiRawon,btnBayar,btnBatal;
    Barang barang;
    Penjualan jual;
    TextView total;
    private int counter = 0;
    CounterMenu countM;
    String hasil1;
    int hasil2;
    int totalB;
    final Context context = this;
    ArrayList<String>brg = new ArrayList<>();
    String nota[];





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        barang = new Barang("",0);
        countM = new CounterMenu();
        jual = new Penjualan();
        btnEsteh = (Button) findViewById(R.id.BtnEsTeh);
        btnEsJeruk = (Button) findViewById(R.id.BtnEsJeruk);
        btnNasiRawon = (Button) findViewById(R.id.BtnNasiRawon);
        btnNasiPecel = (Button) findViewById(R.id.BtnNasiPecel);
        btnBayar = (Button) findViewById(R.id.BtnBayar);
        btnBatal = (Button) findViewById(R.id.BtnBatal);
        btnEsteh.setOnClickListener(this);
        btnEsJeruk.setOnClickListener(this);
        btnNasiPecel.setOnClickListener(this);
        btnNasiRawon.setOnClickListener(this);
        btnBatal.setOnClickListener(this);
        btnBayar.setOnClickListener(this);
        total = (TextView) findViewById(R.id.subTotal);



    }

    @Override
    public void onClick(View v) {
    switch (v.getId()){
        case R.id.BtnEsTeh:
            countM.addEsteh();
            btnEsteh.setText("Es Teh "+"("+countM.getEsteh()+")");
            hasil1 = total.getText().toString();
            hasil2 = Integer.parseInt(hasil1);
            totalB =  barang.subTotal(1) + hasil2;
            total.setText(String.valueOf(totalB));
            break;
        case R.id.BtnEsJeruk:
            countM.addEsJeruk();
            btnEsJeruk.setText("Es Jeruk "+"("+countM.getEsJeruk()+")");
            hasil1 = total.getText().toString();
            hasil2 = Integer.parseInt(hasil1);
            totalB = barang.subTotal(2) + hasil2;
            total.setText(String.valueOf(totalB));
            break;
        case R.id.BtnNasiPecel:
            countM.addNasiPecel();
            btnNasiPecel.setText("Nasi Pecel "+"("+countM.getNasiPecel()+")");
            hasil1 = total.getText().toString();
            hasil2 = Integer.parseInt(hasil1);
            totalB = barang.subTotal(3) + hasil2;
            total.setText(String.valueOf(totalB));
            break;
        case R.id.BtnNasiRawon:
            countM.addNasiRawon();
            btnNasiRawon.setText("Nasi Rawon "+"("+countM.getNasiRawon()+")");
            hasil1 = total.getText().toString();
            hasil2 = Integer.parseInt(hasil1);
            totalB = barang.subTotal(4) + hasil2;
            total.setText(String.valueOf(totalB));
            break;
        case R.id.BtnBayar:
            try {
            brg = new ArrayList<>();
            if (countM.getEsteh()>0){
             brg.add("Es Teh : " +countM.getEsteh());
            } else {
                brg.add("");
            }
            if (countM.getEsJeruk()>0){
                brg.add("Es Jeruk : " +countM.getEsJeruk());
            } else {
                brg.add("");
            }
            if (countM.getNasiPecel()>0){
                brg.add("Nasi Pecel : " +countM.getNasiPecel());
            } else {
                brg.add("");
            }
            if (countM.getNasiRawon()>0){
                brg.add("Es Jeruk : " +countM.getNasiRawon());
            } else {
                brg.add("");
                }
            if (Integer.parseInt(total.getText().toString()) != 0){
                brg.add("Total Bayar = "+total.getText().toString());
            }
                AlertDialog.Builder alertdialog = new AlertDialog.Builder(context);
                alertdialog.setTitle("Nota Pembelian");
                alertdialog.setItems(brg.toArray(new String[0]), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                AlertDialog alertDialog = alertdialog.create();
                alertDialog.show();
                barang.reset();
                btnEsteh.setText(nota[0]);
                btnEsJeruk.setText(nota[1]);
                btnNasiPecel.setText(nota[2]);
                btnNasiRawon.setText(nota[3]);
                total.setText("0");
            }catch(Exception e){
                AlertDialog.Builder alertdialog = new AlertDialog.Builder(context);
                alertdialog.setTitle("Prosedur Pembelian gagal ");
            }
            break;
        case R.id.BtnBatal:
            barang.reset();
            total.setText(String.valueOf(barang.subTotal(5)));
            countM.Reset();
            btnEsteh.setText("Es Teh ");
            btnEsJeruk.setText("Es Jeruk ");
            btnNasiPecel.setText("Nasi Pecel ");
            btnNasiRawon.setText("Nasi Rawon ");
            break;
        default:
            break;
    }
    }
}