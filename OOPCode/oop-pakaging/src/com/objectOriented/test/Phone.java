package com.objectOriented.test;

public class Phone {

    /*
    如何定义类:
        public class 类名 {
            1.成员变量(代表属性,一般是名词)
            2.成员方法(代表行为,一般是动词)
            3.构造器(后面学习)
            4.代码块(后面学习)
            5.内部类(后面学习)
        }
    如何得到类的对象
        类名 对象名 = new 类名();

    如何使用对象
        访问属性:对象名.成员变量
        访问行为:对象名.方法名(...)
     */

    //属性:
    String brand;
    double price;

    //行为:
    public void call(){
        System.out.println("手机在打电话");
    }

    public void playGame(){
        System.out.println("手机在玩游戏");
    }
}
