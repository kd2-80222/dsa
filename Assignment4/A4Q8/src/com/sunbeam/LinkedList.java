package com.sunbeam;

import com.sunbeam.LinkedList.Node;

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
//	public void addFirst(int data)
//	{
//		
//		Node newnode = new Node(data);
//		if(isEmpty())
//			head=newnode;
//		else 
//		{
//			newnode.next=head;
//			head=newnode;
//		}
//	}
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
	public void SortedInsert(int data)
	{
		
		Node newnode = new Node(data);
		Node trav=head;
		if(head == null || head.data > newnode.data)
		{	newnode.next=head;
			head=newnode;
		}
		
		else
		{
			//Node trav=head;
			
			while(trav.next!= null && trav.next.data <newnode.data)
				trav=newnode;
			
			newnode.next=trav.next;
			trav.next=newnode;
			
			
			if(trav.next==null)
			{
				addLast(data);
			}
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
}
