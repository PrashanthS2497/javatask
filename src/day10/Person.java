package day10;

import java.util.Scanner;

public class Person {
	String name;
	 int age;
	
	Person(int ag, String nam)
	{	
		age=ag;
		name=nam;
	}
	 
	public void getName() 
	{
		System.out.println("Name is: " +name);
	}
	
	public void getAge() 
	{
		System.out.println("Age is: "+ age);	
	}
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name: ");
		String nam=sc.next();
		System.out.println("Enter the age: ");
		int ag=sc.nextInt();
		Person obj=new Person(ag, nam);
		obj.getName();
		obj.getAge();
