package com.qianrui.a12test6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
	public static void main(String[] args) throws IOException {
		//服务器:接收客户端上传的文件,上传完毕之后给出反馈

		//创建线程池
		ThreadPoolExecutor pool = new ThreadPoolExecutor(
				3,//核心线程数量
				20,//线程池总大小
				1,//空闲时间
				TimeUnit.SECONDS,//空闲时间单位
				new ArrayBlockingQueue<>(2),//队列
				Executors.defaultThreadFactory(),//线程工厂,让线程池如何创建线程对象
				new ThreadPoolExecutor.AbortPolicy()//阻塞队列
		);


		//1.创建对象并绑定端口
		ServerSocket ss = new ServerSocket(10086);

		while (true) {
			//2.等待客户端链接
			Socket socket = ss.accept();

			//开启一条线程
			//一个用户就可以对应服务端的一条线程
			//new Thread(new MyRunnable(socket)).start();
			pool.submit(new MyRunnable(socket));
		}
	}
}
