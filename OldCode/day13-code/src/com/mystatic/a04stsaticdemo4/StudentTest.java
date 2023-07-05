package com.mystatic.a04stsaticdemo4;

public class StudentTest {
    public static void main(String[] args) {

        Student.teacherName = "钱睿老师";
        Student s1 = new Student();
        System.out.println("s1:" + s1);
        s1.name = "zhangsan";
        s1.age = 23;
        s1.show1();         //第一次调用s1的时候，this就代表此时s1所赋的值

        System.out.println("===========================");


        Student s2 = new Student();
        System.out.println("s2:" + s2);
        s2.name = "lisi";
        s2.age = 24;
        s2.show1();         //第二次调用s2的时候，this就代表此时s2所赋的值
    }
}
