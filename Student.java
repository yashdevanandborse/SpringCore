package com.yash.spring;

public class Student {

	
	String Sname;
	int rollno;
	String dob;
	String classname;
	String section;
	Result objresult;
	
	
	
	public Student() {
	}
	
	public Student(String sname, int rollno, int dob, String classname, String section, Result objresult) {
		Sname = sname;
		this.rollno = rollno;
		this.dob = dob;
		this.classname = classname;
		this.section = section;
		this.objresult = objresult;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Result getObjresult() {
		return objresult;
	}
	public void setObjresult(Result objresult) {
		this.objresult = objresult;
	}
	@Override
	public String toString() {
		return "Student [Sname=" + Sname + ", rollno=" + rollno + ", dob=" + dob + ", classname=" + classname
				+ ", section=" + section + ", objresult=" + objresult + "]";
	}
	
	void show() {
		System.out.println("student name :"+Sname);
		System.out.println("student Rollno :"+rollno);	
		System.out.println("student DOB :"+dob);
		System.out.println("student classname :"+classname);
        System.out.println("student Section :"+section);
		System.out.println("marks of math :"+objresult.getMath());
		System.out.println("marks of hindi :"+objresult.getHindi());
		System.out.println("marks of english :"+objresult.getEnglish());
		System.out.println("marks of science :"+objresult.getScience());

        

	}
	 
}
