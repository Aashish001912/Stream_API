package com.aashish.StreamApi;

/*Write a Java program that uses the Stream.of method to create a stream of strings, filters 
 * out the empty strings, and then concatenate the remaining strings into a single string..
Input:
A stream of strings ["Hello", "", "World", " ", "from", " ", "Java", "!"].
Output:
A single concatenated string:
HelloWorld from Java!
*/

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo2
{
	public static void main(String[] args) 
	{
	 String result=Stream.of("Hello", "", "World", " ", "from", " ", "Java", "!").filter(str->!str.isEmpty()).collect(Collectors.joining());
	 System.out.println("Concatenated String:"+result);
	}

}
