package com.qianrui.test1.order;

import java.util.Scanner;

public class OrderTest7 {
    public static void main(String[] args) {
        //练习：商品的价格
        /*
          需求：
          商场都会有VIP的会员制，根据不同的会员会有不同的折扣。
          假设商品的总价为1000.
          键盘录入会员级别，并计算出实际支付的钱。
          会员等级1：打9折；
          会员等级2：打8折；
          会员等级3：打7折；
          非会员：不打折，要打也是打骨折。
         */

        int a = 1000;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员的等级");

        int x = sc.nextInt();
        if(x >= 0 && x <= 3){
            if(x == 1){
                System.out.println("尊敬的会员1级，此次您所支付的金额为：");
                System.out.println(a * 0.9);
            } else if(x == 2){
                System.out.println("尊敬的会员2级，此次您所支付的金额为：");
                System.out.println(a * 0.8);
            } else if(x == 3){
                System.out.println("尊敬的会员3级，此次您所支付的金额为：");
                System.out.println(a * 0.7);
            }
        } else{
            System.out.println("亲爱的顾客，您还不是本店的会员嗷。");
            System.out.println("不打折，要打也是打骨折！");
        }
    }
}
