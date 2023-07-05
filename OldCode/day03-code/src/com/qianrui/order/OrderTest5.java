package com.qianrui.order;

import java.util.Scanner;

public class OrderTest5 {
    public static void main(String[] args) {
        //练习：影院选座
        /*
        假设莫影院售卖了100张票，票的序号为1~100
        其中奇数票号坐左侧，偶数票号坐右侧
        键盘录入一个整数表示电影票的票号。
        根据不同情况，给出不同的提示：
        如果票号为技术，那么打印坐左边，
        如果偏好为偶数，那么打印坐右边。
         */

        System.out.println("请输入你的票号：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a >= 0 && a <= 100) {

            int x = a % 2;

            if (x == 0) {
                System.out.println("请坐右边。");
            } else {
                System.out.println("请坐左边。");
            }
        } else{
            System.out.println("输入的号码有误。");
        }
    }
}
