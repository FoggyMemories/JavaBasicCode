package com.qian.a05myset;

import java.util.TreeSet;

public class A08_TreeSetDemo4 {
    public static void main(String[] args) {
        /*

            需求:创建5个学生对象

            属性:(姓名,年龄,语文成绩,数学成绩,英语成绩)
            按照总分从高到低输出到控制台
            如果总分一样,按照语文成绩排
            如果语文一样,按照数学成绩排
            如果数学乘积一样,按照英语成绩排
            如果英语成绩一样,按照年龄排
            如果年龄一样,按照姓名的字母顺序排
            如果都一样,认为是同一个学生,不存.


            两种排序方式:
                第一种:默认排序/自然排序
                第二种:比较器排序

                默认情况下,使用第一种排序方式,如果第一种不能满足当前的需求,会采取第二种方式
         */

        //1.创建学生对象
        StudentMark sm1 = new StudentMark("zhangsan", 23, 90, 99, 50);
        StudentMark sm2 = new StudentMark("lisi", 24, 90, 98, 50);
        StudentMark sm3 = new StudentMark("wangwu", 25, 95, 100, 30);
        StudentMark sm4 = new StudentMark("zhaoliu", 26, 60, 99, 70);
        StudentMark sm5 = new StudentMark("qianqi", 26, 70, 80, 70);


        //2.创建集合
        //默认ArrayList，如果想要数据唯一，则用HashSet，又要唯一又要排序，则用TreeSet

        TreeSet ts = new TreeSet<>();

        //3.添加元素
        ts.add(sm1);
        ts.add(sm2);
        ts.add(sm3);
        ts.add(sm4);
        ts.add(sm5);

        //4.打印集合
        for (Object t : ts) {
            System.out.println(t);
        }
    }
}
