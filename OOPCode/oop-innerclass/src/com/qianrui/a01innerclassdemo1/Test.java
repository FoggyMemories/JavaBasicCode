package com.qianrui.a01innerclassdemo1;

public class Test {
    public static void main(String[] args) {
     /*
        需求：写一个JavaBean类表述汽车
        属性：汽车的品牌，车龄，颜色，发动机的品牌，使用年限

        内部类的访问特点：
            内部类可以直接访问外部类的成员，包括私有
            外部类要范围跟内部类的成员，不许创建对象
      */


        Car c = new Car();
        c.setCarName("宾利");
        c.setCarAge(1);
        c.setCarColor("pink");

        c.show();
    }
}
