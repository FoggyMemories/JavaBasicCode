package com.day06.methodtest;

import java.util.Scanner;

public class MethodTest2 {
    public static void main(String[] args) {
        /*
        练习:人肉计算机1
            需求:定义一个方法,求长方形的周长,将结果在方法中进行打印.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入长方形的第一个边长:");
        double a = sc.nextDouble();
        System.out.println("请输入长方形的另一条边的长度:");
        double b = sc.nextDouble();
        circumference(a,b);


    }
    public static void circumference(double a,double b){
        double C = (a + b) * 2;
        System.out.println(C);
    }
}
