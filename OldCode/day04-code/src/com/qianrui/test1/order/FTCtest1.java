package com.qianrui.test1.order;

import java.util.Scanner;

public class FTCtest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        if(x > 5 && x <= 23){
            if(x >= 5 && x < 8){
                System.out.println("早上好!");
            }else if(x >= 8 && x < 12){
                System.out.println("上午好!");
            }else if(x >= 12 && x < 18){
                System.out.println("下午好!");
            }else if(x >= 18 && x < 21){
                System.out.println("晚上好!");
            }else if(x >= 21 && x < 23){
                System.out.println("祝你晚安!");
            }

        }else {
            System.out.println("您所输入的时间有误.");
        }
    }
}
