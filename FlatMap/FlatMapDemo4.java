package com.aashish.FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo4 
{
  public static void main(String[] args) 
  {
	List<String> asList = Arrays.asList("Jaya","Aryan","Virat","Abhay");
    Object[] array = asList.stream().flatMap(str->Stream.of(str.charAt(0))).toArray();
    System.out.println(Arrays.toString(array));
  }
}
