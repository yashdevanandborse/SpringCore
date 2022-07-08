package com.yash.spring;

public class ShapeFactoryMethod {

	public static Shape getShapeobj() {
		return new Rectangle();
		//return new Circle();
	}
}
