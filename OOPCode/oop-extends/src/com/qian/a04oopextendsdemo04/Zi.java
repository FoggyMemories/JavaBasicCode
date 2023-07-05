package com.qian.a04oopextendsdemo04;

public class Zi extends Fu {
    String name = "Zi";
    String game = "pubg";

    public void show() {
        //打印"Zi"
        System.out.println(this.name);
        //打印"Fu"
        System.out.println(super.name);
        //打印"喝茶"
        System.out.println(hobby);
        System.out.println(this.hobby);
        System.out.println(super.hobby);        //三种均可
        //打印"pubg"
        System.out.println(game);
        System.out.println(this.game);
    }
}
