package com.qianrui.exercise;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
        案例：卖飞机票
            需求：机票价格按照淡季旺季、头等舱和经济舱、输入机票原价、月份和头等舱或经济舱。
                 按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折。
                                        淡季（11月到来年4月）头等舱7折，经济舱6.5折。
         */


        //ctrl + alt + M 自动抽取方法
        System.out.println("请输入当前购买机票的原价：");
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        System.out.println("请输入您所购买机票的仓位：(0 表示头等舱 ， 1表示经济舱)");
        int seat = sc.nextInt();
        System.out.println("请输入购买机票时的月份：");
        int time = sc.nextInt();

        if (time <= 10 && time >= 5) {
            System.out.println("现在正值旺季！");
            run1(price, seat, 0.9, 0.85);
        } else if ((time >= 1 && time <= 4) || (time >= 11 && time <= 12)) {
            System.out.println("现在正值淡季！");
            run1(price, seat, 0.7, 0.65);
        } else {
            System.out.println("您所录入的日期有误。");
        }
    }


    public static void run1(double price, int seat, double v1, double v2) {
        if (seat == 0) {
            price *= v1;
            System.out.println("您所购买的机票座舱为：头等舱，实际价格为" + price);
        } else if (seat == 1) {
            price *= v2;
            System.out.println("您所购买的机票座舱为：经济舱，实际价格为" + price);
        } else {
            System.out.println("您所输入的仓位有误。");
        }
    }
}

