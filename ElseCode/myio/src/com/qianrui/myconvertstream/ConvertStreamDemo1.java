package com.qianrui.myconvertstream;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo1 {
	public static void main(String[] args) throws IOException {
        /*
            利用转换流按照指定字符编码读取(了解)

            因为JDK11中这种方法被淘汰了.
                替代方案(掌握)
         */

        /*
        //1.创建对象并指定字符编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream("myio\\gbkfile.txt"), "GBK");

        //2.读取数据
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.print((char) ch);
        }

        //3.释放资源
        isr.close();
        */

		FileReader fr = new FileReader("myio\\gbkfile.txt", Charset.forName("GBK"));

		//2.读取数据
		int ch;
		while ((ch = fr.read()) != -1) {
			System.out.print((char) ch);
		}

		//3.释放资源
		fr.close();
	}
}
