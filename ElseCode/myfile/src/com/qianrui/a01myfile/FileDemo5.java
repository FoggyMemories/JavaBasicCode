package com.qianrui.a01myfile;

import java.io.File;

public class FileDemo5 {
	public static void main(String[] args) {
        /*
        public boolean delete()             删除文件、空文件夹
        */

		//1.创建对象
		File f1 = new File("C:\\Users\\Z790M\\Documents\\Files\\Java\\files\\aaa\\a.txt");


		//2.删除
		boolean b = f1.delete();
		System.out.println(b);
		//如果删除的是文件，则直接删除，不走回收站。
		//如果删除的是空文件夹，则直接删除，不走回收站
		//如果删除的是有内容的文件夹，则删除失败

	}
}
