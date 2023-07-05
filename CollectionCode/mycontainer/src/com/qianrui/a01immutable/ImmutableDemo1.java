package com.qianrui.a01immutable;

import java.util.Iterator;
import java.util.List;

public class ImmutableDemo1 {
    public static void main(String[] args) {
        /*

            创建不可变的List集合

         */

        //一旦创建完毕之后,是无法修改的,在下面的在吗中,只能进行查询
        List<String> list = List.of("张三", "李四", "王五", "赵六");


        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        System.out.println("----------------------");
        for (String s : list) {
            System.out.print(s + ", ");
        }

        System.out.println();
        System.out.println("----------------------");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }

        System.out.println();
        System.out.println("----------------------");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
