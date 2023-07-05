package com.qianrui.order;

import java.util.Scanner;

public class FTCtest {
    public static void main(String[] args) {
        System.out.println("网虫:该去休息了,明天还有课呢!");
        System.out.println("请输入一个时间整数:");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

            switch(x) {
                case 5,6,7 -> System.out.println("早上好！");
                case 8,9,10,11 -> System.out.println("上午好！");
                case 12,13,14,15,16,17 -> System.out.println("下午好！");
                case 18,19,20 -> System.out.println("晚上好！");
                case 21,22,23 -> System.out.println("祝你晚安!");
                default -> System.out.println("您所输入的时间有误.");
            }

    }
}
