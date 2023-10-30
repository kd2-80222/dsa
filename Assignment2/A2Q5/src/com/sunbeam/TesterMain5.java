package com.sunbeam;

import java.util.ArrayList;

public class TesterMain5 {
	
	static void salarySort(ArrayList<Employee> arr, int n) 
	{
		int flag;
		for (int i = 1; i < n; i++) 
		{
			flag = 0;
			for (int j = 0; j < n - i; j++) 
			{
				flag = 1;
				if (arr.get(j).getSalary() > arr.get(j+1).getSalary()) 
				{
					flag = 1;
					
					Employee temp = arr.get(j);
					arr.set(j, arr.get(j+1));
					arr.set(j+1, temp);
					
				}
			}
			if(flag ==0) break;
		}

	}
	
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "e1", 9078653.0));
		list.add(new Employee(2, "e2", 907.0));
		list.add(new Employee(3, "e3", 1078657.0));
		list.add(new Employee(4, "e4", 90.0));
		list.add(new Employee(5, "e5",86.0));
		list.add(new Employee(6, "e6", 9053.0));
		list.add(new Employee(7, "e7", 1233.0));
		System.out.println("Before Sort = ");
		for (Employee employee : list) 
		{
			System.out.println(employee);
		}
		
		salarySort(list, list.size());
		System.out.println("After Sort = ");
		for (Employee employee : list) 
		{
			System.out.println(employee);
		}
	}
}
