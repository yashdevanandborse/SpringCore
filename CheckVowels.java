package com.yash.spring;

public class CheckVowels implements Vowels  {

	public void method(String str) {
		str= str.replaceAll("[aeiouAEIOU]", " ");
		System.out.println("\n string without Vowels = :"+str);
	}
}
