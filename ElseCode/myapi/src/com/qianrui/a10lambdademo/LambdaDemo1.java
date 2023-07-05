package com.qianrui.a10lambdademo;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo1 {
	public static void main(String[] args) {
		//初识lambda表达式

        /*

            Lambda表达式是JDK8还是后的一种新语法形式

                () -> {

                }


            * () 对应着方法的形参
            * -> 固定格式
            * {} 对应着方法的方法体

         */
		Integer[] arr = {2, 3, 1, 5, 6, 7, 8, 4, 9};
        /*
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        */

        /*
        Arrays.sort(arr, (Integer o1, Integer o2) ->{
                return o1 - o2;
            }
        );
        */

		Arrays.sort(arr, Comparator.comparingInt((Integer o) -> o));


		System.out.println(Arrays.toString(arr));

        /*
        函数式编程
            函数式编程(Functional programming)是一种思想特点
        函数式编程思想,忽略面向对象的复杂语法, **强调做什么,而不是谁去做**
         */

	}
}
