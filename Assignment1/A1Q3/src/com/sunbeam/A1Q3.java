package com.sunbeam;

import java.util.Scanner;

public class A1Q3 {
	public static int BinarySearchComparisoins(int arr[],int key)
	{
		int size=arr.length;
		int left=0;
		int right=size-1;
		int count=0;
		int cbreak=0;
			while(left <= right)
			{
				int mid=(left+right)/2;
				count++;
				if(key == arr[mid])
				{	cbreak=1; 
				//System.out.println("number of comparisions : "+count);
					return mid;
				}
				else if (key < arr[mid]) 
					 left=mid+1;
				else
					right=mid-1;
				if(cbreak ==1)
					break;
			}
			

			return -1;
		
	}
	
	public static void main(String[] args) {
		int arr[]= {66,55,44,33,22,11};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the kaey to search");
		int key= sc.nextInt();
		
		int index=BinarySearchComparisoins(arr,key);
		System.out.println(" key is at : " +index);
	}

}
