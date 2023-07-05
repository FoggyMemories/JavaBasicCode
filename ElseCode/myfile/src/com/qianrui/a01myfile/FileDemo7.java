package com.qianrui.a01myfile;

import java.io.File;
import java.util.Arrays;

public class FileDemo7 {
	public static void main(String[] args) {
        /*
            public static File[] listRoots()                列出可用的文件系统根
            public String[] list()                          获取当前该路径下所有内容
            public String[] list(FilenameFilter filter)     利用文件名过滤器获取当前该路径下所有内容
            (掌握)public File[] listFiles()                获取当前该路径下所有内容
            public File[] listFiles(FileFilter filter)      利用文件名过滤器获取当前该路径下所有内容
            public File[] listFiles(FilenameFilter filter)  利用文件名过滤器获取当前该路径下所有内容
        */


		//1.listRoots()                列出可用的文件系统根 获取系统中所有的盘符
		File[] arr = File.listRoots();
		System.out.println(Arrays.toString(arr));

		System.out.println("===========================");
		//2.list()                     获取当前该路径下所有内容 仅仅能获取名字
		File f1 = new File("C:\\Users\\Z790M\\Documents\\Files\\Java\\files\\aaa");
		String[] arr2 = f1.list();
		for (String s : arr2) {
			System.out.println(s);
		}

		System.out.println("===========================");
		//3.list(FilenameFilter filter)     利用文件名过滤器获取当前该路径下所有内容
		// 需求: 获取C:\Users\Z790M\Documents\Files\Java\files\aaa文件夹里面所有的txt文件
		File f2 = new File("C:\\Users\\Z790M\\Documents\\Files\\Java\\files\\aaa");
		//accept方法的形参,依次表示aaa文件夹里面每一个文件或者文件夹的路径
//参数一:父级路径
//参数二:子级路径
//返回值:true:表示当前路径保留
//      false:表示当前路径舍弃不要
		String[] arr3 = f2.list((dir, name) -> {
			File src = new File(dir, name);
			return src.isFile() && name.endsWith(".txt");
		});
		System.out.println(Arrays.toString(arr3));
	}
}
