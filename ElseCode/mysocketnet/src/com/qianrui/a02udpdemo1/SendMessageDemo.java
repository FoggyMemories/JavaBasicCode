package com.qianrui.a02udpdemo1;

import java.io.IOException;
import java.net.*;

public class SendMessageDemo {
	public static void main(String[] args) throws IOException {
		//发送数据

		//1.创建DatagramSocket对象(快递公司)
		//细节:
		//绑定端口,以后我们就是通过这个端口往外发送数据
		//空参:所有可用的端口中随机一个进行使用
		//有参:指定端口号进行绑定
		DatagramSocket ds = new DatagramSocket();

		//2.打包数据
		String str = "你好啊!!!";
		byte[] bytes = str.getBytes();

		/*指定电脑*/
		InetAddress address = InetAddress.getByName("127.0.0.1");
		/*指定端口*/
		int port = 10086;
		DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

		//3.发送数据
		ds.send(dp);

		//4.释放资源
		ds.close();
	}
}
