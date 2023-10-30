package com.sunbeam;

public class DescStack {
	int top;
	int arr[];
	final int SIZE;

	public DescStack(int size) 
	{
		this.SIZE = size;
		arr = new int[SIZE];
		top = SIZE;
	}

	public void push(int data) 
	{
		top--;
		arr[top] = data;
	}

	public int pop() 
	{
		int data = arr[top];
		top++;
		return data;
	}

	public int peek() 
	{
		return arr[top];
	}

	public boolean isEmpty() 
	{
		return top == SIZE;
	}

	public boolean isFull() 
	{
		return top == 0;
	}
}
