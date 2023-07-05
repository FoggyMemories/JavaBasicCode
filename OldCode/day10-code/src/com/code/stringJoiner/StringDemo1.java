package com.code.stringJoiner;

import java.util.StringJoiner;

public class StringDemo1 {
    public static void main(String[] args) {
        //1.创建一个对象,并指定中间的间隔符号
        StringJoiner sj = new StringJoiner("---");


        //2.添加元素  只能添加字符串,不饿能添加整数等之类数据
        sj.add("aaa").add("bbb").add("ccc");

        //3.打印结果
        System.out.println(sj);
    }
}
