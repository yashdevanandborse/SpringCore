package com.yash.spring;

public class Result {

	int rollno;
	int math;
	int hindi;
	int english;
	int science;
	
	
	public Result() {
	}
	
	public Result(int rollno, int math, int hindi, int english, int science) {
		this.rollno = rollno;
		this.math = math;
		this.hindi = hindi;
		this.english = english;
		this.science = science;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getHindi() {
		return hindi;
	}
	public void setHindi(int hindi) {
		this.hindi = hindi;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}

	@Override
	public String toString() {
		return "Result [rollno=" + rollno + ", math=" + math + ", hindi=" + hindi + ", english=" + english
				+ ", science=" + science + "]";
	}
	
	
}
