package com.test.test7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
	ArrayList<Integer> list;

	public MyCallable(ArrayList<Integer> list) {
		this.list = list;
	}

	@Override
	public Integer call() throws Exception {
		ArrayList<Integer> boxList = new ArrayList<>();

		while (true) {
			synchronized (MyCallable.class) {
				if (list.size() == 0) {
					System.out.print("在此次抽奖过程中,");
					print(boxList);
					break;
				} else {
					//继续抽奖
					Collections.shuffle(list);
					int prize = list.remove(0);
					boxList.add(prize);
				}
			}
			Thread.sleep(100);
		}

		Thread.sleep(100);
		//把集合的最大值返回
		if (boxList.size() == 0) {
			return null;
		} else {
			return Collections.max(boxList);
		}

	}


	private void print(ArrayList<Integer> list) {
		System.out.println(Thread.currentThread().getName() + "总共产生了" + list.size() + "个奖项.");
		System.out.print("分别为:");

		int sum = list.get(0);
		for (int index : list) {
			System.out.print(index + ", ");
			sum += index;
		}
		System.out.println("最高奖项为:" + Collections.max(list) + "总计额为" + sum);
	}
}


