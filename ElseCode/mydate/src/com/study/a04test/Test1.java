package com.study.a04test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/*
		 *
		 *   键盘录入一些1~100之间的整数，并添加到集合中。
		 *   直到结合中所有数据和超过200为止。
		 *
		 * */

		//1.创建一个集合,用来添加整数
		ArrayList<Integer> list = new ArrayList<>();
		//2.键盘录入添加到集合中
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请输入一个整数:(1 ~ 100)");
			String numStr = sc.nextLine();
			int num = Integer.parseInt(numStr);
			//先把异常数据进行过滤
			if (num < 1 || num > 100) {
				System.out.println("当前输入的数字不合法,请重新输入");
				continue;
			}
			//将数字添加至集合中
			//细节:
			//num:基本数据类型
			//集合里面的数据是Integer
			//在添加数据的时候出发了自动装箱
			list.add(num);


			//统计集合中左右的数据和
			int sum = getSum(list);
			//对sum进行判断
			if (sum > 200) {
				System.out.println("集合中数据已满足要求.");
				System.out.println(sum);
				break;
			}
		}
		//验证一下结论
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}


	}

	private static int getSum(ArrayList<Integer> list) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			int num = list.get(i);
			sum += num;
		}
		return sum;
	}


}
