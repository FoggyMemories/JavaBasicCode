package com.qian.test1;

public class Student {
    //1.私有化成员变量
    //2.空参构造方法
    //3.带有全部参数的构造方法
    //4.get/set方法

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 30) {
            this.age = age;
        } else {
            System.out.println("您输入的年龄有误！");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }
}
