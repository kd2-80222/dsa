package com.sunbeam;

// Doubly Linear Linked List

public class List {
	
	public class Node{
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int data) 
		{
			this.data=data;
			next=null;
			prev=null;
		}
	}
	
	private Node head;
	
	public List() 
	{
		head=null;
	}
	

}
