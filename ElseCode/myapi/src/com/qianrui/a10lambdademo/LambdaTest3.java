package com.qianrui.a10lambdademo;

public class LambdaTest3 {
	public static void main(String[] args) {
        /*
        练习:猴子吃桃子
            有一对桃子,猴子第一天吃了其中的一半,并多吃了一个!以后每天猴子都吃前剩下的一半,
            然后再多吃一个,第10天的时候(还没吃),发现只剩下一个桃子了,请问,最初总共多少个桃子?

         */

		System.out.println(getSum(1));
	}

	private static int getSum(int day) {
		if (day <= 0 || day >= 11) {
			System.out.println("当前时间错误");
			return -1;
		}

		//递归的出口
		if (day == 10) {
			return 1;
		}
		return ((getSum(day + 1) + 1) * 2);
	}
}
