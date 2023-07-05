package com.qiantui.a02threadpool2;

import com.qiantui.a01threadpool1.MyRunnable;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPoolDemo1 {
	public static void main(String[] args) {
		/*
			ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
			(核心线程数量,最大线程数量,空闲线程最大存活时间,任务队列,创建线程工厂,任务的拒绝策略);

			参数一:核心线程数量                      不能小于0
			参数二:最大线程数                        不能小于0，最大数量 >= 核心线程数量
			参数三:空闲线程最大存活时间               不能小于0
			参数四:时间单位                          用TimeUnit指定
			参数五:任务队列                          不能为null
			参数六:创建线程工厂                       不能为null
			参数七:任务的拒绝策略                     不能为null
		*/

		ThreadPoolExecutor pool = new ThreadPoolExecutor(
				3,/*核心线程数量,不能小于0*/
				6,/*最大线程数量,不能小于0 且 最大数量 >= 核心线程数量*/
				60,/*空闲线程最大存活时间 (数值)*/
				TimeUnit.SECONDS,/*时间单位  用TimeUnit指定*/
				new ArrayBlockingQueue<>(3),/*任务队列 且课指令队列长度*/
				Executors.defaultThreadFactory(),/*创建线程工厂*/
				new ThreadPoolExecutor.AbortPolicy()/*任务的拒绝策略*/
		);

		//2.给线程池提交任务
		pool.submit(new com.qiantui.a01threadpool1.MyRunnable());
		pool.submit(new com.qiantui.a01threadpool1.MyRunnable());
		pool.submit(new com.qiantui.a01threadpool1.MyRunnable());
		pool.submit(new MyRunnable());

		//3.销毁线程池
		pool.shutdown();
	}
}
