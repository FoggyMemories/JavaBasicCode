package com.qian.test1;

import java.util.ArrayList;

public class StudentsTest1 {
    public static void main(String[] args) {
        /*
        练习:添加学生对象并遍历
            需求:定义一个集合,添加一些学生对象,并进行遍历
                学生类的属性为:姓名,年龄
         */

        //1.创建集合

        ArrayList<Student> list = new ArrayList<>();

        //2.创建学生对象

        Student s1 = new Student("zhangsan", 20);
        Student s2 = new Student("lisi", 21);
        Student s3 = new Student("wangwu", 22);

        //3.添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);


        //不能这样直接输出,此时输出的是地址值
        System.out.println(list);  //[com.qian.test.Student@7ef20235, com.qian.test.Student@27d6c5e0, com.qian.test.Student@4f3f5b24]


        //不能直接这样遍历
        System.out.print("[");

        //只用get的话是调用的地址值,所以说必须使用里面的内容
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");




        //正确的遍历方式:
        for (int i = 0; i < list.size(); i++) {
            //i表示的是索引,为地址值,应该使用get...
            Student stu = list.get(i);

            System.out.println(stu.getName() + ", " + stu.getAge());
        }
    }
}
