package com.xinyu.hashMapDemo;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/4/6/0006 15:36
 */
public class PObject {

	String key;

	PObject(String key) {
		this.key = key;
	}

	@Override
	public int hashCode() {
		return key.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof PObject){
			return obj.hashCode() == key.hashCode();
		}
		return false;
	}
}
