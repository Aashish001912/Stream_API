package com.aashish.MethodReference;

import java.util.Vector;

class EvenOdd
{
	public static void isEvent(int number)
	{
		if(number%2==0)
		{
			System.out.println(number+" is Even.");
		}
		else
		{
			System.out.println(number+" is odd.");
		}
	}
}
public class StaticMethodReferenceDemo 
{
	public static void main(String[] args) 
	{
	 Vector<Integer>numbers=new Vector<>();
	 numbers.add(12);
	 numbers.add(42);
	 numbers.add(14);
	 numbers.add(13);
	 numbers.add(19);
	 
	 //Using Lambda
	 numbers.forEach(num->EvenOdd.isEvent(num));
	 
	 System.out.println("========================");
	 
	 //Method Reference
	 numbers.forEach(EvenOdd::isEvent);
	}

}
