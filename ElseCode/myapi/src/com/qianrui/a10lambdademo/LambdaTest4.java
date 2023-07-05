package com.qianrui.a10lambdademo;

public class LambdaTest4 {
	public static void main(String[] args) {
        /*

            练习:爬楼梯
                可爱的小明特别喜欢爬楼梯,他又的时候一次爬一个台阶,有时候一次爬两个台阶.
                如果这个楼梯有20个台阶,小明一共有多少种爬法?


                运算结果:
                    1层台阶 1种爬法
                    2层台阶 2种爬法
                    7层台阶 21种爬法
         */

		System.out.println(getCount(20));

	}

	private static int getCount(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		return getCount(n - 1) + getCount(n - 2);
	}
}
