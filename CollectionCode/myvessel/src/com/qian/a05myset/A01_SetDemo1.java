package com.qian.a05myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class A01_SetDemo1 {
    public static void main(String[] args) {
        /*
            利用Set系列的集合,添加字符串,并使用多种方式遍历
                迭代器
                增强for
                Lambda表达式

         */

        //1.创建一个Set结合的对象
        Set<String> s = new HashSet<>();

        //2.添加元素 add具有bool类型的返回值,因为Set中不允许元素重复,需要进行判断(List虽然也有,但是允许重复,重复判断不重要)
        boolean r1 = s.add("zhangsan");
        boolean r2 = s.add("zhangsan");

        s.add("lisi");
        s.add("wangwu");

        //如果当前元素是第一次添加,那么添加成功,返回true
        //如果当前元素是第二次添加,那么添加失败,返回false
        System.out.println(r1); //true
        System.out.println(r2); //false


        //3.打印集合
        //Set集合是无序的
        System.out.println(s);

        //3.1利用迭代器方式遍历
        Iterator<String> it = s.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.print(str + " ");
        }


        System.out.println();
        System.out.println("-------------------");

        //3.2增强for 方式遍历
        for (String s1 : s) {
            System.out.print(s1 + " ");
        }

        System.out.println();
        System.out.println("-------------------");

        //3.3lambda表达式进行遍历
        s.forEach(s2 -> System.out.print(s2 + " "));

    }
}
