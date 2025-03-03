package com.aashish.StreamApi;

import java.util.List;

public class SortedDistinctDemo1 
{
	public static void main(String[] args) 
	{
      //In Ascending Order
	  List<Integer> listOfNum = List.of(89,67,56,93,43);
	  listOfNum.stream()
	  .sorted()
	  .forEach(System.out::println);
	  System.out.println("========================");
	//In Descending Order
	List<Integer> listOfNum2 = List.of(3,4,15,56,54,59);
	listOfNum2.stream().sorted((i1,i2)->i2.compareTo(i1))
	.forEach(System.out::println);
	}

}
