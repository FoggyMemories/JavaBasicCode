package com.code.apiStringTest;

import java.util.Scanner;

public class StringTest3 {
    public static void main(String[] args) {
        /*
        字符串反转
            定义一个方法，实现字符串反转反转
            键盘录入一个字符串，调用该方法后，在控制台输出结果
            例如：键盘录入 abc，输出结果cba
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String result = reversal(sc.next());
        System.out.println("这个字符串反转过后是：");
        System.out.println(result);
    }

    //定义一个方法
    //实现字符串的反转
    public static String reversal(String str){
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {    //shift + f6
            //i 一次表示字符串中每一个索引 （ 倒着的 ）
            char c = str.charAt(i);
            result = result + c;
        }

        return result;
    }
}
