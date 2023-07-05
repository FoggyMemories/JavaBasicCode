package com.qianrui.order;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        System.out.println("请输入你想吃的面");
        Scanner sc = new Scanner(System.in);

         String noodles = sc.next();

         switch(noodles){
             case "兰州拉面":
                 System.out.println("妈妈给你做兰州拉面");
                 break;
             case "武汉热干面":
                 System.out.println("妈妈给你做武汉热干面");
                 break;
             case "北京炸酱面":
                 System.out.println("妈妈给你做北京炸酱面");
                 break;
             case "陕西油泼面":
                 System.out.println("妈妈给你做陕西油泼面");
                 break;
             default:
                 System.out.println("妈妈不会做,自己吃泡面去");
                 break;
         }
    }
}
