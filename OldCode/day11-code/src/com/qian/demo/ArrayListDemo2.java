package com.qian.demo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        //1.创建一个集合
        ArrayList<String> list = new ArrayList<>();

        //2.添加元素

        //一般情况下,是不需要看是否添加成功,所以说,不需要返回值,只用到添加功能即可
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);

        System.out.println("-----------------------");

        //3.删除元素
        boolean result = list.remove("aaa");
        boolean result1 = list.remove("a");
        System.out.println(result);    //存在的时候为true
        System.out.println(result1);   //不存在的时候为false
        System.out.println(list);

        list.add("aaa");
        System.out.println("-----------------------");

        String str = list.remove(0);
        System.out.println(str);   //   bbb   ---   被删除的元素进行返回
        System.out.println(list);

        System.out.println("-----------------------");
        String reslut2 = list.set(2, "ddd");   //将第 2 索引的元素进行调换
        System.out.println(reslut2);
        System.out.println(list); //[ccc, ddd, ddd]

        System.out.println("-----------------------");
        for (int i = 0; i < list.size(); i++) {
            //i依次表示索引
            //list.get(i);
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
