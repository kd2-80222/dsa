package com.sunbeam;



public class BSTtree {
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
	public BSTtree() {
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
	
	public Node[] printParentOfNode(int key)
	{
		Node parent=null;
		Node trav=root;
		while(trav != null)
		{
			if(key==trav.data)
				break;
			parent=trav;
			if(key < trav.data)
				trav=trav.left;
			else
				trav=trav.right;
		}
		if(trav==null)
			parent=null;
		
		return new Node[] {trav,parent};
		
	}
	
	public int parent(int node)
	{
		Node arr[] = printParentOfNode(node);
		Node parent = arr[1];
		
		return parent.data;
		
	}
	
	
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
}
