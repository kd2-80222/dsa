
//6. Sort singly linear list using bubble sort.

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
	
	public void BubbleSortLinkedList()
	{
		Node trav=head;
		Node tempnode=null;
		if(head==null)
			return;
		else
		{
			while(trav.next!=null)
			{
				tempnode=trav.next;
				while(tempnode!=null)
				{

					if(trav.data > tempnode.data)
					{
						int temp=trav.data;
						trav.data=tempnode.data;
						tempnode.data=temp;
					}
					tempnode=tempnode.next;
				}
				trav=trav.next;
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
