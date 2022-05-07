package com.we_up_project.KebunKitaApp.KebunKitaApp.dashboard;

public class PromoHelperClass {
    int gambar_bg;
    double ptngnHarga;
    double harga;
    int lblPromo;
    String nmBarang;

    public PromoHelperClass(int gambar_bg, int lblPromo, String nmBarang, double ptngnHarga) {
        this.gambar_bg = gambar_bg;
        this.lblPromo = lblPromo;
        this.nmBarang = nmBarang;
        this.ptngnHarga = ptngnHarga;
    }

    public double getHarga() {
        double hasil = ptngnHarga*lblPromo/100;
        harga = ptngnHarga - hasil;
        return harga;
    }

    public int getLblPromo() {
        return lblPromo;
    }

    public int getGambar_bg() {
        return gambar_bg;
    }

    public String getNmBarang() {
        return nmBarang;
    }

    public double getPtngnHarga() {
        return ptngnHarga;
    }

}
