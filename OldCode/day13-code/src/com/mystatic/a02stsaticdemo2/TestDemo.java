package com.mystatic.a02stsaticdemo2;

public class TestDemo {
    public static void main(String[] args) {
        //测试工具类中的两个方法是否正确

        int[] arr1 = {1, 2, 3, 4, 5};
        String str1 = ArrayUtil.printArr(arr1);
        System.out.println(str1);


        double[] arr2 = {1.5, 2.6, 3.5, 2.1, 5.6, 0.3, 6.1};
        double str2 = ArrayUtil.getAverage(arr2);
        System.out.println(str2);
    }
}
