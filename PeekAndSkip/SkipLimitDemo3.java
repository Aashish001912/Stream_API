package com.aashish.PeekAndSkip;

import java.util.stream.IntStream;

public class SkipLimitDemo3 
{
	public static void main(String[] args) 
	{
	int[] fib= {0,1};
	IntStream.generate(()->{
	int next=fib[0]+fib[1];
	fib[0]=fib[1];
	fib[1]=next;
	return fib[0];
	}).limit(10)
	.forEach(System.out::println);
	}

}
