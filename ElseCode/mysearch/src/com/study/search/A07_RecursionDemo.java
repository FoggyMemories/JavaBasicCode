package com.study.search;

public class A07_RecursionDemo {
	public static void main(String[] args) {

		System.out.println(getFactorialRecursion(5));

	}

	//方法内部再次调用方法的时候,参数必须要更加的靠近出口
	private static int getFactorialRecursion(int number) {
		if (number == 1) {
			return 1;
		}
		return number * getFactorialRecursion(number - 1);
	}
}
