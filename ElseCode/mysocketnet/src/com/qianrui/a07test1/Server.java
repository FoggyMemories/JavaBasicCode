package com.qianrui.a07test1;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		//服务端:接收多次接收数据,并打印

		//1.创建对象绑定10086端口
		ServerSocket ss = new ServerSocket(10086);

		//2.等待客户端来连接
		Socket socket = ss.accept();

		//3.读取数据
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);

		int b;
		while ((b = isr.read()) != -1) {
			System.out.print((char) b);
		}

		//4.释放资源
		socket.close();
	}
}
