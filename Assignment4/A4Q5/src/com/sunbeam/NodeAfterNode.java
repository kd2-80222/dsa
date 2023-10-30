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
	public NodeAfterNode() 
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
	
	
	public void insertNodeAfterNode(int data)
	{
		
	}
	
	public void insertNodeBeforeNode(int data)
	{
		
	}

}
