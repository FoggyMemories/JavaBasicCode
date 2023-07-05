package com.code.keybordinput;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        //键盘录入的两套体系不能混用
        //弊端：先用nextInt,再用nextLine会导致下面的nextLIne接收不到数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        System.out.println(num);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();
        System.out.println(line);

        //优先使用第一套体系去使用键盘录入
    }
}
