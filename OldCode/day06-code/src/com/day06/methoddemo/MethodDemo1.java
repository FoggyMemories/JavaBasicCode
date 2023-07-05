package com.day06.methoddemo;

public class MethodDemo1 {
    public static void main(String[] args) {
        //目标:掌握最简单的方法定义和调用格式

        //调用方法
        dohomework();
    }

    //应该在这个main方法的外面去重新定义一个方法
    //定义一个方法
    public static void dohomework(){
        System.out.println("翻开书");
        System.out.println("拿出并打开文具袋");
        System.out.println("开始认真学习");
    }
}
