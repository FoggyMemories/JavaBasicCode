package com.qianrui.a03threadcase3;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
	@Override
	public Integer call() {
		//求1 ~ 100之间的和
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum += i;
		}
		return sum;
	}
}
