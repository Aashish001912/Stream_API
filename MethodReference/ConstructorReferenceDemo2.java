package com.aashish.MethodReference;

import java.util.function.Function;

class Employee2
{
	private String empName;
	public Employee2(String empName)
	{
		super();
		this.empName=empName;
	}
	public String getEmpName()
	{
		return empName;
	}
}

public class ConstructorReferenceDemo2 
{
	public static void main(String[] args) 
	{
	 Function<String, Employee2>fn1=Employee2::new;
	 Employee2 employee=fn1.apply("Alen");
	 System.out.println(employee.getEmpName());
	}

}
