package com.test.ternaryoperator;

import java.util.Scanner;

public class TernaryoperatorDemo1 {
    public static void main(String[] args) {
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
    }
}
