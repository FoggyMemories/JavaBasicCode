package com.test;

import java.util.Scanner;

public class 三元运算符 {
    public static void main(String[] args) {

        //作用：可以进行判断，根据判断的结果得到不同的内容
        //（三元运算符/三元表达式）格式：
        //格式：关系表达式？表达式1：表达式2；

        //范例：求两个数的较大值。
        System.out.println("求两个数的较大值");
        System.out.println("请输入第一个数字：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        Scanner se = new Scanner(System.in);
        int b = se.nextInt();

        int max = a > b ? a : b;
        System.out.println("这两个数之间较大的是：");
        System.out.println(max);


        //整个三元运算符的结果必须 要被使用。
        //计算规则：
        //首先计算关系表达式的值
        //如果值为ture，表达式1的值就是运算结果
        //如果值为false，表达式2的值就是运算结果
    }
}
