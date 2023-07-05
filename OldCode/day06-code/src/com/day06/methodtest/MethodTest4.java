package com.day06.methodtest;

import java.util.Scanner;

public class MethodTest4 {
    public static void main(String[] args) {
        /*
        练习：比较大小
            需求：定义方法，比较两个长方形的面积
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个长方形的长和宽：");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("请输入第二个长方形的长和宽：");
        int i = sc.nextInt();
        int u = sc.nextInt();
        compare(x,y,i,u);

    }
    public static void compare(double len1,double width1,double len2,double width2){
        double area1 = len1 * width1;
        double area2 = len2 * width2;

        if(area1 < area2){
            System.out.println("第二个长方形面积更大");
        } else{
            System.out.println("第一个长方形面积更大");
        }
    }
}
