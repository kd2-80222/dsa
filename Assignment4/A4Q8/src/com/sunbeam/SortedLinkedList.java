
//8. Write a function which will insert values in 
// sorted order into linked list.

package com.sunbeam;

public class SortedLinkedList {
	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		list.SortedInsert(2);
		list.SortedInsert(6);
		list.SortedInsert(4);
		list.SortedInsert(3);
		list.SortedInsert(8);
		list.display();
	}
}
