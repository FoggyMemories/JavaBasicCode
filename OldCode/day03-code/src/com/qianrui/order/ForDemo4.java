package com.qianrui.order;

import java.util.Scanner;

public class ForDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int x = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int y = sc.nextInt();

        int c = 0;
        int count = 0;

        if(x < y){
            for(int i = x;i <= y;i++){
                if(i % 3 == 0 && i % 5 == 0){
                    count++;
                    c += i;
                    System.out.println("在这个范围内所有能被3和5整除的数字一共有" + count + "个");
                }
            }
            System.out.println("在这个范围内所有能被3和5整除的整数之和为：");
            System.out.println(c);
        } else if(x > y){
            for(int i = y;i <= x;i++){
                if(i % 3 == 0 && i % 5 == 0) {
                    count++;
                    c += i;
                    System.out.println("在这个范围内所有能被3和5整除的数字一共有" + count + "个");
                }
            }
            System.out.println("在这个范围内所有能被3和5整除的整数之和为：");
            System.out.println(c);
        }
    }
}
