package com.qianrui.test1.order;

import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {
        /*
        练习:求商和余数
            需求:
                给定两个整数,被除数和除数(都是正数,且不超过int的范围).
                将两数相除,要求不适用乘法、除法和%运算符。
                得到商和余数。
         */
        System.out.println("请录入第一个整数:(在int的范围之内)");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("请录入第二个整数:(在int的范围之内)");
        int u = sc.nextInt();


        int count = 0;
        if(i < u) {
            while (i < u){
                u = u - i;
                count++;
            }
            System.out.println("这两个数相除的余数是:" + u);
            System.out.println("这两个数相除的商是:" + count);
        } else if(u < i){
            while(u < i){
                i = i - u;
                count++;
            }
            System.out.println("这两个数相除的余数是:" + i);
            System.out.println("这两个数相除的商是:" + count);
        } else{
            System.out.println("这两个数相除的余数是0");
            System.out.println("这两个数相除的商是1");
        }
    }
}
