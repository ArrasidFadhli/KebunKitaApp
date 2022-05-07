package com.we_up_project.KebunKitaApp.KebunKitaApp.dashboard;

public class RekomendasiHelperClass {
    int img;
    String judulItem, price;

    public RekomendasiHelperClass(int img, String judulItem, String price) {
        this.img = img;
        this.judulItem = judulItem;
        this.price = price;
    }

    public int getImg() {
        return img;
    }

    public  String getJudulItem() {
        return judulItem;
    }

    public String getPrice() {
        return price;
    }
}
