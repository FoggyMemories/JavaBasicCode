package com.qian.mydynamicproxy1;

/*
	此类的作用:
		创建一个代理


	需求:
		外面的人想要大明星唱一首歌
			1.获取代理的对象
				Proxy.newProxyInstance(大明星的对象)
			2.再调用代理的唱歌方法
				代理对象.唱歌的方法("歌曲名称");
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
	/**
	 * 此方法的作用:
	 * 给一个明星的对象,创建一个代理
	 * 形参:
	 * 被代理的明星对象
	 * 返回值:
	 * 给明星创建的代理
	 */
	public static Star createProxy(BigStar bigStar) {
		/* java.lang.reflect.Proxy类：提供了为对象产生代理对象的方法：

        public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
        参数一：用于指定用哪个类加载器，去加载生成的代理类
        参数二：指定接口，这些接口用于指定生成的代理长什么，也就是有哪些方法
        参数三：用来指定生成的代理对象要干什么事情*/

		Star star = (Star) Proxy.newProxyInstance(
				ProxyUtil.class.getClassLoader(),//用于指定用哪个类加载器，去加载生成的代理类
				new Class[]{Star.class},//能代理的方法都在接口当中
				new InvocationHandler() {//用来指定生成的代理对象要干什么事情
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						/*
							参数一:代理的对象
							参数二:要运行的方法 sing
							参数三:调用sing方法,传递的实参
						 */

						if ("sing".equals(method.getName())) {
							System.out.println("准备话筒,收钱");
						} else if ("dance".equals(method.getName())) {
							System.out.println("准备场地,收钱");
						}

						//去找大明星开始唱歌或者跳舞
						//代码的表现形式:调用大明星里面唱歌或者跳舞的方法

						//利用反射去调用
						return method.invoke(bigStar, args);
					}
				}
		);
		return star;
	}
}
