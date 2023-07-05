package com.qianrui.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
	public static void main(String[] args) throws IOException {
		/*
		 *   练习：
		 *       文件拷贝
		 *       把"C:\Users\Z790M\Videos\nqrbylay.webm"拷贝到当前模块下。
		 *
		 *   注意：
		 *       选择一个比较小的文件，不要太大。大文件拷贝我们下一个视频会说。
		 *
		 *
		 *
		 *   课堂练习：
		 *       要求统计一下拷贝时间，单位毫秒
		 * */

		//1.创建对象
		FileInputStream fis = new FileInputStream("C:\\Users\\Z790M\\Videos\\nqrbylay.webm");
		FileOutputStream fos = new FileOutputStream("ElseCode\\myio\\copy.webm");

		long start = System.currentTimeMillis();
		//2.拷贝
		//核心思想:边读边写
		int b;
		while ((b = fis.read()) != -1) {
			fos.write(b);
		}

		//3.释放资源
		//规则:先开的流最后关闭
		fos.close();
		fis.close();

		long end = System.currentTimeMillis();

		System.out.println(end - start);
	}
}
