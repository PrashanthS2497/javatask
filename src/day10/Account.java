package day10;

import java.util.Scanner;

public class Account {
	{
		  //double balance=10000.00;
		  int bal;
		  int amount;
		  public Account() 
		  {
			 System.out.println("Account balance calculation");
			  
		  }
		  public Account(int num1,int num2) 
		  {
			  bal=num1;
			  amount=num2;
		  }
		  public void withdraw() 
		  {
			  bal = bal-amount;
			  System.out.println("Balance after withdraw " + bal);
		  }
		  
		  public void deposit(int num3) 
		  {
			  amount=num3;
			  bal = bal+amount;
			  System.out.println("Balance after deposit " + bal);
		  }
		  public static void main(String args[])
		  {
			  Account obj=new Account();
			  
			  Scanner sc=new Scanner(System.in);
			  System.out.println("Enter the balance amount: ");
			  int num1=sc.nextInt();
			  System.out.println("Enter the amount to withdraw");
			  int num2=sc.nextInt();
			  Account obj1= new Account(num1,num2);
			  obj1.withdraw();
			  System.out.println("Enter the amount to deposit");
			  int num3=sc.nextInt();
			  obj1.deposit(num3);
			  
			  
		  }
		
}
