package com.sunbeam;



public class LinkedList {
	public class Node
	{
		private int data;
		private Node next;
		
		public Node(int data) 
		{
			this.data=data;
			next=null;
		}
	}
	
	private Node head;
	public LinkedList() 
	{
		head=null;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	public void addFirst(int data)
	{
		Node newnode = new Node(data);
		if(isEmpty())
			head=newnode;
		else 
		{
			newnode.next=head;
			head=newnode;
		}
	}
	public void addLast(int value) {
		Node newnode = new Node(value);
		if(isEmpty())
			head = newnode;
		else {
			Node trav = head;
			while(trav.next != null)
				trav = trav.next;
			trav.next = newnode;
		}
	}
	
	public void MinMaxNode()
	{
		Node trav=head;
		int max=trav.data;
		while(trav != null)
		{
			if(trav.data >= max )
				max=trav.data;
			trav=trav.next;
			
		}
		Node trav1=head;
		int min=trav1.data;
		while(trav1!= null)
		{
			if(trav1.data <= min )
				min=trav1.data;
			trav1=trav1.next;
			
		}
		
		System.out.println("Max : " + max);
		System.out.println("Min : " + min);
	}
	
	
	
	public void display()
	{
		Node trav=head;
		System.out.print("List");
		while(trav != null)
		{
			System.out.print("  " + trav.data);
			trav=trav.next;
		}
		System.out.println("");
	}
}
