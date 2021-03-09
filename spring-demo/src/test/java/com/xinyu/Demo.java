package com.xinyu;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/3/9/0009 18:41
 */
public class Demo {

	public static void main(String[] args) {
		//1，通过构造方法进行String[] configLocation配置
		ClassPathXmlApplicationContext aa = new ClassPathXmlApplicationContext("application.xml");
		DemoConfig config = (DemoConfig)aa.getBean("config");
		System.out.println(config.getCfgName());
	}

	@Test
	public void test(){
		System.out.println("46584651156");
	}

}
