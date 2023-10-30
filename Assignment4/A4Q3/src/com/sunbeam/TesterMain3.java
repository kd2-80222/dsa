package com.sunbeam;

public class TesterMain3 {
	
	public static void main(String[] args) {
		LinkedListMiddleNode list= new LinkedListMiddleNode();
		
		list.addFirst(50);
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		
		list.displayList();
		
		list.middleNode();
	}

}
