
//5. In singly linear list implement following operations.
//	i. insert a new node after a given node
//	ii. insert a new node before a given node
package com.sunbeam;
public class NodeAfterNode {
	
	public class Node
	{
		private int data;
		private Node next;
		
		public Node(int data) 
		{
			this.data=data;
			next= null;
		}
	}
	
	private Node head;
	
	
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
	
	
	public void insertNodeAfterNode(int position,int data)
	{
		Node newnode = new Node(data);
		Node trav=head;
		if(position < 1)
		{	
			addFirst(data);
			return;
		}
		
		for(int i=1;i<position;i++)
		{
			trav=trav.next;
		}
		newnode.next=trav.next;
		trav.next=newnode;
		
		
	}
	
	public void insertNodeBeforeNode(int position,int data)
	{
		Node newnode= new Node(data);
		Node trav=head;
		if(position < 1)
		{	
			addFirst(data);
			return;
		}
		for(int i=1;i<position-1;i++)
		{
			trav=trav.next;
		}
		newnode.next=trav.next;
		trav.next=newnode;
		
	}

}
