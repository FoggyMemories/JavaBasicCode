package com.qianrui.a04mytreemap;

import java.util.TreeMap;

public class A01_TreeMapDemo1 {
    public static void main(String[] args) {
        /*

            TreeMap集合:基本应用

                需求1:
                    键:整数表示id;
                    值:字符串表示商品名称
                    要求:按照id的升序排列、按照id的降序排列

         */

        //1.创建集合对象
        TreeMap<Integer, String> tm = new TreeMap<>();


        //Integer Double 默认情况下都是按照升序排序的
        //String 按照字母在ASCII码表中对应的数字升序进行排列的
        //2.添加元素
        tm.put(1, "奥利奥");
        tm.put(2, "康师傅");
        tm.put(5, "可口可乐");
        tm.put(3, "六个核桃");
        tm.put(4, "雪碧");

        //按照id的升序排列
        //3.打印集合
        System.out.println(tm);


        //1.创建集合对象
        TreeMap<Integer, String> tm2 = new TreeMap<>((o1, o2) -> {
            //o1:当前要添加的元素
            //o2:表示已经在红黑树中存在的元素
            return o2 - o1;
        });

        //2.添加元素
        tm2.put(1, "奥利奥");
        tm2.put(2, "康师傅");
        tm2.put(5, "可口可乐");
        tm2.put(3, "六个核桃");
        tm2.put(4, "雪碧");

        //按照id的降序排列
        //3.打印集合
        System.out.println(tm2);
    }
}
