package com.qianrui.a01myfile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo3 {
	public static void main(String[] args) {
        /*
            public long length()                返回文件的大小（字节数量）
            public String getAbsolutePath()     返回文件的绝对路径
            public String getPath()             返回定义文件时使用的路径
            public String getName()             返回文件的名称，带后缀
            public long lastModified()          返回文件的最后修改时间（时间毫秒值）
        */

		//1.length 返回文件的大小(字节数量)

		//这个方法只能获取文件的大小 单位是字节
		//这个方法无法获取文件夹的大小 如果想要要获取一个文件夹的大小,需要把这个文件夹里面所有的文件大小都累加在一起
		File f1 = new File("C:\\Users\\Z790M\\Documents\\Files\\Java\\files\\aaa\\a.txt");
		long len = f1.length();
		System.out.println(len);    //4

		File f2 = new File("C:\\Users\\Z790M\\Documents\\Files\\Java\\files\\aaa\\bbb");
		long len1 = f2.length();
		System.out.println(len1);   //0

		System.out.println("=========================");

		//2.getAbsolutePath()  返回文件的绝对路径
		File f3 = new File("C:\\Users\\Z790M\\Documents\\Files\\Java\\files\\aaa\\a.txt");
		String path1 = f3.getAbsolutePath();
		System.out.println(path1);

		File f4 = new File("myFile\\a.txt");
		String path2 = f4.getAbsolutePath();
		System.out.println(path2);

		System.out.println("=========================");
		//3.getPath() 返回定义文件时使用的路径
		File f5 = new File("C:\\Users\\Z790M\\Documents\\Files\\Java\\files\\aaa\\a.txt");
		String path3 = f5.getPath();
		System.out.println(path3);

		File f6 = new File("myFile\\a.txt");
		String path4 = f6.getPath();
		System.out.println(path4);

		System.out.println("=========================");
		//4.getName()             返回文件的名称，带后缀
		//文件:文件名+后缀名
		//文件夹:文件名
		File f7 = new File("C:\\Users\\Z790M\\Documents\\Files\\Java\\files\\aaa\\a.txt");
		String name1 = f7.getName();
		System.out.println(name1);

		File f8 = new File("C:\\Users\\Z790M\\Documents\\Files\\Java\\files\\aaa\\bbb");
		String name2 = f8.getName();
		System.out.println(name2);

		System.out.println("=========================");
		//5.lastModified()          返回文件的最后修改时间(时间毫秒值)
		File f9 = new File("C:\\Users\\Z790M\\Documents\\Files\\Java\\files\\aaa\\a.txt");
		long time = f9.lastModified();
		System.out.println(time);

		//将时间的毫秒值转化为字符串表示的时间
		Date date = new Date(time);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String strTime = sdf.format(date);
		System.out.println(strTime);
	}
}
