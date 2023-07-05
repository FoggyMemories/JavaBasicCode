package com.qianrui.a02udpdemo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveMessageDemo {
	public static void main(String[] args) throws IOException {
		//接收数据


		//1.创建DatagramSocket对象(快递公司)
		//细节:
		//在接收的时候,一定要绑定端口
		//而且绑定的端口一定要跟发送的端口保持一致
		DatagramSocket ds = new DatagramSocket(10086);

		//2.接收数据包
		byte[] bytes = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
		ds.receive(dp);

		//3.解析数据包
		byte[] data = dp.getData();
		int len = dp.getLength();
		InetAddress address = dp.getAddress();
		int port = dp.getPort();

		System.out.println("接收到数据" + new String(data,0,len));
		System.out.println("该数据是从" + address + "这台电脑中的" + port + "这个端口发出的");

		//4.释放资源
		ds.close();
	}
}
