package com.aashish.PeekAndSkip;

import java.util.stream.Stream;

public class LimitDemo2 
{
	public static void main(String[] args) 
	{
	Stream.generate(()->Math.random())
	.limit(5).forEach(System.out::println);
	
	Stream.iterate(1,n->n+5)
	.limit(10).forEach(System.out::println);
	}

}
