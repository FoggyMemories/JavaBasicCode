package com.qianrui.myobjectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class ObjectStreamTest1 {
	public static void main(String[] args) throws IOException {
        /*
            需求:
                将多个自定义对象序列化到文件中,但是对象的个数不确定,该如何操作呢?
         */

		//1.序列化多个对象
		People p1 = new People("zhangsan", 23, "南京");
		People p2 = new People("lisi", 24, "上海");
		People p3 = new People("wangwu", 25, "北京");

		ArrayList<People> list = new ArrayList<>();
		Collections.addAll(list, p1, p2, p3);

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Z790M\\Documents\\Files\\Java\\JavaBasicCode\\ElseCode\\myio\\src\\com\\qianrui\\myobjectstream\\b.txt"));

		oos.writeObject(list);

		oos.close();
	}
}
