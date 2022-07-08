package com.yash.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext objCTX = new  ClassPathXmlApplicationContext("applicationContext.xml");
		
		Customer objCust = (Customer) objCTX.getBean("Custbean");
		objCust.Showdetail();
	
		//System.out.println(objCust.get);
	}

}
