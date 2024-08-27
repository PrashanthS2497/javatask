package day10;

import java.util.Scanner;

public class Circle {
	int radius;
	double pi;
	double circum;
	//Cons 1
	public Circle() 
	{
		System.out.println("Circumference calculation");
	}
	//cons 2
	public Circle(int num2, double num3) 
	{
		radius=num2;
		pi=num3;
	}
	//method
	public void circumference()
	{
		circum=2*pi*radius;
		System.out.println("Circumference is " + circum);
	}
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		Circle obj=new Circle();
		System.out.println("Enter the radius ");
		int num2=sc.nextInt();
		System.out.println("Enter the pi value ");
		double num3=sc.nextDouble();
		Circle obj1=new Circle(num2,num3);
		obj1.circumference();
	}
}
