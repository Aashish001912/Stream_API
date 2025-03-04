package com.aashish.Optional;

import java.util.Optional;

public class OptionalDemo2 
{
	public static void main(String[] args) 
	{
	String str="Hyderabad";
	Optional<String> container = Optional.ofNullable(str);
	String value = container.orElse("No value in the container");
	System.out.println(value);
	System.out.println("================");
	
	Double d1=81.38d;
	Optional<Double> ctr = Optional.ofNullable(d1);
	ctr.ifPresent(System.out::println);
	}

}
