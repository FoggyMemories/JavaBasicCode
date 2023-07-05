package com.test.logicoperator;

import java.util.Scanner;

public class LogicoperatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("键盘录入第一个整数：");
        int i = sc.nextInt();
        Scanner se =new Scanner(System.in);
        System.out.println("键盘录入第二个整数：");
        int y = se.nextInt();

        System.out.println("这两个整数之间是否有一个数字为6：");
        boolean z = i == 6 | y == 6;
        System.out.println(z);
        System.out.println("这两个整数之和");
        boolean x = (i + y) % 6 == 0;
        System.out.println(x);

        System.out.println("如果其中一个为6，且他们的和为6的倍数，最终输出true");
        boolean b = i == 6 | y == 6 & x;
        System.out.println(b);
    }
}
