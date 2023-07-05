package com.qianrui.a01myfile;

import java.io.File;

public class FileDemo8 {
	public static void main(String[] args) {
        /*
            (掌握)public File[] listFiles()                获取当前该路径下所有内容
            public File[] listFiles(FileFilter filter)      利用文件名过滤器获取当前该路径下所有内容
            public File[] listFiles(FilenameFilter filter)  利用文件名过滤器获取当前该路径下所有内容
        */

		//1.创建File对象
		File f = new File("C:\\Users\\Z790M\\Documents\\Files\\Java\\files\\aaa");

		//2.需求:打印里面所有的txt文件
		File[] arr = f.listFiles();
		for (File file : arr) {
			//file一次表示aaa文件里面每一个文件或者文件夹的路径
			if (file.isFile() && file.getName().endsWith(".txt")) {
				System.out.println(file);
			}
		}
	}
}
