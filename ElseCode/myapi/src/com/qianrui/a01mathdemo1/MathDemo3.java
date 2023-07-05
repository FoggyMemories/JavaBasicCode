package com.qianrui.a01mathdemo1;

public class MathDemo3 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 100; i < 1000; i++) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 100 % 10;
			double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3); //pow的返回值是double
			if (i == sum) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println(count);
	}
}
