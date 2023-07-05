package com.qianrui.a13waitandnotify1;

public class Desk {
	/*
	 *  作用:控制生产者和消费者的执行
	 * */

	//桌子上是否有食物 0:没有面条 1:有面条
	public static int foodFlog = 0;

	//总个数
	public static int count = 10;

	//锁
	public static Object lock = new Object();
}
