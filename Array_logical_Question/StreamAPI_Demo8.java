package com.aashish.Array_logical_Question;

import java.util.Arrays;

public class StreamAPI_Demo8 
{
	public static void main(String[] args) 
	{
		String[] names = {"Virat", "Sanju", "Rohit", "Bumrah"};
		Object[] array = Arrays.stream(names).map(n->n.toUpperCase()).toArray();
		System.out.println(Arrays.toString(array));
	}

}
