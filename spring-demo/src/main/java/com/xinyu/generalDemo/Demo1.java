package com.xinyu.generalDemo;

import java.net.Inet4Address;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/3/16/0016 15:28
 */
public class Demo1 {

	public static void main(String[] args) {
		Integer aa = 1;
		Integer bb = null;
		add(aa, bb);

	}

	public static void add(int a,int b){
		int c = a + b;
		System.out.println(c);
	}
}
