package com.aashish.StreamApi;

import java.util.ArrayList;

record Student1(String name,String course)
{
	
}

public class StudentFilter
{
	public static void main(String[] args) 
	{
		ArrayList<Student1>listOfStudent=new ArrayList<>();
     	listOfStudent.add(new Student1("Alice","Java"));
     	listOfStudent.add(new Student1("Alen","Java"));
     	listOfStudent.add(new Student1("Alex","Spring"));
     	listOfStudent.add(new Student1("gulu","ADVJava"));
     	listOfStudent.add(new Student1("Smith","Python"));
     	listOfStudent.add(new Student1("Rohan","JavaScript"));
     	
     	listOfStudent.stream().filter(s->s.course().equals("Java")).forEach(System.out::println);
	}

}
