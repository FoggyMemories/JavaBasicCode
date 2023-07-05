package com.qian.a05myset;

import java.util.Comparator;
import java.util.TreeSet;

public class A07_TreeSetDemo3 {
    public static void main(String[] args) {
        /*

            需求:请自行选择比较器排序和自然排序两种方式;
            要求:存入四个字符串,"c","ab","df","qwer"
            按照长度排序,如果一样长则按照首字母排序

         */


        //1.创建集合

        //o1:表示当前要添加的元素
        //o2:表示已经在红黑树存在的元素
        //返回值:
        //            负数:认为要添加的元素是小的,存左边
        //            正数:认为要添加的元素是大的,存右边
        //            0:认为要添加的元素已经存在,舍弃不存
        TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
            //1.按照长度排序
            int i = o1.length() - o2.length();
            //2.如果一样长 则按照首字母排序
            i = i == 0 ? o1.compareTo(o2) : i;
            return i;
        });



        //2.添加元素
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        //3.打印集合(如果什么都没有重写的话,则默认按照ASCII表进行排序)
        System.out.println(ts);

    }
}
