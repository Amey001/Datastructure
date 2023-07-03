package com.app.BST;

import java.util.Stack;

import com.app.node.Node;

public class BinarySearchTree {
	private Node root;
	
	public BinarySearchTree() {
		root=null;
	}
	
	public boolean insert(int data)
	{
		Node newnode=new Node(data);  
		if(root == null)
		{
			root=newnode;
			return true;
		}
		
		Node temp=root;
		while(true)
		{
			if(data==temp.getData())
			{
				return false;
			}
			
			if(data<temp.getData())
			{
				if(temp.getLeft()==null)
				{
					temp.setLeft(newnode);
					return true;
				}
				temp=temp.getLeft();
			}
			else {
				if(temp.getRight()==null)
				{
					temp.setRight(newnode);
					return true;
				}
				temp=temp.getRight();
			}	
		}		
	}
	
	//get the data in pre-orders
	public void preOrder()
	{	
		Node temp=root;
		Stack<Node> s=new Stack<>();
		System.out.println(" Pre-order :: ");
		
		while(temp!=null || !s.empty())
		{
			while(temp !=null)
			{
				System.out.print(temp.getData()+" ");
				s.push(temp);
				temp=temp.getLeft();
			}
			temp=s.pop().getRight();
		}
		System.out.println();	
	}
	
	//display the nodes in inOrder
	public void inOrder()
	{
		Node temp=root;
		Stack<Node> s=new Stack<>();
		System.out.println(" inOrder :: ");
		while(temp!=null || !s.empty())
		{
			while(temp!=null)
			{
				s.push(temp);
				temp=temp.getLeft();
				
			}
			temp=s.pop();
			System.out.print(temp.getData()+" ");
			temp=temp.getRight();
		}
		System.out.println();
	}

	//
	
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	

}
