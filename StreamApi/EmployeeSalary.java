package com.aashish.StreamApi;

import java.util.ArrayList;


record Employee(Integer id,String name,Double salary)
{
	
}
public class EmployeeSalary 
{
	public static void main(String[] args) 
	{
	 ArrayList<Employee>listOfEmployee= new ArrayList<>();
	 listOfEmployee.add(new Employee(111,"Alex",56000d));
	 listOfEmployee.add(new Employee(444,"Bvear",17000d));
	 listOfEmployee.add(new Employee(333,"Amut",3999d));
	 listOfEmployee.add(new Employee(222,"Rohan",50000d));
	 
	 listOfEmployee.stream().filter(emp->emp.salary()>30000)
	 .forEach(System.out::println);
	 
	}

}
