package com.qian.a06oopextendsdemo06;

public class DogTest {
    public static void main(String[] args) {
        //创建对象并调用

        Husky h = new Husky();
        h.eat();
        h.drink();
        h.keepHouse();
        h.breakHome();

        System.out.println("--------------------");

        ChineseDog cd = new ChineseDog();
        cd.eat();
        cd.drink();
        cd.keepHouse();
    }
}
