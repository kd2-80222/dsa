

//5. Create an array of integers. Reverse the array using stack

package com.sunbeam;

import java.util.Arrays;

public class StackMain5 {
	public static void main(String[] args) {
		
		Stack sc= new Stack(10);
		
		int arr[]= {5,3,8,2,9,1};
		for(int i=0;i<arr.length;i++)
		{
			sc.push(arr[i]);
		}
		System.out.println("Original array : " +Arrays.toString(arr));
		
		for(int i=0 ; i<arr.length; i++)
		{
			arr[i] = sc.peek();
			sc.pop();
			
		}
		
		System.out.println("Reverse array : " +Arrays.toString(arr));
		
	}
}
