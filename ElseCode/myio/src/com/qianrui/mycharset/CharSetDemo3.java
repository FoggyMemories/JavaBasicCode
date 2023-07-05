package com.qianrui.mycharset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo3 {
	public static void main(String[] args) throws UnsupportedEncodingException {
        /*
       Java中编码的方法
            public byte[] getBytes()                        使用默认方式进行编码
            public byte[] getBytes(String charsetName)      使用指定方式进行编码

        Java中解码的方法
            String(byte[] bytes)                            使用默认方式进行解码
            String(byte[] bytes, String charsetName)        使用指定方式进行解码
        */


		//1.编码
		String str = "ai你哟";
		byte[] bytes1 = str.getBytes();
		System.out.println(Arrays.toString(bytes1));    //[97, 105, -28, -67, -96, -27, -109, -97]

		byte[] bytes2 = str.getBytes("GBK");
		System.out.println(Arrays.toString(bytes2));    //[97, 105, -60, -29, -45, -76]


		//2.解码
		String str2 = new String(bytes1);
		System.out.println(str2);   //ai你哟

		String str3 = new String(bytes1, "GBK");
		System.out.println(str3);   //ai浣犲摕

	}
}
