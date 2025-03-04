package com.aashish.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo4 
{
	public static void main(String[] args) 
	{
	 List<Optional<String>>listOfCity=new ArrayList<>();
	 listOfCity.add(Optional.of("Hyderabad"));
	 listOfCity.add(Optional.of("Chennai"));
	 listOfCity.add(Optional.of("pune"));
	 listOfCity.add(Optional.of("Mumbai"));
	 listOfCity.add(Optional.of("Nagpur"));
	 listOfCity.add(Optional.empty());
	 
	 for(Optional<String>opt:listOfCity)
	 {
		 if(opt.isPresent())
		 {
			 System.out.println(opt.get());
		 }
		 else
		 {
			 System.out.println("No value in the list");
		 }
	 }
	}

}
