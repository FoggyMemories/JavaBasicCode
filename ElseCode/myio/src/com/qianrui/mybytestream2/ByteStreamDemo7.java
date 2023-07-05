package com.qianrui.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo7 {
	public static void main(String[] args) throws IOException {
		//利用try...catch...finally捕获拷贝文件中代码出现的异常
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			//1.创建对象
			fis = new FileInputStream("test.mp4");
			fos = new FileOutputStream("copy.mp4");

			//2.拷贝
			int len;
			byte[] bytes = new byte[1024 * 1024 * 5];   //单次读取5Mb大小的数据

			while ((len = fis.read(bytes)) != -1) {
				fos.write(bytes, 0, len);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			//3.释放资源
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}


	}
}
