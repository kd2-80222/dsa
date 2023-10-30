package com.sunbeam;

import java.util.Arrays;

public class BubbleSortCount {
	
	public static void BubbleSort(int arr[])
	{
		int flag;
		int passes=0;
		int count=0;
		int N=arr.length;
		for (int i = 1; i < N; i++) 
		{
			flag=0;
			passes++;
			
			for (int j = 0; j < N-i; j++) 
			{
				count++;
				flag=1;
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(flag==0)
				break;
		}
		
		System.out.println("Count : " + count);
		System.out.println("Passes : " +passes);
	}
	
	public static void main(String[] args) {
		int arr[]= {33,22,66,55,44,11};
		//int arr[]= {11,22,33,44,55,66};
		BubbleSort(arr);
		System.out.println("Sorted Array : " +Arrays.toString(arr));

	}

}


