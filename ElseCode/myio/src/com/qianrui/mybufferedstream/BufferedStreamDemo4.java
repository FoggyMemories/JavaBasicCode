package com.qianrui.mybufferedstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo4 {
	public static void main(String[] args) throws IOException {
		/*
		 *
		 *    字符缓冲输出流
		 *      构造方法：
		 *           public BufferedWriter(Writer r)
		 *      特有方法：
		 *           public void newLine()      跨平台的换行
		 *
		 * */

		//1.创建字符缓冲输出流的对象
		BufferedWriter bw = new BufferedWriter(new FileWriter(
				"C:\\Users\\Z790M\\Documents\\Files\\Java\\JavaBasicCode\\ElseCode\\myio\\src\\com\\qianrui\\mybufferedstream1\\b.txt"
		));

		//2.写出数据
		bw.write("""
				你见，或者不见我。

				我就在那里，不悲不喜。

				你念，或者不念我。

				情就在那里，不来不去。

				你爱或者不爱我，爱就在那里，不增不减。

				你跟，或者不跟我。

				我的手就在你的手里，不舍不弃。

				来我怀里，或者，让我住进你的心里。

				默然相爱，寂静喜欢。""");

		//3.释放资源
		bw.close();
	}
}
