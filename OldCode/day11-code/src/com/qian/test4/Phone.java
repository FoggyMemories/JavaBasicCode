package com.qian.test4;

public class Phone {
    private String brand;
    private int price;



    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public Phone() {
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
