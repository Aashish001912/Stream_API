package com.aashish.StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamApiDemo3 
{
	public static void main(String[] args) 
	{
	  String[]names= {"Toby","Anna","Leroy"};
	  List<String> list = Arrays.asList(names).stream().sorted((s1,s2)->s1.compareTo(s2)).filter(str->str.length()==4).toList();
	  System.out.println(list);
	}

}
