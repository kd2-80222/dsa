package com.sunbeam;

public class List {
	
	public class Node
	{
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
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void addFirst(int data)
	{
		Node newnode=new Node(data);
		if(isEmpty())	//check if list is empty
		{
			head=newnode;
			head.next=newnode;
			head.prev=newnode;
		}
		else				// if list is not empty
		{
			newnode.next=head;
			newnode.prev=head.prev;
			head.prev.next=newnode;
			head.prev=newnode;
			head=newnode;
		}
		
	}
	
	
	public void deleteFirst() {
		if(isEmpty())
			return;
		else if(head.next == head)
			head = null;
		else {
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head = head.next;
		}
	}
	
	int getData()
	{
		return head.data;
	}
	

}

