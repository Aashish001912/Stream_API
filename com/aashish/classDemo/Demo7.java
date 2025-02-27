package com.aashish.classDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//WAP to fetch only the name of the product from the product object

record Product(Integer pid,String pname)
{
	
}
public class Demo7 
{
	public static void main(String[] args) 
	{
	 Set<String> collect = getProductList().stream().map(product->product.pname()).collect(Collectors.toSet());
	 System.out.println(collect);
	}
	public static List<Product> getProductList()
	{
		ArrayList<Product>listOfProd=new ArrayList<>();
		listOfProd.add(new Product(111,"Camera"));
		listOfProd.add(new Product(222,"Mobile"));
		listOfProd.add(new Product(333,"Laptop"));
		listOfProd.add(new Product(444,"Headphone"));
		listOfProd.add(new Product(555,"Headphone"));
		return listOfProd;
		
	}

}
