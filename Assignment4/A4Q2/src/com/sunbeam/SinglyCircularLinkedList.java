package com.sunbeam;

public class SinglyCircularLinkedList {

	public class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	private Node tail;

	SinglyCircularLinkedList() {
		tail = null;
	}

	public boolean isEmpty() {
		return tail == null;
	}

	public void addFirst(int data) {
		Node newnode = new Node(data);
		if (isEmpty())
		{	tail = newnode;
			newnode.next=newnode; //self refrencing
		}
		else 
		{
			newnode.next = tail.next;
			tail.next = newnode;
		}
	}
	
	public void addLast(int data)
	{
		Node newnode = new Node(data);
		if(isEmpty())
		{	
			tail=newnode;
			newnode.next=newnode;
		}
		else
		{
			newnode.next=tail.next;
			tail.next=newnode;
			tail=newnode;
		}
		
	}
	
	public void deleteFirst()
	{
		if(isEmpty())
			System.out.println("List is empty");
		else
		{
			tail.next=tail.next.next;
		}
	}
	
	public void deleteLast()
	{
		if(isEmpty())
			System.out.println("List is empty");
		else
		{
			Node trav = tail;
			do {
				trav=trav.next;
				
			} while (trav.next != tail);
			System.out.println("trav at : " +trav.data);
			trav.next=tail.next;
			tail=trav;
		}
	}

	public void display() {
		if (isEmpty())
			return;
		else {
			Node trav = tail;
			do {
				System.out.print(" " + trav.data);
				trav = trav.next;
			} while (trav != tail);
		}
	}

}
