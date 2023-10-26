package com.sunbeam;

import java.util.Scanner;

public class TesterMain {
	
	public static void searchEMployeeid(Employee[] arr , Employee e)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			if(e.getEmpid() ==	arr[i].getEmpid())
				System.out.println("Employee found at index : " +i+" with id " +e.getEmpid());
			
		}
		
	}
	public static void searchEMployeename(Employee[] arr , Employee e1)
	{
		for (int i = 0; i < arr.length; i++) 
		{
		int diff=(e1.getName()).compareTo(arr[i].getName());
		if(diff==0)		
		System.out.println("Employee found at index : " +i +" with name " +e1.getName());
			
		}
		
	}
	public static void searchEMployeesalary(Employee[] arr , Employee e2)
	{
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(e2.getSalary() ==	arr[i].getSalary())
				System.out.println("Employee found at index : " +i+" with salary" +e2.getSalary());
			
		}
		
	}

	public static void main(String[] args) {
		
		Employee[] arr = new Employee[5];
		arr[0]= new Employee(1,"e1",1000000);
		arr[1]= new Employee(2,"e2",100000);
		arr[2]= new Employee(3,"e3",10000);
		arr[3]= new Employee(4,"e4",1000);
		arr[4]= new Employee(5,"e5",10000);
		int choice;
		do {
			System.out.println("0.exit");
			System.out.println("1.search by employee id");
			System.out.println("2.search by employee name");
			System.out.println("3.search by employee salary");
			System.out.println("Enter your choice");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter employee id to search");
				int id= sc.nextInt();
				Employee e= new Employee();
				e.setEmpid(id);
				searchEMployeeid(arr, e);
				break;
			case 2:
				System.out.println("Enter employee name to search");
				String name= sc.next();
				Employee e1= new Employee();
				e1.setName(name);
				searchEMployeename(arr, e1);
				break;
			case 3:
				System.out.println("Enter employee salary to search");
				double salary= sc.nextDouble();
				Employee e2= new Employee();
				e2.setSalary(salary);
				searchEMployeesalary(arr, e2);
				break;
			default:
				break;
			}
			
		} while (choice !=0);
		
	}

}
