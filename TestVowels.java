package com.yash.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext objCTX = new ClassPathXmlApplicationContext("applicationContext.xml");
		Vowels objV =(Vowels) objCTX.getBean("vowels");
		objV.method("DEVANAND");
	}

}
