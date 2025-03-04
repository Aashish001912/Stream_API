package com.aashish.MethodReference;

interface Callable
{
	Test call();
}

class Test
{
	public Test()
	{
		System.out.println("Test class constructor invoked..");
	}
}

public class ConstructorReferenceDemo1 
{
	public static void main(String[] args) 
	{
     //By Lambda 
	 Callable c1=()->new Test();
	 c1.call();
	 
	 //By using Method Reference
	 Callable c2=Test::new;
	 c2.call();
	}

}
