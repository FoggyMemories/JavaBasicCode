package com.qianrui.a01myfile;

import java.io.File;

public class FileDemo6 {
	public static void main(String[] args) {

		//public File[] listFiles()       获取当前该路径下所有内容

		//1.创建File对象
		File f = new File("C:\\Users\\Z790M\\Documents\\Files\\Java\\files\\aaa");

		//2.listFiles()       获取当前该路径下所有内容
		//作用：获取aaa文件夹里面的所有内容，包括文件、文件夹 (隐藏文件也可获取) ,把所有的内容放到数组中返回

		File[] files = f.listFiles();
		for (File file : files) {
			//file 一次表示aaa文件夹里面的每一个文件或者文件夹
			System.out.println(file);
		}


		//当调用者File表示的路径不存在时,返回null
		//当调用者File表示的路径是文件时,返回null

		//当调用者File表示的路径是一个空文件夹时,返回一个长度为0的数组
		//当调用者File表示的路径是一个有内容的文件夹时,将里面所有文件和文件夹的路径放在File数组中返回
		//当调用者File表示的路径是一个有隐藏文件的文件夹时,将里面所有文件和文件夹的路径放在一个File数组中返回,包含隐藏文件
		//当调用者File表示的路径是需要权限才能访问的文件夹时,返回null
	}
}
