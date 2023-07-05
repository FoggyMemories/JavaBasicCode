package com.qianrui.myobjectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectStreamTest2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		//1.创建反序列化流的对象
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Z790M\\Documents\\Files\\Java\\JavaBasicCode\\ElseCode\\myio\\src\\com\\qianrui\\myobjectstream\\b.txt"));

		//2.读取数据
		ArrayList<People> list = (ArrayList<People>) ois.readObject();

		for (People people : list) {
			System.out.println(people);
		}

		//3.释放资源
		ois.close();
	}
}
