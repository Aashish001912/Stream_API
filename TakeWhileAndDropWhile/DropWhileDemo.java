package com.aashish.TakeWhileAndDropWhile;

import java.util.stream.Stream;

public class DropWhileDemo
{
	public static void main(String[] args) 
	{
	 Stream<Integer> number = Stream.of(1,2,3,4,5,6,7,8,9,10);
	 number.dropWhile(num->num<7).forEach(System.out::println);
	 
	 System.out.println("=======================================");
	 Stream<Integer> numbers = Stream.of(12,13,4,2,4,8,1,5,10);
	 numbers.dropWhile(num->num>5).forEach(System.out::println);
	}

}
