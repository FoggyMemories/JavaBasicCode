package com.qianrui.test1.order;

import java.util.Scanner;

public class OrderTest3 {
    public static void main(String[] args) {
        /*
        需求：键盘录入一个整数，表示身上的钱。
              如果大于等于100块，就吃网红餐厅。
              否则，就吃经济实惠的沙县小吃。
         */

        System.out.println("请输入你身上所带的现金整数：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a >= 100){
            System.out.println("你可以去吃网红餐厅。");
        } else{
            System.out.println("你可以去吃沙县小吃。");
        }
    }
}
