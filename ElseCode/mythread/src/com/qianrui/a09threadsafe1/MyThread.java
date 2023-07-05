package com.qianrui.a09threadsafe1;

public class MyThread extends Thread {

	//表示这个类的所有对象都共享ticket数据
	static int ticket = 0;//0 ~ 99

	@Override
	public void run() {
		while (true) {
			//同步代码块
			//一般用该类的字节码文件(唯一的)
			synchronized (MyThread.class) /*锁对象一定是要唯一的*/ {
				if (ticket < 100) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
					ticket++;
					System.out.println(getName() + "正在卖第" + ticket + "张票!!!");
				} else {
					break;
				}
			}
		}
	}
}
