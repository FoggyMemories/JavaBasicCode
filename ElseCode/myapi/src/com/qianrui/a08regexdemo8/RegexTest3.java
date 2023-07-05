package com.qianrui.a08regexdemo8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest3 {
	public static void main(String[] args) throws IOException {
		//创建一个URL对象
		URL url = new URL("https://chichu.cc/");

		//连接上这个网址
		//细节：保证网络是畅通的
		URLConnection conn = url.openConnection();

		//创建一个对象去读取网络中的数据
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line;

		//获取正则表达式
		String regex = "\\w{2,10}\\.\\w{6,10}\\.[a-z]{2,4}";
		Pattern pattern = Pattern.compile(regex);

		//在读取的时候每次读一整行
		while ((line = br.readLine()) != null) {
			//System.out.println(line);
			Matcher matcher = pattern.matcher(line);
			while (matcher.find()) {
				System.out.println(matcher.group());
			}
		}
		br.close();
	}
}
