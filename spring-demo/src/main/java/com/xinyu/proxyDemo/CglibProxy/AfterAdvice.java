package com.xinyu.proxyDemo.CglibProxy;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/3/10/0010 18:22
 */
public class AfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		after();
		method.invoke(returnValue,args);
	}

	public void after(){
		System.out.println("the after Enhancer!");
	}


}
