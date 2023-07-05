package com.qian.Array;

import java.util.ArrayList;

public class ArrayListTest1 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<String> list = new ArrayList<>();


        //2.添加元素
        list.add("点赞了么?");
        list.add("收藏了么?");
        list.add("投币了么?");
        list.add("转发了么?");
        list.add("一键三连了么?");

        //3.遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]"); //只有在最后一个sout的时候需要换行输出
    }
}
