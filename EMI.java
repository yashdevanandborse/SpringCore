package com.yash.spring;

public class EMI {
	
	float p,r,t;
	

	public EMI() {
		super();
	}


	public EMI(float p, float r, float t) {
		super();
		this.p = p;
		this.r = r;
		this.t = t;
	}
	
	public void CalculateEMI() {
		
		float emi;
	
		emi = (p * r * (float)Math.pow(1 + r, t))
                / (float)(Math.pow(1 + r, t) - 1);
		
		System.out.println("Total EMI is : "+emi);
     
	}


	

}
