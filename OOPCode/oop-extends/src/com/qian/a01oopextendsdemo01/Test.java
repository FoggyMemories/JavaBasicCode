package com.qian.a01oopextendsdemo01;

public class Test {
    public static void main(String[] args) {
        //创建对象并调用方法


        //1.创建布偶猫的对象
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catchMouse();

        System.out.println("-----------------------");

        //2.创建哈士奇的对象
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.keepHouse();
        h.breakHome();
    }
}
