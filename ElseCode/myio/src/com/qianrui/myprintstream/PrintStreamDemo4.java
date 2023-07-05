package com.qianrui.myprintstream;

import java.io.PrintStream;

public class PrintStreamDemo4 {
	public static void main(String[] args) {
		/*
		 * 打印流的应用场景
		 */


		//获取打印流的对象,此打印流在虚拟机启动的时候,由虚拟机创建,默认只想控制台
		//特殊的打印流.系统中的标准输出流
		PrintStream ps = System.out;
		//调用打印流中的方法println
		//写出数据,自动换行,自动刷新
		ps.println("123");
		//系统中的表春输出流,是不能关闭的,在系统中是唯一的.


		//利用链式编程的方式打印在控制台
		System.out.println("123");
	}
}
