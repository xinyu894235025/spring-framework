package com.xinyu.proxyDemo.annotationProxy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/3/23/0023 17:47
 */
@Aspect
@Component
public class MyAspect {

	@Pointcut("execution(public static com.xinyu.proxyDemo.annotationProxy.MyService.rootFunction())")
	public  void rootfunction(){

	}

	@Before("rootfunction()")
	public  void before(){
		System.out.println("Before function！");
	}


}
