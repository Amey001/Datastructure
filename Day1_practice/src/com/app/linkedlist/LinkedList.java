package com.app.linkedlist;

import java.util.Stack;

import com.app.node.Node;

public class LinkedList {
	private Node head;
	
	public LinkedList() {
		head=null;
	}
	
	public boolean insertdata(int data)
	{	
		Node newnode=new Node(data);
		
		if(head == null)
		{
			head=newnode;
			return true;
		}
		
		//insert the node at the last
		Node last=head;
		while(last.getNext()!=null)
		{
			last=last.getNext();
		
		}
		
		last.setNext(newnode);
		return true;
		
	}
	
	//insert at particular position 
	public boolean insertatpos(int data,int position)
	{
		if(position<=0)
		{
			return false;
		}
		
		Node newnode=new Node(data);
		
		if(position ==1)
		{
			newnode.setNext(head);
			head=newnode;
			return true;
		}
		
		Node prev=head;
		for(int i=1;i<position-1;i++)
		{
			prev=prev.getNext();
			if(prev==null)
			{
				return false;
			}
			
		}
		newnode.setNext(prev.getNext());
		prev.setNext(newnode);
		
		
		
		return true;
	}
	
	public void display()
	{
		Node temp=head;
		
		while(temp!=null)
		{
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
	}
	
	//display in reverse
	public void displayRev()
	{
		if(head==null)
		{
			return;
		}
		
		Node temp=head;
		Stack<Node> s=new Stack<>();
		
		while(temp!=null)
		{
			s.push(temp);
			temp=temp.getNext();
			
		}
		
		s.forEach((i)->System.out.println(" stack :: "+i.getData()));
		
		System.out.println(" displaying the data in rev :: ");
		while(!s.isEmpty())
		{
			System.out.println(s.pop().getData());
			
		}
		System.out.println(" stack is empty all data has popped !!!");
		
			
	
		
	}

}
