package com.qian.test1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentsTest2 {
    public static void main(String[] args) {
        /*
        练习:添加学生对象并遍历
            需求:定义一个集合,添加一些学生对象,并进行遍历
                学生类的属性为:姓名,年龄

            要求:对象的额数据来源于键盘的录入
         */
        //1.创建集合
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("请输入学生的姓名");
            String name = sc.next();
            System.out.println("请输入学生的年龄");
            int age = sc.nextInt();

            //把name和age放到学生的类中
            s.setName(name);
            s.setAge(age);

            //把学生对象添加到集合当中
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);

            System.out.println(stu.getName() + ", " + stu.getAge());
        }

        System.out.println("集合的长度为：");
        System.out.println(list.size());

    }
}
