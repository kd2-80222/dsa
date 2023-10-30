package com.sunbeam;



public class ReverseLinkedList {
	
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
	public ReverseLinkedList() 
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
			head = newnode;
		else {
			newnode.next = head;
			head = newnode;
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
	
	public void reverseLinkedList()
	{
		Node current=head;
		Node previous = null;
		while(current != null)
		{
			Node temp= current.next;
			current.next=previous;
			previous=current;
			current = temp;
		}
		//return previous;
	}
	

}
