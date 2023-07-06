package com.qianrui.a11test5;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		//服务器:接收客户端上传的文件,上传完毕之后给出反馈


		//1.创建对象并绑定端口
		ServerSocket ss = new ServerSocket(10086);

		while (true) {
			//2.等待客户端链接
			Socket socket = ss.accept();

			//开启一条线程
			//一个用户就可以对应服务端的一条线程
			new Thread(new MyRunnable(socket)).start();
		}
	}
}