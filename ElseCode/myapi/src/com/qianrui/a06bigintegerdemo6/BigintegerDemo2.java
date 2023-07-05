package com.qianrui.a06bigintegerdemo6;

import java.math.BigInteger;

public class BigintegerDemo2 {
	public static void main(String[] args) {
		/*
		 *
		 * public BigInteger add(BigInteger val)                         加法
		 * public BigInteger subtract(BigInteger val)                    减法
		 * public BigInteger mulitiply(BigInteger val)                   乘法
		 * public BigInteger divide(BigInteger val)                    除法,获取商
		 * public BigInteger divideAndRemainder(BigInteger val)      除法,获取商和余数
		 * public boolean equals(Object x)                             比较是否相同
		 * public BigInteger pow(int exponent)                           次幂
		 * public BigInteger max/min(BigInteger val)                 返回较大值/较小值
		 * public int intValue(BigInteger val)               转为int类型整数，超出范围数据有误
		 *
		 * */

		//1.创建两个BigInteger对象
		BigInteger bd1 = BigInteger.valueOf(10);
		BigInteger bd2 = BigInteger.valueOf(5);

		//2.加法
		BigInteger bd3 = bd1.add(bd2);
		System.out.println(bd3);

		//3.除法,获取商和余数
		BigInteger[] arr = bd1.divideAndRemainder(bd2);
		System.out.println(arr.length); //2
		System.out.println(arr[0]); //2 商
		System.out.println(arr[1]); //0 余

		//4.比较是否相同
		boolean result = bd1.equals(bd2);
		System.out.println(result); //false

		//5.次幂
		System.out.println(bd1.pow(2)); //100

		//6.返回较大值/较小值
		BigInteger bd4 = bd1.max(bd2);
		System.out.println(bd4 == bd1); //true
		System.out.println(bd4 == bd2); //false

		//7.转为int类型整数，超出范围数据有误
		BigInteger bd5 = BigInteger.valueOf(2147483647L);
		int i = bd5.intValue();
		System.out.println(i);
		//8.转为long类型整数
		long j = bd5.longValue();
		System.out.println(j);
		//9.转为double类型整数
		double z = bd5.doubleValue();
		System.out.println(z);
	}
}
