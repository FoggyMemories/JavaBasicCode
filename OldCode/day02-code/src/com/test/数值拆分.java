package com.test;

import java.util.Scanner;

public class 数值拆分 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位整数");

        int num = sc.nextInt();

        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 %10;

        System.out.println("这个数的个位是：" + ge);
        System.out.println("这个数的十位是：" + shi);
        System.out.println("这个数的百位是：" + bai);

    }
}
