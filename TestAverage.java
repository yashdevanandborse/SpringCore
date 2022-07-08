package com.yash.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext objCTX = new ClassPathXmlApplicationContext("applicationContext.xml");
		Average objAvg = (Average) objCTX.getBean("que2");
		objAvg.ShowAvg();
	}

}





