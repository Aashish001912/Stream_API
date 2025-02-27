package com.aashish.Array_logical_Question;

import java.util.Arrays;
import java.util.List;

public class StreamAPI_Demo4 
{
	public static void main(String[] args) 
	{
		String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};
		List<String> list = Arrays.stream(words).filter(str->str.length()>3).toList();
	    System.out.println(list);
	}

}
