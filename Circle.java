package com.yash.spring;

public  class Circle implements Shape {
	
	public void area(int a) {
		double pi=3.14;
		System.out.println("Area of Circle is:"+ pi*a*a);
	}

	@Override
	public void areaofrecatngle(int l, int w) {
		// TODO Auto-generated method stub
		
	}

}
