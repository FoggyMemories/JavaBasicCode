package com.objectPrivate.test2;

public class GirlFriend {
    //属性
    private int age;  //0

    public void method(){
        int age = 10;
        System.out.println(age);      //遵循就近原则,打印出来的结果为上面重新定义的10;
        System.out.println(this.age); //不遵循就进原则,打印出来的结果为之前定义但没有赋值的0;
    }
}
