package com.xinyu.proxyDemo.CglibProxy;

import org.springframework.cglib.proxy.Enhancer;


/**
 * @Description
 * @Author xinyu4
 * @Date 2021/3/10/0010 17:46
 */
public class CglibProxyDemo {
	public static void main(String[] args) {
		AccountService target = new AccountService();

		//创建代理对象
		AccountService proxy = (AccountService) Enhancer.create(target.getClass(),
				new BeforeAdvice());
		proxy.transfer();
	}
}
