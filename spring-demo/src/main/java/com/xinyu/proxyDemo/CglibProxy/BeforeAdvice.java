package com.xinyu.proxyDemo.CglibProxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/3/10/0010 17:45
 */
public class BeforeAdvice implements MethodInterceptor {
	/**
	 * 代理方法, 每次调用目标方法时都会进到这里
	 */
	@Override
	public Object intercept(Object o, Method method, Object[] objs, MethodProxy methodProxy) throws Throwable {
		before();
		return methodProxy.invokeSuper(o, objs);
		//        return method.invoke(obj, args);  这种也行
	}

	/**
	 * 前置增强
	 */
	private void before() {
		System.out.println("The before Enhancer!");
	}
}
