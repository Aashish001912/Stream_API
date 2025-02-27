package com.aashish.Array_logical_Question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamAPI_Demo1
{
	public static void main(String[] args) 
	{
	 Integer []arr={-10, -5, 0, 5, 10, 15, -20};
	 List<Integer>positiveNumber=Arrays.stream(arr)
	 .filter(num->num>0).collect(Collectors.toList());
	 System.out.println("Positive Number:"+positiveNumber);
	}

}
