package com.sunbeam;

import java.util.Scanner;

public class TesterMain5 {
	public static void main(String[] args) {
		NodeAfterNode list = new NodeAfterNode();
		list.addFirst(10);
		list.display();
		list.addFirst(20);
		list.display();
		list.addFirst(30);
		list.display();
		list.addFirst(40);
		list.display();
		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter node after you want to insert node : " );
//		int key=sc.nextInt();
		
		list.insertNodeAfterNode(3,1000);
		list.insertNodeBeforeNode(3,2000);
		list.display();
		sc.close();
	}
}
