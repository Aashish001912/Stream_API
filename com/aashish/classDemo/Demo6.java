package com.aashish.classDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo6 
{
	public static void main(String[] args) 
	{
	 ArrayList<Integer>listOfNumber=new ArrayList<>();
	 listOfNumber.add(12);
	 listOfNumber.add(32);
	 listOfNumber.add(2);
	 listOfNumber.add(25);
	 listOfNumber.add(14);
	 System.out.println("Original Data:"+listOfNumber);
	 
	 List<Integer> list = listOfNumber.stream().map(num->num+10).toList();
	 System.out.println("After adding :"+list);
	 
	 
	 Stream<Integer> of = Stream.of(1,2,3,4,5,6,7,8,9,10);
	 of.filter(num->num%2==0).map(n->n*n*n).forEach(System.out::println);
	}

}
