package com.code.test3;
/*
案例：对象数组
    定义数组存储3个商品对象
    商品属性：商品的id，名字，价格，库存。
    创建三个商品对象，并把商品对象存入到数组中
 */

public class Goods {
    //商品的属性
    private String id;
    private String name;
    private double price;
    private int stock;

    public Goods() {
    }

    public Goods(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
