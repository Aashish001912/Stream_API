package com.aashish.MethodReference;

interface Worker1
{
	void work(double salary);
}
public class MethodRefDemo2
{
	public static void main(String[] args) 
	{
     Worker1 w1=Employee1::salary;
     w1.work(87654d);
	}

}
class Employee1
{
	public static void salary(double sal)
	{
		System.out.println("Employee Salary is:"+sal);
	}
}
