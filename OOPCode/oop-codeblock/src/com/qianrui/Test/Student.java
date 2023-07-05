package com.qianrui.Test;

public class Student {
    private String name;
    private int age;


    //构造代码块
    //每次创建对象均会执行
    {
        //无论如何,构造代码块总是优先运行
        //缺点,不够灵活
        System.out.println("开始创建对象了");
    }

    //静态代码块
    //随着类的加载而加载,并且自动出发、只执行一次
    //使用场景:在类加载的时候,做一些数据初始化的时候使用
    static {
        //只运行一次,且优先级高于构造代码块
        System.out.println("静态代码块");
    }


    public Student() {
        System.out.println("空参构造");
    }

    public Student(String name, int age) {
        System.out.println("有参构造");
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

}
