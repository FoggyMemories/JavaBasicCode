package com.qian.a01mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A02_CollectionDemo2 {
    public static void main(String[] args) {
        //1.创建集合的对象
        Collection<Student> coll = new ArrayList<>();

        //2.创建三个学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);

        //3.把学生对象添加到集合当中
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        //4.判断集合中某一个学生对象是否包含
        Student s4 = new Student("zhangsan",23);
        //如果同姓名和同年龄,就认为是同一个学生
        //System.out.println(coll.contains(s4));//false
        //因为contains方法在底层以来equals方法判断对象是否一致的
        //如果存在的是自定义对象,没有从写equals方法,那么默认使用Object类中的equals方法进行判断,
        //而Object类中的equals方法以来地址值进行判断.

        //所以,需要在自定义的JavaBean类中,重写equals方法就可以了.
        System.out.println(coll.contains(s4));//true


    }
}
