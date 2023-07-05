package com.qianrui.exercise;

public class Test2 {
    public static void main(String[] args) {
        /*
        练习：找质数
            判断 101 ~ 200之间有多少个质数，并打印所有质数。
         */

        int count = 0;
        for (int i = 101; i <= 200; i++) {  //外循环
            //i 一次表示循环中的每一个数字

            //继续判断i 是否为一个质数
            boolean flag = true;//标定作用
            for (int j = 2; j < i; j++) {   //内循环
                //判断i是否为一个质数
                if(i % j == 0 ){
                    flag = false;
                    break;  //此时break跳出的是单层循环
                }
            }
            if(flag){
                System.out.println("在101~200范围内数字" + i + "是质数");
                count++;
            }
        }
        System.out.println("在101~200范围内数字一共有" + count + "个数字");
    }
}
