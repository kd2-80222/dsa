package com.sunbeam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BSTree {
	
	public class Node
	{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int data) {
			this.data=data;
			left=null;
			right=null;
		}
	}
	
	private Node root;
	public BSTree() {
		root=null;
	}
	
	public boolean isEmpty()
	{
		return root==null;
	}
	
	// 1.Add Node
	public void addNode(int data)
	{
		Node newnode=new Node(data);
		
		if(isEmpty())
			root=newnode;
		else
		{
			Node trav=root;
			while(true)
			{
			if(data < trav.data)
			{
				if(trav.left==null)
					{
						trav.left=newnode;
						break;
					}
				else
					trav=trav.left;
			}
			else
			{
				if(trav.right==null)
					{
						trav.right=newnode;
						break;
					}
				else
					trav=trav.right;
			}
			}
		}
	}
	
	// 2.Pre-Order
	public void preOrder(Node trav)
	{
		if(trav==null)
			return;
		System.out.print("  " + trav.data);
		preOrder(trav.left);
		preOrder(trav.right);
	}
	public void preOrder()
	{
		System.out.print("Pre-Order Traversal : ");
		preOrder(root);
	}
	
	// 3.In-Order
	public void inOrder(Node trav)
	{
		if(trav==null)
			return;
		inOrder(trav.left);
		System.out.print("  " + trav.data );
		inOrder(trav.right);
	}
	public void inOrder()
	{
		System.out.print("In-Order traversal");
		inOrder(root);
	}
	
	// 4.Post-Order 
	public void postOrder(Node trav)
	{
		if(trav==null)
			return;
		postOrder(trav.left);
		postOrder(trav.right);
		System.out.print("  " + trav.data);
	}
	public void postOrder()
	{
		System.out.print("Post-Order Traversal");
		postOrder(root);
	}
	
	// 5.DFS traversal
	public void DFSTraversal()
	{
		Stack<Node> st= new Stack<>();
		st.push(root);
		while(!st.isEmpty())
		{
			Node trav=st.pop();
			System.out.print(" " + trav.data);
			if(trav.right != null)
				st.push(trav.right);
			if(trav.left != null)
				st.push(trav.left);
		}
	}
	
	// 6.BFS Traversal
	public void BFSTraversal()
	{
		Queue<Node> q=new LinkedList<>();
		q.offer(root);
		while(! q.isEmpty())
		{
			Node trav=q.poll();
			System.out.print(" " + trav.data);
			if(trav.right != null)
				q.offer(trav.right);
			if(trav.left != null)
				q.offer(trav.left);
		}
	}
	
	public Node binarySearch(int key)
	{
		Node trav= root;
		while(trav != null)
		{
			if(key==trav.data)
				return trav;
			else if(key < trav.data)
				trav=trav.left;
			else
				trav=trav.right;
		}
		return null;
	}
	
}











