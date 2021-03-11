package com.xinyu.proxyDemo.xmlProxy;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/3/10/0010 19:14
 */
public class AspectService {


	public void before(){
		System.out.println("I'm before advice!");
	}


	public void after(){
		System.out.println("I'm after advice!");
	}


	public void around(){
		System.out.println("I'm around advice!");
	}


}
