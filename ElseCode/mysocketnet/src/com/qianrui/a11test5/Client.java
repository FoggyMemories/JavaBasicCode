package com.qianrui.a11test5;

import java.io.*;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws IOException {
		//客户端:将本地文件上传到服务器.接收服务器的反馈

		//1.创建Socket对象,并链接服务器
		Socket socket = new Socket("127.0.0.1", 10086);

		//2.读取本地我呢见中的数据,并写到服务器当中
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("ElseCode\\mysocketnet\\clientdir\\a.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
		byte[] bytes = new byte[1024];

		int len;
		while ((len = bis.read(bytes)) != -1) {
			bos.write(bytes, 0, len);
		}

		//往服务器写结束标记
		socket.shutdownOutput();

		//3.接收服务器的回写数据
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String line = br.readLine();
		System.out.println(line);


		//4.释放资源
		bis.close();
		socket.close();
	}
}