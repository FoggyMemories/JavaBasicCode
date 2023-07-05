package com.qianrui.day04.loop;

import java.util.Random;
import java.util.Scanner;

public class Loop_RandomTest1 {
    public static void main(String[] args) {
        //需求:程序自动生成一个1~100之间的随机数字,使用程序实现猜出这个数字是多少.


        //扩展小需求：加一个保底，10次猜不中，直接给答案。

        int count = 0;   //添加一个计数器：提示已经猜过的次数
        Random r = new Random();   //生成的随机数不能放在while循环里面
        int a = r.nextInt(100) + 1;
        System.out.println("现在系统已经生成了一个1 ~ 100的整数,请你猜出系统所随机产生的数字");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个这个整数:");
            int b = sc.nextInt();

            count++;

            if(count == 10){
                System.out.println("触发保底机制，自动给出结果，这个随机数是：" + a);
                break;
            }

            if (b <= 100 && b >= 1) {
                if (a < b) {
                    System.out.println("您输入的数字大了.");
                } else if (a > b) {
                    System.out.println("您输入的数字小了.");
                } else if (a == b) {
                    System.out.println("恭喜,您猜对了");
                    break;
                }
            } else {
                System.out.println("您输入的数字有误,请重新输入一个1 ~ 100的效整数");
            }
        }
    }
}
