package com.app.ddl;

import com.app.node.Node;

public class DoublyList {
	private Node head;

	public DoublyList() {
		this.head = head;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	//insert at last 
	public boolean insert(int data)
	{	
		Node newnode=new Node(data);
		if(newnode == null)
		{
			return false;
		}
		//empty list then add newnode to head
		if(head == null)
		{
			head=newnode;
			return true;
		}
		
		
		//insert at last 
		Node last=head;
		if(last.getNext() != null)
		{			
			last=last.getNext();	
		}
		
		//if above condition gets failed then
		last.setNext(newnode);
		newnode.setPrev(last);
		return true;	
	}
		
	//insert at particular position taken from user
	public boolean insertatpos(int data,int pos)
	{
		Node newnode=new Node();
		if(pos<0)
		{
			return false;
		}
		if(pos == 1)
		{
			if(head != null )
			{
				newnode.setNext(head);
				head.setPrev(newnode);
				
			}
			head=newnode;
			return true;
			
		}
		
		//locate pos-1 node 
		 Node prev=head;
		 for(int i=1;i<pos-1;i++)
		 {
			 prev=prev.getNext();
		 }
		 //now the prev is at the pos now insert the newnode at that pos
		 Node next=prev.getNext();
		 newnode.setPrev(prev);
		 prev.setNext(newnode);
		 if(next!=null)
		 {
			newnode.setNext(next);
			next.setPrev(newnode);
		 }
		return true;
			
		
	}
	

	
	//display the list
	public void display()
	{
		System.out.println(" Doubly Linked List :: ");
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.getData()+"  ");
			temp=temp.getNext();	
		
		}
		System.out.println();
	}

	
}
