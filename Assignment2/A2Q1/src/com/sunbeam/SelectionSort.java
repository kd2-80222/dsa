//1. Write a selection sort function to sort array and returns no of comparisions.

package com.sunbeam;
import java.util.Arrays;
public class SelectionSort {
	
	public static void SelectionSortCount(int arr[])
	{
		int passes=0;
		int count=0;
		int N = arr.length;
		for (int i = 0; i < N-1; i++) 
		{
			passes++;
			for (int j = i+1; j < N; j++) 
			{
				count++;
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Passes : " +passes);
		System.out.println("Comprasions are : " +count);
	}
	
	public static void main(String[] args) {
		int arr[]= {44,11,55,22,66,33};
		SelectionSortCount(arr);
		System.out.println("Sorted Array : " +Arrays.toString(arr));
	}

}
