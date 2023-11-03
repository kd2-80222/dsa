package com.sunbeam;

public class ReverseOrderMian {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.addFirst(90);
		list.addFirst(50);
		list.addFirst(80);
		list.addFirst(10);
		
		list.display();
		
		LinkedList resultlist = list.reverseList();
		resultlist.display();

	}

}
