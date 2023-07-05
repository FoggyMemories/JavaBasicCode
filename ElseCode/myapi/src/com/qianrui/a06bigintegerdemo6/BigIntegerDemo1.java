package com.qianrui.a06bigintegerdemo6;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
	public static void main(String[] args) {
		/*
		 *
		 * public BigInteger(int num, Random rnd)        获取随机大整数,范围:[0 ~ 2的num次方-1]
		 * public BigInteger(String val)                 获取指定的大整数
		 * public BigInteger(String val, int radix)      获取指定进制的大整数
		 *
		 * public static BigInteger valueOf(long val)    静态方法获取BigInteger的对象,内部有优化
		 * 细节:
		 *       对象一旦创建 里面的数据不能发生改变.
		 *
		 * */

		//获取一个随机的大整数
		BigInteger bd1 = new BigInteger(4, new Random());//[0 ~ 2 ^ 4 - 1]
		System.out.println(bd1);
		System.out.println();

		//2.获取一个指定的大数
		BigInteger bd2 = new BigInteger("100");     //括号内填String类型,字符串中必须为整数,否则报错
		System.out.println(bd2);
		System.out.println();

		//3.获取指定进制的大整数
		//细节:
		//1.字符串的数字必须是整数
		//2.字符串中的数字必须跟进制吻合(例如:二进制中,.只能写0和1,其他的就会报错.
		BigInteger bd3 = new BigInteger("100", 2);//(数字,进制)
		System.out.println(bd3);//自动转换为10进制
		System.out.println();

		//4.静态方法获取BigInteger的对象，内部有优化
		//细节：
		//1.能表示范围比较小，在long的取值范围之内，如果超出long的范围就不行了
		//2.在内部对常用的数字： -16 ~ 16 进行了优化
		//  提前吧 -16 ~ 16 先创建好BIgInteger的对象，如果多次获取则不会重新创建新的
		BigInteger bd5 = BigInteger.valueOf(16);
		System.out.println(bd5);

		BigInteger bd6 = BigInteger.valueOf(16);
		System.out.println(bd6);

		System.out.println(bd5 == bd6);//true，仅限 -16 ~ 16之间
		System.out.println();

		BigInteger bd7 = BigInteger.valueOf(17);
		System.out.println(bd7);

		BigInteger bd8 = BigInteger.valueOf(17);
		System.out.println(bd8);

		System.out.println(bd7 == bd8);//false,超过 -16 ~ 16则会创建新的对象
		System.out.println();

		//5.对象一旦创建内部的数据不能发生改变
		BigInteger bd9 = BigInteger.valueOf(1);
		BigInteger bd10 = BigInteger.valueOf(2);
		BigInteger result = bd9.add(bd10);
		System.out.println(result);//3
		//此时，不会修改参与计算的BigInteger对象中的值，而是产生了一个新的BigInteger对象记录3
		System.out.println(bd9 == result);//false
		System.out.println(bd10 == result);//false


	}
}
