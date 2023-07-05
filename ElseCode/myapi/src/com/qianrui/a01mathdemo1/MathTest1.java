package com.qianrui.a01mathdemo1;

public class MathTest1 {
	public static void main(String[] args) {
		//判断两位数是否有自幂数
		System.out.println(isNarcissisticNumber());
	}

	public static boolean isNarcissisticNumber() {
		for (int i = 10; i < 100; i++) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			double sum = Math.pow(ge, 2) + Math.pow(shi, 2);
			if (sum == i) {
				return true;
			}
		}
		return false;
	}
}
