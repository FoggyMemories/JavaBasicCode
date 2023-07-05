package com.qianrui.order;

import java.util.Scanner;

public class OrderDemo2 {
    public static void main(String[] args) {
        //需求：定义变量记录女婿的酒量，如果女婿的酒量大于2斤，老丈人就搭理他，否则就不搭理。
        System.out.println("请输入你的酒量：");
        Scanner sc = new Scanner(System.in);
        int wine = sc.nextInt();

        if(wine > 2){
            System.out.println("小伙子，不错！");
        }
        /*
        执行流程：
        1.首先计算关系表达式的值
        2.如果关系表达式的值为true就执行语句体
        3.如果关系表达式的值为false就不执行语句体
        4.继续执行后面的其他语句

        if注意事项：
        1.大括号的开头可以另起一行数学，但是建议在第一行末尾书写
        2.在语句体中，如果只有一句代码，大括号可以忽略不写。但是尽量不建议这样写，应该按照规范来写。
        3.如果对一个布尔类型的变量进行判断，不要用 == 号。  直接将变量写在小括号里即可

         */
    }
}
