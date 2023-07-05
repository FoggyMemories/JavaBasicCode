package com.study.a04test;

public class Test2 {
	public static void main(String[] args) {
		/*
		 *   练习:
		 *       算法水题:
		 *           自己实现parseInt方法,将字符串形式的数据转成整数.(禁止使用parseInt)
		 *       要求:
		 *           字符串中只能是数字不能有其他字符
		 *           最少一位,最多10位
		 *           0不能开头
		 *
		 * */

		//1.定义一个字符串
		String str = "123456";
		//2.校验字符串
		//习惯:首先将异常数据进行过滤,剩下来的就是正常数据.
		if (!str.matches("[1-9]\\d{0,9}")) {
			//错误的数据
			System.out.println("数据格式非法");
		} else {
			//正确的数据
			System.out.println("数据格式正确");

			//3.定义一个变量表示最终的结果
			int number = 0;

			//4.便利字符串的到里面的每一个字符
			for (int i = 0; i < str.length(); i++) {
				int c = str.charAt(i) - '0';
				//把每一位数字放到number当中
				number = number * 10 + c;
			}

			System.out.println(number);

		}
	}
}
