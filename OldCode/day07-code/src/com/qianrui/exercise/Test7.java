package com.qianrui.exercise;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        //1.计算出数组的长度
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个需要加密的整数");
        int number = sc.nextInt();
        //定义一个变量来临时记录number的值，再次使用的时候不会改变该值。
        int temp = number;

        //定义一个数值来记录数字的长度
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        int[] arr = new int[count];
        System.out.println(temp);

        int index = arr.length - 1;//定义一个数字为索引
        //获取temp里面的每一位数字
        while (temp != 0) {
            //获取temp里面的每一位数字
            int x = temp % 10;
            //再去掉最右边的一位数字
            temp /= 10;
            //把当前获取到的个位添加到数组当中
            arr[index] = x;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("该数字每位加5过后为：");
        //开始加密：每位数字先加 5
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
            System.out.print(arr[i] + " ");
        }


        System.out.println();
        System.out.println("该数每位对10取余后为：");
        //再对每位数进行对10的取余
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 10;
            System.out.print(arr[i] + " ");
        }


        System.out.println();
        //再对每位数进行反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp1 = arr[i];
            arr[i] = arr[j];
            arr[j] = temp1;
        }

        //进行对加密过后的数字进行遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        int number1 = 0;
        for (int i = 0; i < arr.length; i++) {
            number1 = number1 * 10 + arr[i];
        }
        System.out.println("加密过后的数字是:" + number1);
    }
}
