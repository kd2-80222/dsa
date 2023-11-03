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
	
	public LinkedList reverseList()
	{
		LinkedList list1=new LinkedList();
		Stack stack =new Stack(10);
		Node trav=head;
		while(trav != null)
		{
			//if(stack.isEmpty())
			stack.push(trav.data);
		}
		while(!stack.isEmpty())
		{
			int data=stack.pop();
			
			list1.addLast(data);
		}
		return list1;
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
