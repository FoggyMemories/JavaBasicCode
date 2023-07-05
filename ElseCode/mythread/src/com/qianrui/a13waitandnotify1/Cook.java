package com.qianrui.a13waitandnotify1;

public class Cook extends Thread {
	@Override
	public void run() {
		/*
		 * 1.循环
		 * 2.同步代码块
		 * 3.判断共享数据是否到了末尾(优先写到了末尾的情况)
		 * 4.判断共享数据是否到了末尾(再写没有到末尾,执行核心逻辑)
		 * */

		while (true) {
			synchronized (Desk.lock) {
				if (Desk.count == 0) {
					break;
				} else {
					//判断桌子上是否有食物
					if (Desk.foodFlog == 1) {
						//如果有,就等待
						try {
							Desk.lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} else {
						//如果没有,就制作食物
						System.out.println("厨师做了一碗面条");
						//修改桌子上的食物状态
						Desk.foodFlog = 1;
						//叫醒等待的消费者开吃
						Desk.lock.notifyAll();
					}
				}
			}
		}
	}
}
