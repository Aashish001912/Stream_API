package com.aashish.TakeWhileAndDropWhile;

import java.util.stream.Stream;

public class TakeWhileDemo
{
	public static void main(String[] args) 
	{
	 Stream<Integer> number = Stream.of(10,4,23,45,21,100);
	 number.takeWhile(n->n>9).forEach(System.out::println);
	}

}
