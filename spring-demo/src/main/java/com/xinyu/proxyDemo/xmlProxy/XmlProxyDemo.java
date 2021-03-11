package com.xinyu.proxyDemo.xmlProxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/3/10/0010 19:23
 */
public class XmlProxyDemo {

	private static ApplicationContext cxt = new ClassPathXmlApplicationContext("application-aop.xml");


	public static void main(String[] args) {
		RootService aopService = (RootService)cxt.getBean("rootService");
		aopService.rootFunction();

	}
}
