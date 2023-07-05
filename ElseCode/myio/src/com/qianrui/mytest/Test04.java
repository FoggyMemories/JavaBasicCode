package com.qianrui.mytest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Test04 {
	public static void main(String[] args) throws IOException {
        /*
            文本文件中有以下的数据：
                2-1-9-4-7-8
            将文件中的数据进行排序，变成以下的数据：
                1-2-4-7-8-9

            细节1:
                文件中的数据不要换行
            细节2:
                bom头
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
		Integer[] arr = Arrays.stream(sb.toString()
						.split("-"))
				.map(Integer::parseInt)
				.sorted()
				.toArray(Integer[]::new);

		System.out.println(Arrays.toString(arr));

		//3.写出
		FileWriter fw = new FileWriter(
				"C:\\Users\\Latitude7490\\Documents\\file\\java\\JavaBasicCode\\ElseCode\\myio\\a.txt"
				, false);

		String s = Arrays.toString(arr).replace(", ", "-");
		String result = s.substring(1, s.length() - 1);
		System.out.println(result);

		fw.write(result);
		fw.close();
	}
}
