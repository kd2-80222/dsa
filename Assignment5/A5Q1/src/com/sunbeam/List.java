
//1. Implement add and delete at position in doubly 
//		circular linked list.


package com.sunbeam;

import java.util.Iterator;

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
	
	public void addPosition(int data, int position)
	{
		Node newnode=new Node(data);
		
		if(isEmpty())
		{
			head=newnode;
			head.next=newnode;
			head.prev=newnode;
		}
		else if(position==1)//want to add at 1st position
		{
			addFirst(data);
		}
		else	// add inbetween
		{
			Node trav=head;
			for (int i = 1; i < position-1; i++) 
				trav=trav.next;
			newnode.next=trav.next;
			newnode.prev=trav;
			trav.next=newnode;
			
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
	
	public void deletePosition( int position)
	{
		if(isEmpty())
			System.out.println("List is empty");
		else if(position==1)
			deleteFirst();
		else if(head.next==head)
			head=null;
		else
		{
			Node trav=head;
			for (int i = 1; i < position; i++) 
				trav=trav.next;
			trav.prev.next=trav.next;
			trav.next.prev=trav.prev;
			
		}
	}
	
	public void display()
	{
		if(isEmpty())
			return;
		Node trav=head;
		System.out.println("List data : " );
		do 
		{
			System.out.print("  " +trav.data);
			trav=trav.next;
		} while (trav != head);
		System.out.println(" ");
	}

}
