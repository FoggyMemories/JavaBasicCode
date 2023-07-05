package com.qian.a07oopextendsdemo07;

public class Student extends Person{

    public Student(){
        //子类构造方法中隐藏的super()去访问父类的午餐构造
        super();
        System.out.println("子类的无参构造");
    }

    public Student(String name,int age){
        super(name,age);        //调用父类中的带参构造
    }
}
