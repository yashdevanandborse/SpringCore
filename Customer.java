package com.yash.spring;

public class Customer {

	int custid;
	String custname;
	Item objitem;
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public Item getObjitem() {
		return objitem;
	}
	public void setObjitem(Item objitem) {
		this.objitem = objitem;
	}
	
	public void Showdetail() {
		System.out.println("cust id is:"+custid);
		System.out.println("custname is:"+custname);
	System.out.println("item id:"+objitem.id);
	System.out.println("item name:"+objitem.iname);
	System.out.println("item price :"+objitem.iprice);
        objitem.Showitem();
		
	}
	
}
