package com.qianrui.order;

import java.util.Scanner;

public class SwitchTest3 {
    /*
    练习:回文数
        需求:给你一个整数x.
            如果x是一个回文整数,打印true,否则,返回false.
        解释:回文数是指正序(从左向右)和倒序(从右向左)读都是一样的整数.
        例如:121是回文,而123不是.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int i = sc.nextInt();

        int num = 0;
        int u = i;  //定义一个临时的变量,记录i原来的值,用于最后比较.

        while(u != 0){
            //从右往左获取每一位数字
            int x = u % 10;
            //修改一下i所记录的值
            u /= 10;

            num = num * 10 + x;  //把当前获取的数字拼接到最右边
        }
        System.out.println(num);

        System.out.println(i);

        System.out.println(num == i);
    }
}
