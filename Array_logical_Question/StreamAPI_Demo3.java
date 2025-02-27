package com.aashish.Array_logical_Question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI_Demo3
{
	
	public static boolean isPrime(int n)
	{
		
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
       
		List<Integer> collect = Arrays.stream(numbers).filter(StreamAPI_Demo3::isPrime).collect(Collectors.toList());
		System.out.println(collect);
	}
	
}
