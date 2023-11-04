package com.sunbeam;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		EployeeList employee=new EployeeList();
		Scanner scanner=new Scanner(System.in);
		int choice;
		do 
		{
			System.out.println("--------Employee Management System ------");
			System.out.println("1.Add Employee");
			System.out.println("2.Display Employee");
			System.out.println("3.Search Employee by name");
			System.out.println("4.Delete Employee by empid");
			System.out.println("5.Update salary of employee");
			System.out.println("Enter your choice ");
			choice=scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter the Employee Id :");
				int empid=scanner.nextInt();
				System.out.println("Enter Employee Name :");
				String empname=scanner.next();
				System.out.println("Enter Employee Salary :");
				double salary=scanner.nextDouble();
				employee.addEmployee(empid, empname, salary);
				break;
			case 2:
				employee.displayEmployee();
				break;
			case 3:
				System.out.println("Enter the employee name to search : ");
				empname=scanner.next();
				EployeeList.Employee searchEmployee=employee.searchEmployee(empname);
				if (searchEmployee != null)
				{
	                System.out.println("Employee found:");
	                System.out.println("Employee ID: " + searchEmployee.empid);
	                System.out.println("Employee Name: " + searchEmployee.empName);
	                System.out.println("Salary: " + searchEmployee.salary);
	            } 
				else 
	            {
	                System.out.println("Employee not found.");
	            }
	            break;
	        case 4:
	            System.out.print("Enter the Employee ID to delete: ");
	            empid = scanner.nextInt();
	            employee.deleteEmployee(empid);
	            break;
	        case 5:
	            System.out.print("Enter the Employee ID to update salary: ");
	            empid = scanner.nextInt();
	            System.out.print("Enter the new Salary: ");
	            double newSalary = scanner.nextDouble();
	            employee.updateSalary(empid, newSalary);
	            break;
	        case 6:
	            System.out.println("Exiting Employee Management System.");
	            break;
	        default:
	            System.out.println("Invalid choice. Please try again.");
	            break;
	    }
	} while (choice != 0);

	scanner.close();
	}
}
