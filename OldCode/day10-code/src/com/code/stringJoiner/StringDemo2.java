package com.code.stringJoiner;

import java.util.StringJoiner;

public class StringDemo2 {
    public static void main(String[] args) {
        //1.创建对象
        StringJoiner sj = new StringJoiner(", ","[","]");
        //2.添加元素  只能添加字符串,不饿能添加整数等之类数据
        sj.add("aaa").add("bbb").add("ccc");

        //长度
        int len = sj.length();
        System.out.println(len);
        //3.打印结果
        System.out.println(sj);

        //转化为字符串类型
        String str = sj.toString();
        System.out.println(str);
    }
}
