package day10;

import java.util.Scanner;

public class Employee {int id;
String firstName;
String lastName;
int salary;

Employee(int n1,String fn, String ln, int sal)
{
	id=n1;
	firstName=fn;
	lastName=ln;
	salary=sal;
}

public int getId() {
	System.out.println("ID is " + id);
	return id;
}
public String getFirstName() {
	System.out.println("First Name is " +firstName );
	return firstName;
}
public String getLastName() {
	System.out.println("Last Name is " + lastName);
	return lastName;
}
public String getName() {
	String str=firstName+lastName;
	System.out.println("Name is " +str);
	return str;
}
public int getSalary() {
	System.out.println("Salary is " +salary);
	return salary;
}
public void setSalary(int num1) {
	salary=num1;
	System.out.println("Updated salary is "+ salary);
}
public int annualSalary() {
	salary=salary*12;
	System.out.println("Annual salary is  " + salary);
	return salary;
}
public int raiseSalary(int percent) {
	int per=percent;
	salary=salary*per/100;
	System.out.println("Raised salary is " + salary);
	return salary;
}
public String toString() {
	//String str1="Employee[id=+id , name=+str,salary=+salary]";
	String str1="Employee[id=" +  id + ", name = " + firstName + lastName + ", salary = " + salary + "]";
	System.out.println(str1);
	return str1;
}

public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id ");
	int n1=sc.nextInt();
	System.out.println("Enter first name ");
	String fn=sc.next();
	System.out.println("Enter last name ");
	String ln=sc.next();
	System.out.println("Enter salary ");
	int sal=sc.nextInt();
	Employee obj=new Employee(n1,fn,ln,sal);
	obj.getId();
	obj.getFirstName();
	obj.getLastName();
	obj.getName();
	obj.getSalary();
	System.out.println("Enter salary to set salary ");
	int sal1=sc.nextInt();
	obj.setSalary(sal1);
	obj.annualSalary();
	System.out.println("Enter the percent to raise the salary ");
	int percent=sc.nextInt();
	obj.raiseSalary(percent);
	obj.toString();
}
}

