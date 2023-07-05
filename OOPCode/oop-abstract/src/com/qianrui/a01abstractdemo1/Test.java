package com.qianrui.a01abstractdemo1;

public class Test {
    public static void main(String[] args) {
        //创建对象
        //抽象类不能进行创建对象
        //Person p = new Person();

        Student s = new Student("qianrui",20);

        System.out.println(s.getName() + ", " + s.getAge());
    }
}
