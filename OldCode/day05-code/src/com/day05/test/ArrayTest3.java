package com.day05.test;

public class ArrayTest3 {
    public static void main(String[] args) {
        /*
        练习:变化数据
            需求:定义一个数组,存储1,2,3,4,5,6,7,8,9,10
                遍历数组得到每一个元素.
            要求:1,如果是奇数,则将当前数字扩大两倍
                 2,如果是偶数,则将当前数字变成二分之一
         */

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                arr[i] /= 2;
            } else{
                arr[i] *= 2;
            }
            System.out.println(arr[i]);
            //以后尽量不要这样写,一个循环尽量只敢一件事.
        }   //正确方式应该是将该句打印放在单独的一个循环中打印
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
