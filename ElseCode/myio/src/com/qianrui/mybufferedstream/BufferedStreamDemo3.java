package com.qianrui.mybufferedstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStreamDemo3 {
	public static void main(String[] args) throws IOException {
		/*
		 *   字符缓冲输入流：
		 *      构造方法：
		 *           public BufferedReader(Reader r)
		 *      特有方法：
		 *           public String readLine()   读一整行
		 *
		 * */

		//1.创建字节缓冲输入流的对象
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Z790M\\Documents\\Files\\Java\\JavaBasicCode\\ElseCode\\myio\\a.txt"));

        /*
        //2.读取数据
        String line = br.readLine();

        System.out.println(line);
        */

		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		//3.释放资源
		br.close();
	}
}
