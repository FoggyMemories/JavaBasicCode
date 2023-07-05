package com.qian.a05myset;

import java.util.LinkedHashSet;

public class A04_LinkedHashSetDemo1 {
    public static void main(String[] args) {
        //1.创建4个学生对象
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);

        Student s4 = new Student("zhangsan", 23);

        //2.创建集合的对象
        LinkedHashSet<Student> lhs = new LinkedHashSet<>();

        //3.添加元素
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));

        //4.打印集合
        System.out.println(lhs);

        /*
            LinkedHashSet集合的特点和原理:
                有序,不重复,无索引
                底层基于哈希表,使用双链表记录添加顺序

            在以后数据去重默认使用 HashSet
                如果要求去重且存取有序,才使用LinkedHashSet
         */
    }
}
