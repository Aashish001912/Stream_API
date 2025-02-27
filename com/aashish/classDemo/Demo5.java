package com.aashish.classDemo;

import java.util.Arrays;

//WAP to filter all the prime number from the given number
public class Demo5 
{
  public static void main(String[] args) 
  {
	int []numbers= {2,3,4,5,6,7,8,8,9,10,11,13};
	int[] array = Arrays.stream(numbers).filter(Demo5::isPrime).toArray();
    System.out.println(Arrays.toString(array));
  }
  public static boolean isPrime(int num)
  {
	  if(num<2)
	  {
		  return false;
	  }
	  for(int i=2;i<=Math.sqrt(num);i++)
	  {
		  if(num%i==0)
		  {
			  return false;
		  }
	  }
	  return true;
  }
}
