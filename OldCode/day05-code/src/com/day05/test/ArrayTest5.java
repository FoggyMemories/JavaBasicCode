package com.day05.test;

import java.util.Random;

public class ArrayTest5 {
    public static void main(String[] args) {
        /*
        练习:遍历数组求和
            需求:生成10个1~100之间的随机数存入数组.
            1.求出所有数据的和
            2.求出所有数据的平均数
            3.统计有多少个数据比平均值小
         */
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //每循环一次就会生成一个新的随机数
            int num = r.nextInt(100)+1;
            arr[i] =num;
        }

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");   //将后面的ln删除,该数据就不会换行了 , 用拼接的方式在后面添加一个空格,表示间隔
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("\n" + "这个数组中所有数据的和为:" + sum);

        System.out.println("这个数组中所有数据的平均数为:" + sum / arr.length);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < sum / arr.length){
                count++;
            }
        }
        System.out.println("该数组中有" + count + "个数据小于该数的平均数");
    }
}
