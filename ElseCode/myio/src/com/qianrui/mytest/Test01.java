package com.qianrui.mytest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
		//拷贝一个文件夹，考虑子文件夹


		//1.创建对象表示数据源
		File src = new File("D:\\aaa\\src");    //虚拟地址

		//2.创建对象表示目的地
		File dest = new File("D:\\aaa\\dest");  //虚拟地址

		//3.调用方法开始拷贝
		copyDir(src, dest);
	}

	/**
	 * 作用: 拷贝文件夹
	 *
	 * @param src  数据源
	 * @param dest 目的地
	 */
	private static void copyDir(File src, File dest) throws IOException {
		dest.mkdirs();
		//递归
        /*
            1.进入数据源
            2.遍历数组
            3.判断为文件:拷贝
            4.判断为文件夹:递归
         */

		//1.
		File[] files = src.listFiles();

		//2.
		if (files != null) {
			for (File file : files) {
				if (file.isFile()) {
					//3.    文件开始 -> 文件结束
					FileInputStream fis = new FileInputStream(file);
					FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));
					byte[] bytes = new byte[1024];

					int len;
					while ((len = fis.read(bytes)) != -1) {
						fos.write(bytes, 0, len);
					}
					fos.close();
					fis.close();
				} else {
					//4.
					copyDir(file, dest);
				}
			}
		}
	}
}
