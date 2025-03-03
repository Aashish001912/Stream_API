package com.aashish.PeekAndSkip;

import java.util.Random;
import java.util.stream.IntStream;

//  With Array
public class SkipLimitDemo1
{
	public static void main(String[] args) 
	{
	 Random rr=new Random();
	 IntStream.generate(()->rr.nextInt(100))
	 .limit(10).forEach(System.out::println);
	 
	}

}
