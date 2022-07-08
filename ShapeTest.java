package com.yash.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeTest {

	public static void main(String[] args) {
		ApplicationContext objCTX = new 
	ClassPathXmlApplicationContext("applicationContext.xml");
		
		Shape objs =(Shape) objCTX.getBean("shape1");
		//objs.area(10);
		objs.areaofrecatngle(8, 10);
	}
}
