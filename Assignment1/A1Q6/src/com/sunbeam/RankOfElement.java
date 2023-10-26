package com.sunbeam;

import java.util.Scanner;

public class RankOfElement {
	
	public static void ElementRank(int arr[], int e)
	{
		int count=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(e >= arr[i])
			{
				count++;
			}
		}
		System.out.println("rank of " + "is " + count);
	}
	
	public static void main(String[] args) {
		
		int arr[]= {10,20,15,3,4,4,1};
		System.out.println("Enter element to find its rank");
		Scanner sc= new Scanner(System.in);
		int e= sc.nextInt();
		ElementRank(arr, e);
		
	}
}
