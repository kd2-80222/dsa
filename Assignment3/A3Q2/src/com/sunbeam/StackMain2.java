
//  2. Insert 5 elements in stack and 
// find maximum value in stack without traversing it.

package com.sunbeam;

public class StackMain2 {
	
	
	
	public static void main(String[] args) {
		Stack sc=new Stack(6);
		Stack temp = new Stack(1);
		
		sc.push(1);
		int max1= sc.peek();
		if(sc.peek() > max1)
			max1=sc.peek();
		sc.push(2);
		int max2= sc.peek();
		if(sc.peek() > max2)
			max2=sc.peek();
		sc.push(3);
		int max3= sc.peek();
		if(sc.peek() > max3)
			max3=sc.peek();
		sc.push(4);
		int max4= sc.peek();
		if(sc.peek() > max4)
			max4=sc.peek();
		sc.push(5);
		int max5= sc.peek();
		if(sc.peek() > max5)
			max5=sc.peek();
		
		
		

	System.out.println("Max element : " +max5);
		
		
	}
	
}
