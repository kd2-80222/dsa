package com.sunbeam;

import java.util.Scanner;

public class NthOccurance {
	
	public static void OccuranceNth(int arr[], int e, int occurance)
	{
		int count=0;
		int breakc=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(e == arr[i])
				count++;
			if(count== occurance)
			{	System.out.println(occurance +"th occurance is at : " + i);
				break;
			}
			else
				breakc=1;
		}
		if(breakc==1)
			System.out.println("no occurane");
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,-1,2,1,0,4,-1,7,8};
		System.out.println("Enter element");
		Scanner sc= new Scanner(System.in);
		int e= sc.nextInt();
		System.out.println("which occurance : ");
		int occurance=sc.nextInt();
		OccuranceNth(arr,e,occurance);
	}

}
