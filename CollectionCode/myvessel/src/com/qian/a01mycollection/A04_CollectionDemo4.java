package com.qian.a01mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A04_CollectionDemo4 {
    public static void main(String[] args) {
        /* Collection系列集合三种通用的遍历方式：
            1.迭代器遍历
            2.增强for遍历
            3.lambda表达式遍历

            增强for格式：
                for(数据类型 变量名: 集合/数组){

                }

            快速生成方式：
                集合的名字 + for 回车

        */
        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        //2.利用增强型for进行遍历
        //s:第三方变量,在循环过程中依次表示集合中的每一个数据
        //coll.for
        for (String s : coll) {
            System.out.println(s);
        }
        /*
        快速生成方式:
            集合名字+.+for 回车
         */

        for (String s : coll) {
            s = "qqq";
        }
        System.out.println(coll);//[zhangsan, lisi, wangwu]
        /*
        增强for的细节:
            修改增强for中的变量,不会改变集合中原本的数据
            因为其中的s为第三方数据
         */
    }
}
