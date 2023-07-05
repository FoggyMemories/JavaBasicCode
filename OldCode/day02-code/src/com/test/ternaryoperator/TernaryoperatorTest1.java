package com.test.ternaryoperator;

import java.util.Scanner;

public class TernaryoperatorTest1{
    public static void main(String[] args) {
        //练习：两只老虎
        //需求：动物园里有两只老虎，体重分别为通过键盘录入获得，请用程序实现判断两只老虎的体重是否相同。
        System.out.println("现在有两只老虎，请录入第一只老虎的体重：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("请录入第二只老虎的体重：");
        Scanner se = new Scanner(System.in);
        int b = se.nextInt();

        System.out.println("两只老虎的体重是否相同");
        System.out.println(a == b);   //可以使用，但是有一个小问题，结果只能是boolean类型的结果

        String x = a == b ? "相同" : "不同";
        System.out.println(x);


    }
}
