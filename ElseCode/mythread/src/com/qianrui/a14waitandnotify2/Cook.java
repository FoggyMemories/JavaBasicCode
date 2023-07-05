package com.qianrui.a14waitandnotify2;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread {

	ArrayBlockingQueue<String> queue;

	public Cook(ArrayBlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			//不断地把面条放到阻塞队列当中
			try {
				queue.put("面条");
				System.out.println("厨师放了一晚面条");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
