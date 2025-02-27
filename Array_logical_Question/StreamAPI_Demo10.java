package com.aashish.Array_logical_Question;

import java.util.Arrays;
import java.util.List;

public class StreamAPI_Demo10 
{
	public static void main(String[] args) 
	{
		String []names = {"James", "Aryan", "Vibha", "Aniket"};
		List<Character> list = Arrays.stream(names).map(str->str.charAt(0)).toList();
	    System.out.println(list);
	}

}
