package com.qianrui.order;

import java.util.Scanner;

public class OrderTest4 {
    public static void main(String[] args) {
        /*
            商品付款
            在实际开发中，如果要根据两种不同的情况来执行不同的代码，就需要用到if的第二种格式

            需求：
            假设，用户在超市实际购买，商品总价为600元。
            键盘录入一个整数表示用户实际支付的钱。
            如果支付大于等于600，表示付款成功，否则付款失败。

         */

        System.out.println("请输入你所支付钱的数目：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        if(a < 600){
            System.out.println("此次支付失败");
        } else{
            System.out.println("此次支付成功");
        }
    }
}
