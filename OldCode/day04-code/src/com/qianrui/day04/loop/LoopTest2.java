package com.qianrui.day04.loop;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        /*
        练习：求平方根
            需求：键盘录入一个大于等于2的整数x，并计算返回x的平方根。
            结果只保留整数部分，小数部分将被舍去。
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个大于等于2的整数x：");
        int x = sc.nextInt();

        System.out.println("整数" + x + "的平方根为：" + Math.sqrt(x));

        if(x >= 2){
            for(int i = 1;i <= x;i++){
                if(i * i == x){
                    System.out.println(i + "就是" + x + "的平方根");
                    break;
                    //一旦找到了，循环就可以停止了，后面的数字就不需要再找了，提高代码的运行效率。
                } else if(i * i > x){
                    System.out.println((i - 1) + "就是" + x + "的整数平方根");
                    break;
                }
            }

        } else{
            System.out.println("您所输入的数字有误");
        }
    }
}
