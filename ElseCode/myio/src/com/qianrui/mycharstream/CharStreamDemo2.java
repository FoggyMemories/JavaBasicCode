package com.qianrui.mycharstream;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo2 {
	public static void main(String[] args) throws IOException {
        /*
            第一步：创建对象
            public FileReader(File file)        创建字符输入流关联本地文件
            public FileReader(String pathname)  创建字符输入流关联本地文件

            第二步：读取数据
            public int read()                   读取数据，读到末尾返回-1
            public int read(char[] buffer)      读取多个数据，读到末尾返回-1

            第三步：释放资源
            public void close()                 释放资源/关流
        */


		//1.创建对象
		FileReader fr = new FileReader("C:\\Users\\Z790M\\Documents\\Files\\Java\\JavaBasicCode\\ElseCode\\myio\\a.txt");

		//2.读取数据
		char[] chars = new char[2];
		int len;

		//1.read():默认也是一个字节一个字节读取的,如果遇到中文就会一次读取多个
		//2.在读取之后,方法的底层还会进行解码并转化成十进制
		//  最终把这个十进制作为返回值
		//  这个十进制的数据也表示在字符集上的数字

		//read(chars):读取数据,解码,强转三步合并了,把强转之后的字符放到数组当中
		// 空参的read + 强转类型转换
		while ((len = fr.read(chars)) != -1) {
			//把数组中的数据变成字符串再进行打印
			System.out.print(new String(chars, 0, len));
		}

		//3.释放资源
		fr.close();
	}
}
