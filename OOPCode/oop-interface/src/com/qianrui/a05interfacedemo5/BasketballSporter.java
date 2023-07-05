package com.qianrui.a05interfacedemo5;

public class BasketballSporter extends Sporter{
    public BasketballSporter() {
    }

    public BasketballSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("蓝球远动员要学打蓝球");
    }
}
