package com.day05.demo;

public class Array {
    public static void main(String[] args) {
        /*
        什么是数组？
            数组是指一种容器，可以用来储存 同种数据类型 的多个值。
            *数组容器在存储数据的时候，需要结合隐式转换考虑。
            *例如：int类型的数组容器可以存放（byte short int）
            *例如：double类型的数组容器（byte short int long float double）
            **建议：容器的类型应该与存储的数据保持一致
         */

        /*
        数组的定义：
            格式:1.数据类型[] 数组名
                 范例：int [] array
                 2.数据类型 数组名[]
                 范例:int array[]
         */

        /*
        数组的初始化
            初始化:就是在内存中,为数组容器开辟空间,并将数据存入容器中的过程.

            数组初始化的两种方式:
            1.静态初始化:
                *完整格式:数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3…};
                **范例:int[] array = new int[]{11,22,33};
                **范例:double[] array2 = new double[]{11.1,22.2,33.3};
                ***省略格式:数据类型[] 数组名 = {元素1,元素2,元素3……};
                ***省略格式示范:int[] array = {11,22,33};

            2.动态初始化:初始化时只指定数组长度,由系统为数组分配初始值
                *格式:数组类型[] 数组名 = new数组类型[数组长度];
                **范例:int[] arr = new int[3];

         */
    }
}
