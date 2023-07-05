package com.study.a04test;

public class Test3 {
	public static void main(String[] args) {
        /*

        练习:
            算法水题:
                定义一个方法自己实现toBinaryString方法效果,将一个十进制整数转成字符串表示的二进制.

         */
		System.out.print(toBinaryString(123));
	}

	public static String toBinaryString(int number) {
		//核心逻辑:不断的除以2,得到玉树,一直到商为0就结束
		//还需要把余数倒着拼接起来

		//定义一个StringBuilder用来拼接余数
		StringBuilder sb = new StringBuilder();

		//利用循环不断的除以2获取余数
		while (true) {
			if (number == 0) {
				break;
			}

			//获取余数  %
			int remainder = number % 2;

			//倒着拼接
			sb.insert(0, remainder);

			//除以2     /
			number /= 2;

		}
		return sb.toString();
	}
}
