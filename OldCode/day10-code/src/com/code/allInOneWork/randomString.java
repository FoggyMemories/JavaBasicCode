package com.code.allInOneWork;

import java.util.Random;
import java.util.Scanner;

public class randomString {
    public static void main(String[] args) {
        //键盘输入任意字符串,打乱里面的内容
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        System.out.println("您所输入的字符串为:" );
        System.out.println(str);

        //将自负床转化为字符数组
        char[] arr = str.toCharArray();

        char temp;
        for (int i = 0; i < arr.length; i++) {
            int arrRandom = r.nextInt(arr.length);
            temp = arr[i];
            arr[i] = arr[arrRandom];
            arr[arrRandom] = temp;
        }

        String s = new String(arr);
        System.out.println("随机打乱的字符串为:");
        System.out.println(s);
    }
}
