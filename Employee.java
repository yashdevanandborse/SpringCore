package com.yash.spring;


public class Employee {
	
	int eid;
	String ename;
	float salary;
	
     Department objdept;
     
	public Department getObjdept() {
		return objdept;
	}
	public void setObjdept(Department objdept) {
		this.objdept = objdept;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", objdept=" + objdept + "]";
	}
	public Employee() {
	}
	
	public Employee(int eid, String ename, float salary, Department objdept) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.objdept = objdept;
	}
	public void employeedetail() {
		System.out.println("employee id is:"+eid);
		System.out.println("employee name is :"+ename);
		System.out.println("employee salary is:"+salary);
		System.out.println("employee department id is:"+objdept.getDeptid());
	System.out.println("employee department name is:"+objdept.getDeptname());
//objdept.show();
	}
	


}
