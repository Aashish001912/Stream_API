package com.aashish.Array_logical_Question;

import java.util.Arrays;

public class StreamAPI_Demo5
{
	public static void main(String[] args) 
	{
		Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4};
		Object[] array = Arrays.stream(numbers).distinct().toArray();
	    System.out.println(Arrays.toString(array));
	}

}
