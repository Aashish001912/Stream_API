package com.aashish.Array_logical_Question;

import java.util.Arrays;

public class StreamAPI_Demo7 {

	public static void main(String[] args) 
	{
	 Integer[] numbres= {10,20,30,40,50};
	 String[] array = Arrays.stream(numbres).map(n->"Number:"+n).toArray(n->new String[n]);
	 System.out.println(Arrays.toString(array));
	}

}
