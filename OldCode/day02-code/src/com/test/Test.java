package com.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.println("请输入一个三位整数");

        int a = i.nextInt();
        System.out.println("这个数的个位是：");
        System.out.println(a % 10);
        System.out.println("这个数的十位是：");
        System.out.println(a / 10 % 10);
        System.out.println("这个数的百位是：");
        System.out.println(a / 100 % 10);


    }
}
