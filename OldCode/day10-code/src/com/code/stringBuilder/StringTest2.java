package com.code.stringBuilder;

public class StringTest2 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder();

        //2.添加字符串
        //链式编程
        sb.append("aaa").append("bbb").append("ccc").append("ddd");


        System.out.println(sb);


        //再把StringBuilder变回字符串
        String str = sb.toString();

        System.out.println(str);
    }
}
