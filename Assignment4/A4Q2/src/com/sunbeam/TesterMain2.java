package com.sunbeam;

public class TesterMain2 {

	public static void main(String[] args) {
		
		SinglyCircularLinkedList list = new SinglyCircularLinkedList();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		list.addLast(50);
		list.addLast(60);
		list.display();
		list.deleteFirst();
		System.out.println("");
		list.display();
		System.out.println("");
		list.deleteLast();
		list.display();
	}
}
