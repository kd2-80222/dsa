
//6. Sort singly linear list using bubble sort.

package com.sunbeam;

public class SortLinkList {
	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		list.addFirst(30);
		list.addFirst(70);
		list.addFirst(40);
		list.addFirst(90);
		System.out.println("LinkedList before sort");
		list.display();
		System.out.println("LinkedList after sort");
		list.BubbleSortLinkedList();
		list.display();
		
	}
	
}
