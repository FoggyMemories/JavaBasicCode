package com.study.search;

public class A01_BasicSearchTest1 {
	public static void main(String[] args) {

		//课堂练习
		//需求:定义一个方法利用基本查找发,查询某个元素在数组中的索引
		//要求:不需要考虑数组中元素是否重复
		int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};

		int number = 81;
		int i = basicSearch(arr, number);
		System.out.println(i);
		System.out.println(arr[i]);
	}

	private static int basicSearch(int[] arr, int number) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				return i;
			}
		}
		return -1;
	}
}
