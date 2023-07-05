package com.code.apiStringTest;

import java.util.Scanner;

public class StringTest1 {
    public static void main(String[] args) {
        /*
        键盘例如一个字符串，
        统计该字符串中大写字母字符，
        小写字母字符，数字字符出现的次数
         */
        //1.进行键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //2.统计
        //定义三个计数器
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            //i 依次表示字符串中的每一个索引
            char c = str.charAt(i);
            //进行字符的判断
            if (c >= 'a' && c <= 'z') {
                //char类型的变量在参与计算的时候自动类型提升为int 查询ascii码表
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if(c >= '0' && c <= '9'){
                numberCount++;
            }
        }
        System.out.println("这个字符串中大写字母有：" + bigCount + "个");
        System.out.println("这个字符串中小写字母有：" + smallCount + "个");
        System.out.println("这个字符串中数字有：" + numberCount + "个");
    }
}
