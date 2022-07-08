package com.yash.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {

		ApplicationContext objCTX = new ClassPathXmlApplicationContext("applicationContext.xml");
		//objCTX.getBean("student1");
		Student objStu = (Student) objCTX.getBean("student1");
		objStu.show();
		
	}

}
