package com.qianrui.a09arraysdemo9;

import java.util.Arrays;

public class MyArraysDemo1 {
	public static void main(String[] args) {
        /*

            public static String toString(数组)                   把数组拼成一个字符串
            public static int binarySearch(数组,查找的元素)        二分查找法查找元素
            public static int[] copyOf(原数组,新数组长度)          拷贝数组
            public static int[] copyOfRange(元素组,起始索引,结束索引)拷贝数组(指定范围)
            public static void fill(数组,元素)                     填充数组
            public static void sort(数组)                         按照默认方式进行数组排序
            public static void sort(数组,排序规律)                 按照指定的规律排序

         */

		//toString:将数组变成字符串
		System.out.println("---------------toString------------------");
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(Arrays.toString(arr));

		//binarySearch:用二分查找元素
		//前提:数组中的元素必须是有序的,且数组中的元素必须是升序的
		//如果查找的元素是存在的:那么返回的是真实的索引值
		//如果查找的元素是不存在的:那么返回的是 -插入点 - 1
		//疑问:为什么-插入点 要 -1?
		//解释:如果此时我们要查找数字0,那么如果仅返回的值是 -插入点 ,此时就会出现问题
		//如果查找数字0,此时0是不存在的,但是按照上面的规则 -插入点,应该就是 -0
		//为了避免误解,Java就在这个基础上又减去1
		System.out.println("---------------binarySearch------------------");
		System.out.println(Arrays.binarySearch(arr, 10));
		System.out.println(Arrays.binarySearch(arr, 2));
		System.out.println(Arrays.binarySearch(arr, 20));

		//copyOf:拷贝数组
		System.out.println("---------------copyOf------------------");
		/**
		 * 参数一:老数组
		 * 参数二:新数组的长度
		 * 方法的底层会根据第二个参数来创建新的数组
		 * 如果新数组的长度是小于老数组的长度,那么就会部分备份
		 * 如果新数组的长度是等于老数组的长度,会完全拷贝
		 * 如果新数组的长度是大于老数组的长度,会补上默认初始化值
		 **/
		int[] newArr1 = Arrays.copyOf(arr, 5);
		System.out.println(Arrays.toString(newArr1));

		//copyOfRange:拷贝数组(指定范围)
		//包头不包尾,包左不包右
		System.out.println("---------------copyOfRange------------------");
		int[] newArr2 = Arrays.copyOfRange(arr, 0, 9);
		System.out.println(Arrays.toString(newArr2));

		//fill:填充数组/覆盖元素
		System.out.println("---------------fill------------------");
		Arrays.fill(arr, 100);
		System.out.println(Arrays.toString(arr));

		//sort:排序. 默认情况下,给基本数据类型进行升序排列,底层使用的是快速排序
		System.out.println("---------------sort------------------");
		int[] arr2 = {10, 2, 3, 5, 6, 1, 7, 8, 4, 9};
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));


	}
}
