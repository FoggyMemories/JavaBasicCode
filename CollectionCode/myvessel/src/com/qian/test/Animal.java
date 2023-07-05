package com.qian.test;


//泛型适用于类型不确定的情况下,但是此时已经明确知道了 姓名和年龄 的具体类型,所以不需要使用泛型
/*
public class Animal<N,I> {
    private N name;
    private I age;

}
*/

public abstract class Animal {
    private String name;
    private int age;


    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();

    public String toString() {
        return "Animal{name = " + name + ", age = " + age + "}";
    }
}
