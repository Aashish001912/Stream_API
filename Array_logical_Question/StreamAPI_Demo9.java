package com.aashish.Array_logical_Question;

import java.util.Arrays;

public class StreamAPI_Demo9
{
	public static void main(String[] args) 
	{
		Boolean[] flags = {true, false, true, false, true};
		Object[] array = Arrays.stream(flags).map(n->{
			if(n) {
				return "Yes";
			}
			else
				return "No";
		}).toArray();
		System.out.println(Arrays.toString(array));
	}

}
