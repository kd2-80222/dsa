package com.sunbeam;

import java.util.Scanner;

public class TesterMain {
	public static void main(String[] args) {
		
		BSTree bst = new BSTree();
		int choice;
		do 
		{
			System.out.println("0.Exit");
			System.out.println("1.Add Node");
			System.out.println("2.Pre-Oredr");
			System.out.println("3.In-Oredr");
			System.out.println("4.Post-Oredr");
			System.out.println("5.DFS Traversal");
			System.out.println("6.BFS Traversal");
			System.out.println("7.Search key");
			System.out.println("8.Delete Node");
			System.out.println("9.Height");
			System.out.println("Enter your choice : ");
			Scanner sc= new Scanner(System.in);
			choice= sc.nextInt();
			switch (choice) 
			{
			case 1:	// ADD NODE
				System.out.println("Enter node value : ");
				int data=sc.nextInt();
				bst.addNode(data);
				System.out.println("Congratulations Node added.");
				break;
			case 2:
				bst.preOrder();
				System.out.println("");
				break;
			case 3:
				bst.inOrder();
				System.out.println("");
				break;
			case 4:
				bst.postOrder();
				System.out.println("");
				break;
			case 5:
				System.out.print("DFS traversal : ");
				bst.DFSTraversal();
				break;
			case 6:
				System.out.println("BFS Traversal");
				bst.BFSTraversal();
				break;
			case 7:
				int key;
				System.out.println("Enter key to search:");
				key=sc.nextInt();
				BSTree.Node result=bst.binarySearch(key);
				if(result==null)
					System.out.println("key not in the tree");
				else
					System.out.println("key is present in tree");
				break;
			case 8:
				break;
			default:
				break;
			}
			
		} while (choice !=0);
	}
}
