package com.aashish.classDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo2 
{
	public static void main(String[] args) 
	{
	 List<String> list = List.of("Akriti","Smirthi","Richa","Ankita");
	 list.stream().filter(str->str.startsWith("A")).forEach(System.out::println);
	 
	 System.out.println("======================");
     
	 List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
     Set<Integer> collect = numbers.stream().filter(num->num%2==0).collect(Collectors.toSet());
     System.out.println(collect);
     
     System.out.println("======================");
     
     //WAP to accept all the names form collections 
     //whose length is greater than 3 and convert into list
     List<String> list1 = List.of("Raj","Scott","Smith","Sky","Alen","Ram");
	 List<String> collect2 = list1.stream().filter(s->s.length()>3).collect(Collectors.toList());
	 System.out.println(collect2);
	}

}
