package com.qianrui.a03runtimedemo3;

import java.io.IOException;

public class RuntimeDemo1 {
	public static void main(String[] args) throws IOException {
		/*
		 * public static Runtime getRuntime()                当前系统的运行环境
		 * public viod exit(int static)                      停止虚拟机
		 * public int availbleProcessors()                   获得CPU的线程数
		 * public long maxMemory()                           JVM能从系统中获取总内存大小(单位byte)
		 * public long totalMemory()                         JVM已经从系统中获取总内存大小(单位byte)
		 * public long freeMemory()                          JVM剩余内存大小(单位byte)
		 * public Process exec(String command)               运行cmd命令
		 *
		 * */


		//1.获取Runtime的对象
		//Runtime是用private来修饰的,所以不能直接进行new对象
		Runtime r1 = Runtime.getRuntime();
		System.out.println(r1);


		//2.exit  停止虚拟机
		//Runtime.getRuntime().exit(0);


		//3.获取CPU的线程数
		System.out.println(Runtime.getRuntime().availableProcessors());


		//4.总内存大小
		System.out.println(Runtime.getRuntime().maxMemory() / (int) Math.pow(1024, 2) + "Mb");


		//5.已经获取的总内存大小
		System.out.println(Runtime.getRuntime().totalMemory() / (int) Math.pow(1024, 2) + "Mb");


		//6.剩余内存大小
		System.out.println(Runtime.getRuntime().freeMemory() / (int) Math.pow(1024, 2) + "Mb");

		//7.运行cmd命令
		Runtime.getRuntime().exec("notepad");
	}
}
