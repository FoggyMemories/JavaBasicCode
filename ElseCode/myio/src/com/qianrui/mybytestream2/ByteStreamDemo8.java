package com.qianrui.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo8 {
	public static void main(String[] args) throws IOException {

		//JDK7:IO流中捕获异常的写法
		try (FileInputStream fis = new FileInputStream("test.mp4"); FileOutputStream fos = new FileOutputStream("copy.mp4")) {
			//1.创建对象

			//2.拷贝
			int len;
			byte[] bytes = new byte[1024 * 1024 * 5];   //单次读取5Mb大小的数据

			while ((len = fis.read(bytes)) != -1) {
				fos.write(bytes, 0, len);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
