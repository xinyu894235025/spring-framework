package com.xinyu.proxyDemo.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/3/10/0010 17:45
 */
public class AccountAdvice implements InvocationHandler {
	//目标对象
	private IAccountService target;

	public AccountAdvice(IAccountService target) {
		this.target = target;
	}

	/**
	 * 代理方法, 每次调用目标方法时都会进到这里
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		return method.invoke(target, args);
	}

	/**
	 * 前置增强
	 */
	private void before() {
		System.out.println("对转账人身份进行验证.");
	}
}
