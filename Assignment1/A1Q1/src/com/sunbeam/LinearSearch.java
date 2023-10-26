
//	1. Write a program to print no of comparisions done to search a key in
//		i. linear search

package com.sunbeam;

import java.util.Scanner;

public class LinearSearch {
	
	public static int linearSearchComparisoins(int arr[] ,int key)
	{
		int count=0;
		int cbreak=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(key == arr[i])
			{
				cbreak=1;
				System.out.println("key found at index : " + i);
			}
			count++;
			if(cbreak==1)
				break;
		}
		return count;
	}

	public static void main(String[] args) {
		
		int arr[]= {11,22,33,44,55,66};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the kaey to search");
		int key= sc.nextInt();
		
		int comprasionCount= linearSearchComparisoins(arr,key);
		System.out.println("comparisions done are : " +comprasionCount);
		sc.close();
	}

}
