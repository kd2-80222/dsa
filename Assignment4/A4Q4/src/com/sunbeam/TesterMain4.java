package com.sunbeam;

public class TesterMain4 {
	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.addFirst(50);
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		
		list.display();
		
		ReverseLinkedList list2 = new ReverseLinkedList();

		list2.reverseLinkedList();
		list2.display();
		
	}
}
