package com.xinyu.proxyDemo.JDKProxy;

import java.lang.reflect.Proxy;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/3/10/0010 17:46
 */
public class JDKProxyDemo {
	public static void main(String[] args) {
		//创建目标对象
		IAccountService target = new AccountServiceImpl();
		//创建代理对象
		//JDK动态代理
		IAccountService proxy = (IAccountService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				new AccountAdvice(target)
		);
		proxy.transfer();
	}
}
