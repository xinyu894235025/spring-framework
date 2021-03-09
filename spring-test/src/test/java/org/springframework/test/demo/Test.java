package org.springframework.test.demo;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/3/9/0009 17:59
 */
public class Test {

	public static void main(String[] args) {
		MyClassPathXmlApplicationContext cpa = new MyClassPathXmlApplicationContext("application.xml");
		XinyuConfig myconfig = (XinyuConfig) cpa.getBean("myconfig");
		System.out.println(myconfig.getAge());
		System.out.println(myconfig.getName());
	}

	@org.junit.Test
	public void test(){
		MyClassPathXmlApplicationContext cpa = new MyClassPathXmlApplicationContext("application.xml");
//		XinyuConfig myconfig = (XinyuConfig) cpa.getBean("myconfig");
		System.out.println("myconfig.getAge()");
//		System.out.println(myconfig.getName());
	}
}
