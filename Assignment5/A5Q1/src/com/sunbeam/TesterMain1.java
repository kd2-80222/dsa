package com.sunbeam;

public class TesterMain1 {
	
	public static void main(String[] args) {
		List list= new List();
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		
		list.display();
		
		list.addPosition(50, 2);
		list.display();
		
		list.deletePosition(3);
		list.display();
	}

}
