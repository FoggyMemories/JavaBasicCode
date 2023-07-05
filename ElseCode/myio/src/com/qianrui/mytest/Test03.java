package com.qianrui.mytest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Test03 {
	public static void main(String[] args) throws IOException {
        /*
            文本文件中有以下的数据：
                2-1-9-4-7-8
            将文件中的数据进行排序，变成以下的数据：
                1-2-4-7-8-9
        */

		//1.读取数据
		FileReader fr = new FileReader("C:\\Users\\Latitude7490\\Documents\\file\\java\\JavaBasicCode\\ElseCode\\myio\\a.txt");
		StringBuilder sb = new StringBuilder();

		int ch;
		while ((ch = fr.read()) != -1) {
			sb.append((char) ch);
		}
		fr.close();
		System.out.println(sb);
		//2.排序
		String str = sb.toString();
		String[] arrStr = str.split("-");

		ArrayList<Integer> list = new ArrayList<>();

		for (String s : arrStr) {
			int i = Integer.parseInt(s);
			list.add(i);
		}

		Collections.sort(list);
		System.out.println(list);

		//3.写出
		FileWriter fw = new FileWriter("C:\\Users\\Latitude7490\\Documents\\file\\java\\JavaBasicCode\\ElseCode\\myio\\a.txt");

		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1) {
				fw.write(list.get(i) + ""); //写出形式为字符串，而非char类型
			} else {
				fw.write(list.get(i) + "-");
			}
		}

		//释放资源
		fw.close();
	}
}
