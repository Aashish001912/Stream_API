package com.aashish.FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 
{
	public static void main(String[] args) 
	{
	 List<String> ind = Arrays.asList("Virat","Hardik","Bumrah","Gill");
	 List<String> pak = Arrays.asList("Babar","Rizvan","Salman","Afridi");
	 List<List<String>> icc = Arrays.asList(ind,pak);
	 List<String> collect = icc.stream().flatMap(list->list.stream()).collect(Collectors.toList());
	 System.out.println(collect);
	}

}
