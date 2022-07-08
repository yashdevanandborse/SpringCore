package com.yash.spring;

public class Department {

	int deptid;
	String deptname;
	
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public Department(int deptid, String deptname) {
		this.deptid = deptid;
		this.deptname = deptname;
	}
	
	
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + "]";
	}
//	public void show() {
//		System.out.println("department id is:"+deptid);
//		System.out.println("department name is:"+deptname);
//	}
//	
}
