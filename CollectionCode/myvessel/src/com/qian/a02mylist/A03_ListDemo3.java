package com.qian.a02mylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class A03_ListDemo3 {
    public static void main(String[] args) {
        /*

             List系列集合的五种遍历方式：
                1.迭代器
                2.列表迭代器
                3.增强for
                4.Lambda表达式
                5.普通for循环

         */

        //创建集合并添加元素
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //1.迭代器
        Iterator<String> it1 = list.iterator();
        while (it1.hasNext()) {
            String str = it1.next();
            System.out.println(str);
        }
        System.out.println("-----------------------------");

        //2.增强for
        //s:是一个第三方变量
        //在循环过程中,依次表示集合中的每一个元素
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------------------");

        //3.lambda表达式
        list.forEach(System.out::println);
        System.out.println("-----------------------------");

        //4.普通for循环
        //size方法跟get方法还有循环结合的方式,利用索引获取到集合中的每一个元素
        for (int i = 0; i < list.size(); i++) {
            //ii:依次表示集合中的每一个索引
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("-----------------------------");

        //5.列表迭代器
        //获取一个列表迭代器的对象,里面的指针默认也是指向0索引的

        //额外添加了一个方法:在遍历的过程中,可以添加元素
        ListIterator<String> it2 = list.listIterator();
        while (it2.hasNext()) {
            String str = it2.next();
            if ("bbb".equals(str)) {
                //qqq
                it2.add("qqq");
            }
            System.out.println(str);
        }

        /*

            添加元素:使用列表迭代器.
            删除元素:使用迭代器.

            仅仅想遍历:使用增强for或lambda表达式.

            遍历的时候想操作索引:利用普通for

         */
    }
}
