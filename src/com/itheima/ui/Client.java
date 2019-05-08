package com.itheima.ui;

import com.itheima.service.ICustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author:fanyafei
 * @Version:1.0
 * @Date:2019/5/811:13.
 * @see:
 **/
public class Client {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		ICustomerService cs=(ICustomerService)ac.getBean("customerService");
		cs.saveCustomer();
	}
}
