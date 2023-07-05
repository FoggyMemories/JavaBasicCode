package com.day06.methoddemo;

import java.util.Scanner;

public class MethodDemo5 {
    public static void main(String[] args) {
        /*
        练习:人肉计算机
            需求:定义一个方法,求一家商场每个季度的营业额.
                根据方法结果再计算出全年营业额.
         */
        //目标:掌握带返回值方法的定义和调用格式


        //调用方法1. 直接调用
        getSum(10,20,30);   //一般适用于不进行打印时

        //调用方法2. 赋值调用
        int sum = getSum(10,20,30);
        System.out.println(sum);

        //调用方法3. 输出调用
        System.out.println(getSum(10,20,30));

        System.out.println("请输入第一个季度的营业额(分月输入)");
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        int sum1 = getSum(a1,a2,a3);


        System.out.println("请输入第二个季度的营业额(分月输入)");
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();
        int sum2 = getSum(b1,b2,b3);

        System.out.println("请输入第三个季度的营业额(分月输入)");
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        int sum3 = getSum(c1,c2,c3);
        
        System.out.println("请输入第四个季度的营业额(分月输入)");
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();
        int sum4 = getSum(d1,d2,d3);

        int total = sum1 + sum2 + sum3 + sum4;
        System.out.println("全年的营业额为:");
        System.out.println(total);
    }

    public static int getSum(int num1,int num2,int num3){
        int result = num1 + num2 + num3;
        return result;   //返回给方法的调用处   将result赋值返回给getsum
    }
}
