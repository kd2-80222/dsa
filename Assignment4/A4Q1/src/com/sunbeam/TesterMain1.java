package com.sunbeam;

public class TesterMain1 {
	
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addFirst(10);
		list.display();
		list.addFirst(20);
		list.display();
		list.addLast(30);
		list.addLast(40);
		list.display();
		list.deleteFirst();
		list.display();
		
		list.deleteLast();
		list.display();
	
	}

}
