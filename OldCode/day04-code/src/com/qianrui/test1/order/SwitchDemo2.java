package com.qianrui.test1.order;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        System.out.println("键盘录入一个整数表示今天周几:");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        switch(x){
            case (1):
                System.out.println("今天去跑步.");
                break;
            case (2):
                System.out.println("今天去游泳.");
                break;
            case (3):
                System.out.println("今天慢走.");
                break;
            case (4):
                System.out.println("今天骑动感单车.");
                break;
            case (5):
                System.out.println("今天去拳击.");
                break;
            case (6):
                System.out.println("今天去爬山.");
                break;
            case (7):
                System.out.println("今天去好好吃一顿.");
                break;
            default:
                System.out.println("您所输入的星期数有误.");
                break;
        }
    }
}
