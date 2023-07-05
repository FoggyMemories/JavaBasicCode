package com.qianrui.a10threadsafe2;

public class MyRunnable implements Runnable {

	int ticket = 0;

	@Override
	public void run() {
		//1.循环
		while (true) {
			if (method()) break;
		}
	}
	//this
	private synchronized boolean method() {
		if (ticket == 100) {
			//如果到了末尾
			return true;
		} else {
			//如果没有到末尾
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			ticket++;
			System.out.println(Thread.currentThread().getName() + "在卖第" + ticket + "张票!!!");
		}
		return false;
	}
}
