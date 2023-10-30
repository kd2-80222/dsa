package com.sunbeam;

public class LinkedListMiddleNode {
	
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
	public LinkedListMiddleNode() 
	{
		head=null;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void addFirst(int data)
	{
		Node newnode = new Node( data);
		if(isEmpty())
			head=newnode;
		else
		{
			newnode.next=head;
			head=newnode;
		}
	}
	public void displayList() {
		Node trav = head;
		System.out.print("List :");
		while(trav != null) {
			System.out.print("  " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
	
	public void middleNode()
	{
		Node t1=head;
		Node t2=head;
		
		while(t2 != null && t2.next != null  )
		{
			t2=t2.next.next;
			t1= t1.next;
		}
		
		System.out.println("Middle node data : " + t1.data);
	}

}
