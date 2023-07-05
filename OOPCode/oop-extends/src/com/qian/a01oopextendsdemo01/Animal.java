package com.qian.a01oopextendsdemo01;

public class Animal {

    //权限修饰符:
    //private:子类就无法访问
    //私有:只能在本类中访问
    public void eat() {
        System.out.println("吃东西");
    }

    public void drink() {
        System.out.println("喝水");
    }
}
