package com.qianrui.a01immutable;

import java.util.Iterator;
import java.util.Set;

public class ImmutableDemo2 {
    public static void main(String[] args) {
        /*

            创建不可变的Set集合
            "张三", "李四", "王五", "赵六"

         */

        //一旦创建完毕之后,是无法修改的,在下面的在吗中,只能进行查询
        Set<String> set = Set.of("张三", "李四", "王五", "赵六");

        for (String s : set) {
            System.out.println(s);
        }


        System.out.println("---------------------");

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
