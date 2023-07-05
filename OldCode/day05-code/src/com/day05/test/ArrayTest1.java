package com.day05.test;

public class ArrayTest1 {
    public static void main(String[] args) {
        /*
        练习:遍历数组并求和
            需求:定义一个数组,存储1,2,3,4,5
                遍历数组得到每一个元素,求数组里面所有数据和
         */

        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //此时i表示的是数组中每一个索引,而不是数组中的具体数据
            //arr[i] 依次表示数组里面的每一个元素
            sum += arr[i];
            System.out.println(arr[i]);
        }
        System.out.println(sum);
    }
}
