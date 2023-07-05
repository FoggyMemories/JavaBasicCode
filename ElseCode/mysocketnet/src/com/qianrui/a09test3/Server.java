package com.qianrui.a09test3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		//服务器:接收客户端上传的文件,上传完毕之后给出反馈


		//1.创建对象并绑定端口
		ServerSocket ss = new ServerSocket(10086);

		//2.等待客户端链接
		Socket socket = ss.accept();

		//3.读取数据 并保存到本地文件中
		BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("ElseCode\\mysocketnet\\serverdir\\a.jpg"));

		int len;
		byte[] bytes = new byte[1024];

		while ((len = bis.read(bytes)) != -1) {
			bos.write(bytes, 0, len);
		}


		//4.回写数据
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		bw.write("上传成功");
		bw.newLine();

		bw.flush();

		//5.释放资源
		socket.close();
		ss.close();
	}
}
