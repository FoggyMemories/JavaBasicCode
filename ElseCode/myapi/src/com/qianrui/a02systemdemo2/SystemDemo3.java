package com.qianrui.a02systemdemo2;

public class SystemDemo3 {
	public static void main(String[] args) {

		//判断1 ~ 100000之间有多少个质数

		long start = System.currentTimeMillis();

		for (int i = 1; i <= 100000; i++) {
			boolean flag = isPrime2(i);
			if (flag) {
				System.out.println(i);
			}
		}

		long end = System.currentTimeMillis();
		System.out.println(end - start);

	}

	private static boolean isPrime1(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static boolean isPrime2(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
