package com.qianrui.a01myfile;

import java.io.File;

public class FileDemo1 {
	public static void main(String[] args) {
        /*
            public File(String pathname)                根据文件路径创建文件对象
            public File(String parent, String child)    根据父路径名字符串和子路径名字符串创建文件对象
            public File(File  parent, String child)     根据父路径对应文件对象和子路径名字符串创建文件对象

            "C:\Users\Z790M\Documents\Files\Java\files\aaa\a.txt"
            \ : 转义字符

            Windows : \
            Linux : /
        */

		//1.根据字符串表示的路径变成File对象
		String str = "C:\\Users\\Z790M\\Documents\\Files\\Java\\files\\aaa\\a.txt";

		File f1 = new File(str);

		System.out.println(f1);

		//2.父级路径:C:\Users\Z790M\Documents\Files\Java\files\aaa
		//子级路径:a.txt

		String parent = "C:\\Users\\Z790M\\Documents\\Files\\Java\\files\\aaa";
		String child = "a.txt";

		File f2 = new File(parent, child);       //根据不同的操作系统进行路径拼接
		System.out.println(f2);

		File f3 = new File(parent + "\\" + child);  //仅限操作系统路径分隔 \ 使用
		System.out.println(f3);

		//3.把一个File表示的路径和String表示的路径进行拼接
		File parent2 = new File("C:\\Users\\Z790M\\Documents\\Files\\Java\\files\\aaa");
		String child2 = "a.txt";

		File f4 = new File(parent2, child2);
		System.out.println(f4);
	}
}
