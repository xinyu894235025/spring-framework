package com.xinyu.proxyDemo.annotationProxy;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/3/23/0023 17:41
 */
@Service
public class MyService {

	public static void rootFunction(){
		System.out.println("I'm root function!");
	}
}
