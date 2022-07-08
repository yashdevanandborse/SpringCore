package com.yash.spring;

import java.util.ArrayList;
import java.util.List;

public class ItemList {
	
	
	int itemid;
	String iname;
	float iprice;
	
	public ItemList() {
		
	}
	
	
	public ItemList(int itemid, String iname, float iprice) {
	
		this.itemid = itemid;
		this.iname = iname;
		this.iprice = iprice;
	}


	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
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
	
	@Override
	public String toString() {
		return "Listitem [itemid=" + itemid + ", iname=" + iname + ", iprice=" + iprice + "]";
	}
	
		
	 public void show() {
		 System.out.println("Item id is:"+itemid);
		 System.out.println("Item Name is:"+iname);
		 System.out.println("Item Price is :"+iprice);
	 }
	
	

}
