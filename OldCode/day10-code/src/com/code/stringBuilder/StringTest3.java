package com.code.stringBuilder;

import java.util.Scanner;

public class StringTest3 {
    public static void main(String[] args) {
        //链式编程
        //当我们调用一个方法时,不需要用变量接收他的结果,可以继续调用其他方法

        int len = getString().substring(1).replace("A", "Q").length();
        System.out.println(len);
    }
    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        return str;
    }
}
