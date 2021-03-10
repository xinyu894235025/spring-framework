package com.xinyu.proxyDemo.JDKProxy;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/3/10/0010 17:44
 */
public class AccountServiceImpl implements IAccountService {
	@Override
	public void transfer() {
		System.out.println("调用dao层,完成转账主业务.");
	}
}
