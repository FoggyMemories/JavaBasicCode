package com.mystatic.a01stsaticdemo1;

public class Student {
    //属性：姓名 年龄 性别
    private String name;
    private int age;
    private char gender;

    public static String teacherName;


    public Student() {
    }

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * 设置
     *
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    //行为
    public void study() {
        System.out.println(name + "正在学习");
    }

    public void show() {
        System.out.println(name + ", " + age + ", " + gender + ", " + teacherName);
    }
}
