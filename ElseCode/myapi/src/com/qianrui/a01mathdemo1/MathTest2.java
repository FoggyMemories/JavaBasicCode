package com.qianrui.a01mathdemo1;

public class MathTest2 {
	public static void main(String[] args) {
		//判断四位数有几个自幂数
		int count = 0;
		for (int i = 1000; i < 10000; i++) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 100 % 10;
			int qian = i / 1000 % 10;
			double sum = Math.pow(ge, 4) + Math.pow(shi, 4) + Math.pow(bai, 4) + Math.pow(qian, 4); //pow的返回值是double
			if (i == sum) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println(count);
	}
}
