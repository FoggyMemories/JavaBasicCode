package com.qianrui.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo5 {
	public static void main(String[] args) throws IOException {
        /*
        FileInputStream一次读多个字节

            方法名称                                说明
        public int read()                   一次读一个字节数据
        public int read(byte[] buffer)      一次读一个字节数组数据

         */

		//1.创建对象
		FileInputStream fis = new FileInputStream("C:\\Users\\Z790M\\Documents\\Files\\Java\\JavaBasicCode\\ElseCode\\myio\\a.txt");

		//2.读取数据
		byte[] bytes = new byte[2]; //表示一次读取两个字节数组

		//一次读取多个字节数据,具体读多少跟数组长度有关
		//返回值:本次读取到了多少个字节数据
		int len = fis.read(bytes);
		System.out.println(len);    //2
		String str = new String(bytes, 0, len);
		System.out.println(str);

		//3.释放资源
		fis.close();
	}
}
