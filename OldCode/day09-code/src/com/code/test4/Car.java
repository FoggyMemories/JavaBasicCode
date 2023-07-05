package com.code.test4;

public class Car {
    /*
    案例: 对象数组2
        定义数组存储3部汽车对象.
        汽车的属性:品牌,价格,颜色.
        创建三个汽车对象,数据通过键盘录入而来,并把数据存入到数组当中.
     */

    //属性
    private String brand;
    private double price;
    private String colour;

    public Car() {
    }

    public Car(String brand, double price, String colour) {
        this.brand = brand;
        this.price = price;
        this.colour = colour;
    }


    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }


    public void setColour(String colour) {
        this.colour = colour;
    }


}
