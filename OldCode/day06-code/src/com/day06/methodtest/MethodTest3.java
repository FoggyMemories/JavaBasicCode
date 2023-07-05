package com.day06.methodtest;

import java.util.Scanner;

public class MethodTest3 {
    public static void main(String[] args) {
        /*
        练习:人肉计算机2
            需求:定义一个方法,求圆的面积,将结果在方法中进行打印
         */
        double pi = 3.1415926535;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入元的半径");
        double r = sc.nextDouble();
        area(pi,r);

    }
    public static void area(double pi,double r){
        double area = pi * Math.pow(r,2);
        System.out.println("这个圆的面积是:");
        System.out.println(area);
    }
}
