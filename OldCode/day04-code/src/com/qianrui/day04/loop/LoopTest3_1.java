package com.qianrui.day04.loop;

import java.util.Scanner;

public class LoopTest3_1 {
    public static void main(String[] args) {
        /*
        练习：求质数
            需求：键盘录入一个正整数x，判断该证书是否为一个质数。
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个正整数：");
        int x = sc.nextInt();

        //标记思想：
        //定义一个变量，表示标记；
        //标记着x是否为一个质数

        boolean flag = true;

        for(int a = 2;a <= x - 1;a++){
            //a一次表示这个范围之内的每一个数字
            //看x是否能被a整除
            if(x % a == 0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("该数:" + x + "为一个质数");
        } else{
            System.out.println("该数:" + x + "为一个合数");
        }
    }
}
//不能用else来去直接判断是否为一个质数，应该用标记的方法用boolean去判断。