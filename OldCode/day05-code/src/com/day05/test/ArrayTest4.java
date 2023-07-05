package com.day05.test;

public class ArrayTest4 {
    public static void main(String[] args) {
        /*
        练习:求最值
            需求:已知数组元素为{33,5,22,44,55}
                请找出数组中最大值并打印在控制台
         */
        int[] arr = {33,5,22,44,55};

        //求最值:
        //1.定义max变量准备记录数值的变化
        int max = arr[0];  //临时认为 0 索引的数据是最大的  **max的初始值一定要是数组中的值
        //2.遍历数组获取每一个元素
        for (int i = 0; i < arr.length; i++) {
            //3.让每一个元素跟max进行比较,如果找到更大的,就让max记录该值
            if(arr[i] > max){
                max = arr[i];
            }
        }
        //4.当循环结束之后,max记录的就是数组中的最大值
        System.out.println(max);  //55

        //求数组中的最小值
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {  //从第 1 索引开始进行对比,不去进行 0 索引上的重复运算,提升运算效率
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);  //5
    }
}
