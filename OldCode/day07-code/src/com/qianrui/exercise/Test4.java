package com.qianrui.exercise;

public class Test4 {
    public static void main(String[] args) {
        /*
        练习：数组元素的复制
            需求：把一个数组中的元素复制到另一个新数组中去。
         */

        //1.定义一个老数组并储存一些元素
        int[] arr = {1, 2, 3, 4, 5};
        //2.定义一个新数组，新数组的长度应该和老数组的长度一致
        int[] newArr = new int[arr.length];
        //3.遍历老数组，得到老数组中的每一个元素，并依次存入到新数组当中
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  //i表示老数组中的索引   同时也可以代表新数组中的索引
            //arr[i] 表示老数组中的元素
            newArr[i] = arr[i];
        }

        System.out.println();
        //4.循环结束后，表示新数组中存满元素
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
