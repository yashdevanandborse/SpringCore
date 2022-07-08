package com.yash.spring;

public class Item {

	int id;
	String iname;
	float iprice;
	Category objcat;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public float getIprice() {
		return iprice;
	}
	public void setIprice(float iprice) {
		this.iprice = iprice;
	}
	public Category getObjcat() {
		return objcat;
	}
	public void setObjcat(Category objcat) {
		this.objcat = objcat;
	}
	
	void Showitem() {
//		System.out.println("Item id is:"+id);
//		System.out.println("Item name is:"+iname);
//		System.out.println("Item price is :"+iprice);
		System.out.println("catid:"+objcat.getCid());
		System.out.println("catName:"+objcat.getCname());
	}
	
}
