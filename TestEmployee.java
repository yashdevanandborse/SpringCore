package com.yash.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<Employee>();

		ApplicationContext objCTX= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Employee objemp=(Employee) objCTX.getBean("e1");
//		Employee objEMP= (Employee) objCTX.getBean("e1");
//	objEMP.employeedetail();
		
		Employee obj1=(Employee) objCTX.getBean("e1");
		Employee obj2=(Employee) objCTX.getBean("e2");
		Employee obj3=(Employee) objCTX.getBean("e3");
		Employee obj4=(Employee) objCTX.getBean("e4");

		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		List<Employee> emp = list.stream().sorted((p1,p2)->Float.compare(p1.salary,p2.salary)).collect(Collectors.toList());
	      // emp.forEach(System.out::println);
		//System.out.println(list.);
for(Employee emp1:emp) {
	System.out.println(emp1);
}
		
		
	}

}
