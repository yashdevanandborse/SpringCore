package com.yash.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext obtCTX = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EMI objEMI = (EMI) obtCTX.getBean("emibean");
		objEMI.CalculateEMI();
	}

}
