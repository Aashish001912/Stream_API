package com.aashish.StreamApi;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo4 
{
	public static void main(String[] args)
	{
	 Integer []array= {-3, 2, -5, 6, -1, 4};
	 List<Integer> collect = Arrays.asList(array).stream().filter(i->i>0).collect(Collectors.toList());
	 List<Integer> list = collect.stream().map(i->i*i).toList();
	 int sum2 = list.stream().mapToInt(Sum->Sum).sum();
	 System.out.println(sum2);
	}
	
	
}
