package com.qianrui.exercise;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        /*
        将加密后的数据解密出来
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个需要解密的数字：");
        int number = sc.nextInt();

        int tempRun = number;

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }


        int[] arr = new int[count];
        System.out.println(tempRun);

        int index = arr.length - 1;
        while (tempRun != 0) {
            int x = tempRun % 10;
            tempRun /= 10;
            arr[index] = x;
            index--;
        }


        //1.定义数组记录解密之后的结果
        System.out.print("解密前数据为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //2.反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println();

        //验证反转之后的结果
        System.out.print("反转后的数据为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //由于加密是对10取余，解密的时候需要分段处理  ， 在0~4之间需要+10，在5~9之间不变
        //反去余
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 4 && arr[i] >= 0) {
                arr[i] += 10;
            }
        }
        System.out.println();
        System.out.print("反去余之后的的数据为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //解密
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 5;
        }
        System.out.println();
        System.out.print("解密之后的数据为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result * 10 + arr[i];
        }

        System.out.println();
        System.out.println("解密过后的数字为：" + result);
    }
}
