package com.sunbeam;

public class SinglyLinkedList {
	// Inner class
	public class Node
	{
		private int data;
		private Node next;
		
		public Node( int data) {
			this.data=data;
			next=null;
		}
		
	}
	
	
	private Node head;
	private Node tail;
	
	public SinglyLinkedList() {
		head=null;
		tail=null;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public void addFirst(int data)
	{
		Node newnode = new Node(data);
		if(isEmpty())
			tail=head=newnode;
		else 
		{
			newnode.next=head;
			head=newnode;
		}
	}
	public void addLast(int data)
	{
		Node newnode = new Node(data);
		if(isEmpty())
		{
			tail=head=newnode;
		}
		else
		{
			tail.next=newnode;
			tail=newnode;
		}
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
	
	public void deleteFirst()
	{
		if(isEmpty())
		{	
			System.out.println("List is empty");
			return;
		}
		else
		{
			head=head.next;
		}
	}
	
	public void deleteLast()
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
		}
		// if list have single element
		else if(head == tail)
			head=tail=null;
		else
		{
			Node trav = head;
			while(trav.next.next != null)
				trav=trav.next;
			trav.next=null;
			tail=trav;
		}
	}

}
