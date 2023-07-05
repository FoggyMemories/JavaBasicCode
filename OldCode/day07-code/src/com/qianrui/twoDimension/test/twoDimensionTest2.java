package com.qianrui.twoDimension.test;

public class twoDimensionTest2 {
    public static void main(String[] args) {
        /*
    二维数组的动态初始化
        格式:数据类型[][] 数组名 = new 数据类型[m][n];
             m表示这个二维数组可以存放多少个一维数组
             n表示每一个一维数组可以存放多少个元素
        范例:int[][] arr = new int[2][3];
             该二维数组表示可以存放2个一维数组,每个一维数组中可以存放3个int类型的元素
     */


        //1.利用动态初始化格式创建二维数组
        int[][] arr = new int[3][5];
        //表示这个二维数组长度为3,可以存放3个一维数组,每个一维数组可以存放5个int类型的元素

        arr[0][0] = 10;

        //2.遍历二维数组
        //外循环:遍历二维数组获取里面的每一个数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
