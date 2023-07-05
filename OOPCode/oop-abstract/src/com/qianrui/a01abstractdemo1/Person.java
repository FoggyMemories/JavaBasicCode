package com.qianrui.a01abstractdemo1;

public abstract class Person {

    public abstract void work();

    //抽象类中不一定有抽象方法,有抽象方法的类一定是抽象类

    //可以有构造方法
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
