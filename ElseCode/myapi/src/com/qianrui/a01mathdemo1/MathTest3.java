package com.qianrui.a01mathdemo1;

public class MathTest3 {
	public static void main(String[] args) {
		//判断五位数含有几个自幂数
		int count = 0;
		for (int i = 10000; i < 100000; i++) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 100 % 10;
			int qian = i / 1000 % 10;
			int wan = i / 10000 % 10;
			double sum = Math.pow(ge, 5) + Math.pow(shi, 5) + Math.pow(bai, 5)
					+ Math.pow(qian, 5) + Math.pow(wan, 5); //pow的返回值是double
			if (i == sum) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println(count);
	}
}
