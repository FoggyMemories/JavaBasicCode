package com.qianrui.a02systemdemo2;

public class SystemDemo1 {
	public static void main(String[] args) {
		/*
		 *public static void exit(int status)                 终止当前运行的Java虚拟机
		 *public static long currentTimeMillis()              返回当前系统的事件毫秒值形式
		 *public static viod attaycopy(数据源数组，起始索引，目的地数组，起始索引，拷贝个数)   数组拷贝
		 *
		 * */


		long l = System.currentTimeMillis();
		System.out.println(l);

		//方法的形参：状态码
		//0:表示当前虚拟机是正常停止
		//非0:表示当前虚拟机是异常停止
		System.exit(0);

		System.out.println("看看我执行了么");
	}
}
