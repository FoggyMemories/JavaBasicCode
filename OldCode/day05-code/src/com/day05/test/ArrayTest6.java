package com.day05.test;

public class ArrayTest6 {
    public static void main(String[] args) {
        //交换两个变量
        int a = 10;
        int b = 20;
        System.out.println("变换之前的数据是" + a + " " + b);
        //定义一个临时变量来保存初始的数据
        int temp = a;
        a = b;
        b = temp;

        System.out.println("变换之后的数据是" + a + " " + b);

        /*
        练习：交换数组中的数据
            需求：定义一个数组，存入1,2,3,4,5.按照要求交换索引对应的元素.
                交换前:1,2,3,4,5
                交换后:5,4,3,2,1
         */

        //1.定义一个数组
        int[] arr = {1, 2, 3, 4, 5};
        //利用循环交换数据
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            //交换变量i和变量j指向的元素
            int temp1 = arr[i];
            arr[i] = arr[j];
            arr[j] = temp1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
