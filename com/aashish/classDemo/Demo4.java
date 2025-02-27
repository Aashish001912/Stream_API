package com.aashish.classDemo;

import java.util.Arrays;
import java.util.stream.IntStream;

//Array logical using filter

public class Demo4 
{
	public static void main(String[] args) 
	{
     int []arr= {1,2,3,4,5,6,7,8};
     System.out.println("Original Array:"+Arrays.toString(arr));
     
     IntStream stream = Arrays.stream(arr);
     int[] array = stream.filter(n->n%2==0).toArray();
     System.out.println("Even Numbers :"+Arrays.toString(array));
     
     //WAP to print all the array elements which are divisible by 3 and 5
     Integer[]numbers= {15,20,25,30,35,40,45,50};
     Object[] array2 = Arrays.stream(numbers).filter(n->n%3==0 && n%5==0).toArray();
	 System.out.println(Arrays.toString(array2));
	}

}
