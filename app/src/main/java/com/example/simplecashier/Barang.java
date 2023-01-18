package com.example.simplecashier;

public class Barang {
    private String Barang;
    private int harga;
    private int qty;

    public Barang(String barang, int harga) {
        Barang = barang;
        this.harga = harga;
        this.qty = 0;
    }

    public void add(){
        qty++;
    }
    public int subTotal(int jenis){
        int total = 0;
                if (jenis == 1) {
                    setBarang("Es Teh");
                    setHarga(3000);
                    add();
                } else if (jenis == 2) {
                    setBarang("Es jeruk");
                    setHarga(4000);
                    add();
                } else if (jenis == 3) {
                    setBarang("Nasi Pecel");
                    setHarga(10000);
                    add();
                } else if (jenis == 4) {
                    setBarang("Nasi Rawon");
                    setHarga(12000);
                    add();
                } else
                    total = 0;
            return harga;
    }

    public void setBarang(String barang) {
        Barang = barang;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public int getQty() {
        return qty;
    }
    public String getBarang() {
        return Barang;
    }
    public void reset(){
        harga = 0;
        qty = 0;
    }
    private String[]Menu(){
        String Menu[] = {"Es Teh","Es Jeruk","Nasi Pecel","Nasi Rawon"};
        return Menu;
    }
}
