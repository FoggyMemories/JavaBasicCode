package com.qian.Array;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        /*
        练习:添加数字并遍历
            需求:定义一个集合,添加数字,并进行遍历.
                遍历格式参照[元素1,元素2,元素3].
         */


        /*
        基本数据类型对应的包装类
        byte       ->        Byte
        shot       ->        Short
        long       ->        Long
        float      ->        Float
        double     ->        Double
        boolean    ->        Boolean


        char       ->        Character
        int        ->        Integer
         */


        //1.创建集合  , 再次不能用int类型,必须使用包装类<Integer>
        ArrayList<Integer> list = new ArrayList<>();

        //2.添加元素
        //jdk5以后 int Integer 之间是可以相互转化的
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        System.out.println("--------------------------");

        //3.遍历集合
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");


    }
}
