package com.aashish.PeekAndSkip;

import java.util.stream.IntStream;

public class SkipLimitDemo2 
{
	public static void main(String[] args) 
	{
	IntStream.generate(()->10)
	.limit(5)
	.forEach(System.out::println);

	}

}
