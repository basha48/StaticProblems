package com.statics.com;

import java.util.ArrayList;
import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
	
		List<Employee> list = new ArrayList();
	 
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
	
		list.add(e1);
		list.add(e2);
		list.add(e3);
	
		e1.name = "Arun";
		e1.id = 10;
		e1.age = 50;
		e1.email = "Arjun@1997";
		e1.mobileNo = 9848906055l;
		e1.salary = 5000;
	
		e2.name = "manoj";
		e2.id = 20;
		e2.age = 60;
		e2.email = "manoj@1997";
		e2.mobileNo = 8648906555l;
		e2.salary = 6000;
	
		e3.name = "Tarun";
		e3.id = 30;
		e3.age = 70;
		e3.email = "Tarun@1997";
		e3.mobileNo = 848905555l;
		e3.salary = 6000;
		
		EmpMain empMain = new EmpMain();
		empMain.getAverage(list);
		
		System.out.println("The Average Salary is :" + Employee.avgSalary);
	}
	
	
	public void getAverage(List<Employee> list) {
		int totalSalary = 0;
		for(Employee o : list) {
			//totalSalary += o.salary; 
		totalSalary = (int) (totalSalary + o.salary); 
		}
		Employee.avgSalary = totalSalary / 3;
	}

}
