package com.study.search;

import java.util.ArrayList;
import java.util.List;

public class A01_BasicSearchTest2 {
	public static void main(String[] args) {
		//课堂练习
		//需求:定义一个方法利用基本查找发,查询某个元素在数组中的索引
		//要求:需要考虑数组中元素重复

		int[] arr = {131, 127, 147, 81, 103, 23, 7, 79, 81, 210, 81};

		int number = 81;

		List<Integer> list = basicSearch(arr, number);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}


	}

	private static List<Integer> basicSearch(int[] arr, int number) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				list.add(i);
			}
		}
		return list;
	}
}
