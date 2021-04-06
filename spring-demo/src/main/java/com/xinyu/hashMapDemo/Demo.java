package com.xinyu.hashMapDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/4/6/0006 15:35
 */
public class Demo {

	public static void main(String[] args) {
		Map<PObject, String> hashMap = new HashMap<>();
		PObject a = new PObject("A");
		PObject b = new PObject("A");
		hashMap.put(a, "hello");
		String s = hashMap.get(b);
		System.out.println(s);

	}

}


