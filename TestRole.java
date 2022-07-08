package com.yash.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext objCTX = new ClassPathXmlApplicationContext("applicationContext.xml");
		Role objRole =(Role) objCTX.getBean("role");
		objRole.show();
	}

}
