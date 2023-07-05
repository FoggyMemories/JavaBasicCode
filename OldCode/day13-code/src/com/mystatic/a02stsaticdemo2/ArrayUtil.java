package com.mystatic.a02stsaticdemo2;

public class ArrayUtil {


    //私有化构造方法
    //目的：不让外界创建他的对象
    private ArrayUtil() {
    }

    //需要定义为静态的，方便调用
    //遍历数组
    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }


    //返回平均值
    public static double getAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
