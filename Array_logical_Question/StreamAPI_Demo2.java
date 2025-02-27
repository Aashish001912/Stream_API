package com.aashish.Array_logical_Question;

import java.util.Arrays;

public class StreamAPI_Demo2
{
	public static void main(String[] args) 
	{
	 String[] filteredNames = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
	 Object[] array = Arrays.stream(filteredNames ).filter(name->name.toLowerCase().contains("a")).toArray();
	 System.out.println("Filterd Names:"+Arrays.toString(array));
	 
	 
	}

}
