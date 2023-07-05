package com.qianrui.order;

import java.util.Scanner;

public class OrderTest6 {
    public static void main(String[] args) {
        //练习:小明的礼物
        /*
        小明的考试成绩,如果为95~100分,就送他自行车一辆
                    ,如果94~90分,就带他去游乐场玩
                    ,如果89~80分,就送他一个变形金刚玩具
                    ,如果分数低于80分,就揍他一顿
         */

        System.out.println("请输入小明的期末成绩:");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        if(x >= 0 && x <= 100) {
            if (x <= 100 && x >= 95) {
                System.out.println("送小明一辆自行车。");
            } else if (x < 95 && x >= 90) {
                System.out.println("带小明去游乐场玩一天。");
            } else if (x < 90 && x >= 80) {
                System.out.println("送小明一个变形金刚玩具。");
            } else {
                System.out.println("给小明揍一顿");
            }
        } else{
            System.out.println("所输入的成绩有误。");
        }
    }
}
