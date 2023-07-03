package com.app.doubly;

import com.app.node.Node;

public class DoublyLList {
	private Node head;
	
	public DoublyLList() {
		this.head=null;
	}
	
	public boolean insert(int data)
	{
		Node newnode=new Node(data);
		if(head == null)
		{
			head=newnode;
			return true;
		}
		
		Node last=head;
		while(last !=null) 
		{
			last=last.getNext();
		}
		last.setNext(newnode);
		newnode.setPrev(last);
		
		return true;
	}//end of insert(
	
	//display the doubly linked list
	public void display()
	{
		Node temp=head;
		if(head==null)
		{
			return;
		}
		
		while(temp !=null)
		{
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
		System.out.println();
	} //end of display()
	
	public boolean insertatpos(int data,int position)
	{
		Node newnode=new Node(data);
		Node temp=head;
		if(position <0 ||(head == null && position>0))
		{
			return false;
		}
		
		if(position == 1)
		{
			if(head != null)
			{
				newnode.setNext(head);
				head.setPrev(newnode);
			}
			head=newnode;
			return true;
		}
		
		//locate position -1 node
		Node prev=head;
		for(int i=1;i<position-1;i++)
		{
			prev=prev.getNext();
			if(prev==null)
			{
				return false;
			}
		}//prev is now at that position -1
		
		Node next=prev.getNext();
		newnode.setPrev(prev);
		prev.setNext(newnode);
		if(next != null)
		{
			newnode.setNext(next);
			next.setPrev(newnode);
		}
		
		return true;		
	}//end if insertatpos
	
	//deleteByVal
	public boolean deleteByVal(int data)
	{
		if(head==null)
		{
			return false; 
		}
		if(head.getData() == data)
		{
			head=head.getNext();
		}
			
		Node del=head;
		while(del.getData() !=data)
		{
			del=del.getNext();
			if(del == null)
			{
				return false;
			}
		}
		
		Node prev=del.getPrev();
		Node next=del.getNext();
		
		prev.setNext(next);
		if(next != null )
		{
			next.setPrev(prev);
		}
		return true;
	}//end of deleteByVal
	
//	public boolean deleteByPos(int position)
//	{
//		
//	}
	
}
