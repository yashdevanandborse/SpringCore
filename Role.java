package com.yash.spring;

public class Role {

	private Role() {
		
	}
	
	public static Role getOBJR() {
		return new Role();
	}
	public void show() {
		System.out.println("Role based Object is created..");
	}
}
