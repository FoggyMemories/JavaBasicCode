package com.day06.methodtest;

public class MethodTest5_1 {
    public static void main(String[] args) {
        /*
        练习：数组最大值
             需求：设计一个方法求数组的最大值，并将最大值返回
         */
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int max = getMax(arr);

        System.out.println(max);
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] >= max){
                max = arr[i];
            }
        }
        return max;
    }
}
