//3. Implement quick sort to sort array in descending order.

package com.sunbeam;

import java.util.Arrays;

public class QuickSortMain
{
	
	public static void quicksort(int arr[], int left, int right)
	{
		if(left >= right)
			return;
		int i=left;
		int j=right;
		while(i<j)
		{
			for( ; i <= right && arr[i] >= arr[left] ;i++);
			for( ;arr[j] < arr[left] ; j--);
			if(i<j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[j];
		arr[j]=arr[left];
		arr[left]=temp;
		
		quicksort(arr, left, j-1);
		quicksort(arr, j+1, right);
	}
	
	public static void main(String[] args) {
		int arr[]= {66,33,99,11,77,22,55,66,88};
		System.out.println("Before sort : " + Arrays.toString(arr));
		quicksort(arr,0,arr.length-1);
		System.out.println("After sort in descending order: " + Arrays.toString(arr));
	}
}
