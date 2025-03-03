package com.aashish.StreamApi;

import java.util.stream.Stream;

/*Write a Java program that creates a stream of integers using Stream.of, filters out the even numbers and then prints each squared number using forEach.
Input (Stream):
1, 2, 3, 4, 5, 6, 7, 8, 9, 10
Output:
2    4
4    16
6    36
8    64
10   100       */

public class StreamDemo1 
{
   public static void main(String[] args) 
   {
	 Stream.of(1,2,3,4,5,6,7,8,9,10)
	 .filter(n->n%2==0).map(n->n*n).forEach(System.out::println);
   }
}
