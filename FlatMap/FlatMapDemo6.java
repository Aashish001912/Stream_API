package com.aashish.FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class FlatMapDemo6
{
	public static void main(String[] args) 
	{
	 int[]arr1= {10,20,30};
	 int[]arr2= {40,50,60};
	 int[]arr3= {70,80,90};
	 
	 List<int[]> asList = Arrays.asList(arr1,arr2,arr3);
	 int[] array2 = asList.stream().flatMapToInt(array->Arrays.stream(array)).toArray();
	 System.out.println(Arrays.toString(array2));
	 
	 
	 double d1[]= {1.2,3.2,7.7};
	 double d2[]= {5.2,4.0,3.7};
	 double d3[]= {9.2,2.5,5.7};	
	
	 List<double[]> listOfDoubleArray= Arrays.asList(d1,d2,d3);
     double[] doubleArray= listOfDoubleArray.stream().flatMapToDouble(array->DoubleStream.of(array)).toArray();
	 System.out.println(Arrays.toString(doubleArray));
	}

}
