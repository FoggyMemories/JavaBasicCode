package com.code.work;

import java.util.Scanner;

public class work1 {


    //使用StringBuilder的场景；
    //1.字符串的拼接
    //2.字符串的反转
    public static void main(String[] args) {
        /*
        练习:对称字符串
            需求:键盘接收一个字符串,程序哦按段出该字符串是否时对称字符串,
            并在控制台打印是或不是对称字符串
            对称字符串:123321、111
            非对称字符串：123123
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        //反转键盘录入的字符串
        String result = new StringBuilder().append(str).reverse().toString();


        //进行比较
        if (str.equals(result)) {
            System.out.println("当前字符串为对称字符串");
        } else {
            System.out.println("当前字符串不为对称字符串");
        }
    }
}
