package com.qianrui.a06bigintegerdemo6;

import java.math.BigInteger;

public class BigIntegerDemo3 {
	public static void main(String[] args) {
		//断点调试/debug模式运行代码
		//作用：擦好看程序是一步一步如何执行的
		BigInteger bd = new BigInteger("-27670116110564327424");    //存储方式，每32位为一组，放入一个数组
		System.out.println(bd);
	}
}
