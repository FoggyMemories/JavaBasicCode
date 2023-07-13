package com.qian.mydynamicproxy1;

public interface Star {
	//我们可以把所有想要被代理的方法定义再接口当中


	//唱歌
	public abstract String sing(String name);

	//跳舞
	public abstract void dance();
}
