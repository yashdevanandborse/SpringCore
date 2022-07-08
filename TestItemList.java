package com.yash.spring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestItemList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ItemList> itemlist = new ArrayList<ItemList>();
		ApplicationContext objCTX = new ClassPathXmlApplicationContext("applicationContext.xml");
//		ItemList objIL = (ItemList) objCTX.getBean("que8");
//		objIL.show();
		
		ItemList objIL1 = (ItemList) objCTX.getBean("que8");
		ItemList objIL2 = (ItemList) objCTX.getBean("que8-1");
		ItemList objIL3 = (ItemList) objCTX.getBean("que8-2");
		ItemList objIL4 = (ItemList) objCTX.getBean("que8-3");
		ItemList objIL5 = (ItemList) objCTX.getBean("que8-4");
		ItemList objIL6 = (ItemList) objCTX.getBean("que8-5");
		
		itemlist.add(objIL1);
		itemlist.add(objIL2);
		itemlist.add(objIL3);
		itemlist.add(objIL4);
		itemlist.add(objIL5);
		itemlist.add(objIL6);
		
		List<ItemList> ilist= itemlist.stream().sorted((s1,s2)->(s1.iname.compareTo(s2.iname))).collect(Collectors.toList());

		//ilist.forEach(System.out::println);
		
		System.out.println("====List Ascending order===");
		
		for(ItemList ilist2:ilist) {
			System.out.println(ilist2.iname);
		}
		System.out.println("===List Decending Order===");
		List<ItemList> ilistA= itemlist.stream().sorted((s1,s2)->(s2.iname.compareTo(s1.iname))).collect(Collectors.toList());

		for(ItemList ilist3:ilistA) {
			System.out.println(ilist3.iname);
		}
		//Collections.sort(itemlist, new MySort());

       // System.out.println(itemlist);
	}
	}


