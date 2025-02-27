package com.aashish.classDemo;

import java.util.ArrayList;
import java.util.List;

/* WAP to retrieve all the employee records whose salary is greater than 50k
 * and convert into list*/

record Employee(Integer id,String name,Double salary)
{
	
}
public class Demo3
{
	public static void main(String[] args) 
	{
	 ArrayList<Employee>listOfEmployee=new ArrayList<>();
	 listOfEmployee.add(new Employee(222,"Scott", 58000d));
	 listOfEmployee.add(new Employee(111,"Smith", 28000d));
	 listOfEmployee.add(new Employee(333,"Alen", 45000d));
	 listOfEmployee.add(new Employee(444,"John", 50000d));
	 listOfEmployee.add(new Employee(555,"Raj", 68000d));
	 
	 List<Employee> listOfFiltered = listOfEmployee.stream().filter(emp->emp.salary()>50000).toList();
	 listOfFiltered.forEach(System.out::println);
	}

}
