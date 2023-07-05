package com.qianrui.a07test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        /*
        班级里有5个学生
        要求：
        被点到的学生不会再被点到。
        但是如果班级中所有的学生都点完了，需要重新开启第二轮点名。
         */


        //1.定义集合
        ArrayList<String> list1 = new ArrayList<>();

        //2.添加数据
        Collections.addAll(list1, "范闲", "范建", "范统", "杜子腾", "杜琦燕",
                "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰", "袁明媛");

        //创建一个临时的集合，用来存储已经被点到学生的姓名
        ArrayList<String> list2 = new ArrayList<>();

        Random r = new Random();

        //外循环表示轮数
        for (int i = 1; i <= 10; i++) {
            System.out.println("-----------------第" + i + "轮点名-------------------");
            //3.随机点名
            while (!list1.isEmpty()) {
                int index = r.nextInt(list1.size());

                String name = list1.remove(index);
                //将删除的学生姓名添加到临时集合当中
                list2.add(name);
                System.out.println(name);
            }

            //将临时集合再次全部赋给原始集合
            list1.addAll(list2);
            //再将临时集合进行清空
            list2.clear();

        }
    }
}
