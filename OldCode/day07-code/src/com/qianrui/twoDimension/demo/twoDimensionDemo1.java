package com.qianrui.twoDimension.demo;

public class twoDimensionDemo1 {
    public static void main(String[] args) {
        //1.二维数组静态初始化
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6, 7, 8}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6, 7, 8}};

        //以后建议这样写,把每一个一维数组单独写成一行
        //注意:每一个一维数组其实是二维数组中的元素,所以每一个一维数组之间需要用都好隔开.
        int[][] arr3 = {
                {1, 2, 3},
                {4, 5, 6, 7, 8}
        };

        //2.获取元素
        System.out.println(arr3[0]);  //表示获取二维数组中的第一个一维数组   [I@16b98e56
        System.out.println(arr3[0][0]);  //表示获取二维数组中第一一维数组中的 0 索引元素\


        //3.二维数组遍历

        //外循环:遍历二维数组,得到里面的每一个一维数组
        for (int i = 0; i < arr3.length; i++) {
            //此时i表示二维数组中的每一个索引,相当于是表示每一个一维数组

            //内循环:遍历一维数组,得到里面的每一个元素
            for (int j = 0; j < arr3[i].length; j++) {
                //此时j表示一维数组中的每一个元素
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
