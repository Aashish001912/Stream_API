package com.aashish.StreamApi;

import java.util.stream.Stream;

record Product(Integer id,String name,double price)
{
	
}
public class SortedDistinctDemo2 
{
	public static void main(String[] args) 
	{
	 Product p1=new Product(222, "Varun", 45678d); 
	 Product p2=new Product(333, "Virat", 678d); 
	 Product p3=new Product(444, "Abya", 6678d); 
	 Product p4=new Product(111, "Lalit", 55678d);
	 
	 Stream.of(p1,p2,p3,p4).distinct()
	 .sorted((prod1,prod2)->Double.compare(prod1.price(), prod2.price()))
	 .forEach(System.out::println);
	}

}
