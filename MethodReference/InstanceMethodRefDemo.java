package com.aashish.MethodReference;

//Instance Method reference
@FunctionalInterface
interface Trainer
{
	void getTraining(String name,int experience);
	
}

class InstanceMethod
{
	public void getTraining(String name,int experinece)
	{
		System.out.println("Trainer name is :"+name+" having "+experinece+" years of experience");
		
	}
}
public class InstanceMethodRefDemo 
{
	public static void main(String[] args) 
	{
	//Using lambda expression
	Trainer t1=(name,exp)->System.out.println("Trainer name is :"+name+" having "+exp+" years of experience");	
    t1.getTraining("Rajan", 8);
    
    //Method Reference
    Trainer t2= new InstanceMethod()::getTraining;
    t2.getTraining("Rahul", 5);
	}

}
