package com.javaprojectpackage;
//program for overriding...
class Teacher//final class Teacher//it is not possible means the class cannot allow inheritance
{
	final int RESULT=449; 
	private int mark;
	public Teacher()
	{
		System.out.println("teacher class constructor");
	}
	public Teacher(int mark)
	{
		this.mark=mark;
	}
	public void display()
	{
		System.out.println("mark="+mark);
		System.out.println("teacher method display");
	}
}
class Student extends Teacher
{
	public Student()
	{
		System.out.println("Student class constructor");
	}
	public Student(int mark)
	{
		super(mark);
		System.out.println(mark);
		System.out.println("other statements are after super class performance");
		//int RESULT=RESULT+51;//this is fixed one 
	}
	public void display()
	{
		System.out.println("child method display");
		
		super.display();
	}
	
}

public class OverriddenConcept  
{
public static void main(String[] args) 
{
		
		//Teacher t=new Teacher();
		//Student s1=new Student();
		Student s2=new Student(100);
		s2.display();
}
}
