package com.yash.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext objCTX = new  ClassPathXmlApplicationContext("applicationContext.xml");
		No objNo= (No) objCTX.getBean("que5");
		objNo.number(new int[] {2,4,5,6,7,8,9,22,44,12,54,78,90,4,21,32,1});
	}

}
