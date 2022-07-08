package com.yash.spring;

public class MaxNumber implements No {

	@Override
	public void number(int[] a) {
		// TODO Auto-generated method stub
		
		int maxNum = a[0];
		for(int j:a) {
			if(j>maxNum)
				maxNum = j;
		}
		System.out.println("maximum no is:"+maxNum);
	}

	
}
