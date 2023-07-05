package com.qian.a05myset;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class A05_TreeSetDemo1 {
    public static void main(String[] args) {
        /*

                需求:利用TreeSet存储正数并进行排序

         */

        //1.创建TreeSet集合的对象

        TreeSet<Integer> ts = new TreeSet<>();

        //2.添加元素

        ts.add(4);
        ts.add(5);
        ts.add(1);
        ts.add(3);
        ts.add(2);

        //3.打印集合
        System.out.println(ts);


        //4.遍历集合(三种遍历方式)
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()){
            Integer i = it.next();
            System.out.print(i + " ");
        }


        System.out.println();
        System.out.println("------------------------");
        //增强for
        for (Integer t : ts) {
            System.out.print(t + " ");
        }

        System.out.println();
        System.out.println("------------------------");

        //lambda表达式遍历
        ts.forEach(i -> System.out.print(i + " "));



        /*
        TreeSet集合默认的规则

            对于数值类型:Integer,Double,默认按照从小到大的顺序进行排序
            对于字符,字符串类型:按照字符在ASCII码表码中的数字升序进行排序

            对于多字符,则会通过首字符进行大小排序,与字符串长短无关
         */
    }
}
