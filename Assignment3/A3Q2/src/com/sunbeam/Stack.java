package com.sunbeam;

public class Stack {
	
	private int arr[];
	private int top;
	private final int SIZE;
	
	public Stack(int size) 
	{
		SIZE=size;
		arr=new int[SIZE];
		top=-1;
	}
	
	public void push(int data)
	{
		top++;
		arr[top]=data;
	}
	
	public int pop()
	{
		int data=arr[top];
		top--;
		
		return data;
	}
	
	public int peek()
	{
		return arr[top];
	}
	
	public boolean isFull()
	{
		return top==SIZE-1;
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	
//	public int maxElement()
//	{
//		int max=0;
//		for(int i=0; i<SIZE ;i++)
//		{
//			 max=arr[top];
//			int data=pop();
//			if(data > max)
//				max=data;
//			else 
//				max=max;
//		}
//		return max;
//	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}
	
	
}











