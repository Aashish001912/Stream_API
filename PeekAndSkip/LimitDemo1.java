package com.aashish.PeekAndSkip;

import java.util.List;

public class LimitDemo1 
{
	public static void main(String[] args) 
	{
	 List<String>  players = List.of("Rohit","Virat","Gill","Akshar","Pant");
	 players.stream().limit(4)
	 .forEach(System.out::println);
	}

}
