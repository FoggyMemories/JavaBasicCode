package com.qianrui.day04.loop;

public class LoopTest1 {
    public static void main(String[] args) {
        /*
        练习:逢7过
            游戏规则:
                    从任意一个数字开始报数,当你要报的数字是报含7或者7的
                    倍数时都要说过:过;
            需求:使用程序在控制台打印出1~100之间的满足逢7过游戏规则的数据
         */
        for (int i = 1; i <= 100; i++) {
            if(i % 7 == 0 || i / 10 % 10 == 7 || i % 10 == 7){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
