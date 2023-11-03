package com.sunbeam;

import java.util.Scanner;

public class ParentOfNodeMain {
	public static void main(String[] args) {
		BSTtree bst = new BSTtree();
		bst.addNode(1);
		bst.addNode(3);
		bst.addNode(4);
		bst.addNode(6);
		bst.addNode(7);
		bst.addNode(8);
		bst.addNode(10);
		bst.addNode(13);
		bst.addNode(14);
		
		
		bst.inOrder();
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter node valuse ehose parent is to be search");
		int node=sc.nextInt();
		int parent=bst.parent(node);
		System.out.println("Parent is : " + parent);
	}
}
