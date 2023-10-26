
//5. find the first non-repeating element:
//	Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 }
//	Ouput: 3

package com.sunbeam;

public class FirstNonRepeatingElement {
	
	public static void NonRepeatingElement(int arr[])
	{
		
		int cbreak=0;
		for (int i = 0; i < arr.length; i++) 
		{
			int count=0;
			int pivote =arr[i];
			for (int j = i+1; j < arr.length; j++) 
			{
				if(pivote == arr[j])
				{	count++;
				    break;
				}
			}
			if(count ==0) 
			{
				System.out.println("First non-repeating number is : "+pivote);
				break;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,-1,2,1,0,4,-1,7,8};
		NonRepeatingElement(arr);

	}

}
