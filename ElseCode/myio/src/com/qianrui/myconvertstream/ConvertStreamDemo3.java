package com.qianrui.myconvertstream;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo3 {
	public static void main(String[] args) throws IOException {
        /*
            将本地文件中的GBK文件转化UTF-8
         */

		//1.JDK11以前的方案
        /*
        InputStreamReader isr = new InputStreamReader(new FileInputStream("myio\\b.txt"), "GBK");

        OutputStreamWriter ows = new OutputStreamWriter(new FileOutputStream("myio\\d.txt"), "UTF-8");

        int b;

        while ((b = isr.read()) != -1) {
            ows.write(b);
        }

        ows.close();
        isr.close();
        */

		//2.替代方案
		FileReader fr = new FileReader("myio\\b.txt", Charset.forName("GBK"));
		FileWriter fw = new FileWriter("myio\\d.txt", Charset.forName("UTF-8"));

		int b;
		while ((b = fr.read()) != -1) {
			fw.write(b);
		}

		fw.close();
		fr.close();
	}
}
