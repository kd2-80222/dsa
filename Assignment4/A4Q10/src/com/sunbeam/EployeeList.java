package com.sunbeam;

public class EployeeList {
	public class Employee {
        int empid;
        String empName;
        double salary;
        Employee next;

        Employee(int empid,String empName,double salary)
        {
        	this.empid=empid;
        	this.empName=empName;
        	this.salary=salary;
        }
    }

    private Employee head;
    private Employee tail;

    public EployeeList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
    
    public void addEmployee(int empid,String empName,double salary)
    {
    	Employee newEmp=new Employee(empid,empName,salary);
    	if(isEmpty())
    	{
    		head=newEmp;
    	}
    	else
    	{
    		Employee trav=head;
    		while(trav.next!=null)
    		{
    			trav=trav.next;
    		}
    		trav.next=newEmp;
    	}
    	System.out.println("Employee added successfully..");
    }
    
    public Employee searchEmployee(String empName)
    {
    	Employee trav=head;
    	while(trav!=null)
    	{
    		if(trav.empName.equals(empName))
    		{
    			return trav;
    		}
    		trav=trav.next;
    	}
    	return null;
    }
    
    public void deleteEmployee(int empid)
    {
    	if(isEmpty())
    	{
    		System.out.println("Employee list is ");
    		return;
    	}
    	if(head.empid==empid)
    	{
    		head=head.next;
    		System.out.println("Employee with id"+empid+"deleted succesfully..");
    		return;
    	}
    	Employee trav=head;
    	while(trav.next!=null)
    	{
    		if(trav.next.empid==empid)
    		{
    			trav.next=trav.next.next;
    			System.out.println("Employee with id "+empid+"deleted successfully..");
    			return;
    		}
    		trav=trav.next;
    	}
    	System.out.println("Employee with id"+empid+"not found..");
    }
    
    public void updateSalary(int empid,double newSalary)
    {
    	Employee trav=head;
    	while(trav!=null)
    	{
    		if(trav.empid==empid)
    		{
    			trav.salary=newSalary;
    			System.out.println("Salary updated for employee with Id"+empid);
    			return;
    		}
    		trav=trav.next;
    	}
    	System.out.println("Employee with id " +empid+"not found..");
    }
    
    public void displayEmployee()
    {
    	Employee trav=head;
    	System.out.println("Employee List : ");
    	while(trav!=null)
    	{
    		System.out.println("Employee Id :"+trav.empid);
    		System.out.println("Employee Name : "+trav.empName);
    		System.out.println("Salary : "+trav.salary);
    		System.out.println();
    		trav=trav.next;
    	}
    }
}
