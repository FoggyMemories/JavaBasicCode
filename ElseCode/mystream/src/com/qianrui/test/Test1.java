package com.qianrui.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
	public static void main(String[] args) {
        /*
        定义一个集合，并添加一些整数  1,2,3,4,5,6,7,8,9,10
        过滤奇数，只留下偶数。
        并将结果保存起来
        */

		//1.定义一个集合
		ArrayList<Integer> list = new ArrayList<>();

		//2.添加一些整数
		Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		//3.过滤技术，只留下偶数
		List<Integer> newlist = list.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());

		System.out.println(newlist);
	}
}
