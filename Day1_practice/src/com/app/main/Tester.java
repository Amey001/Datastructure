package com.app.main;

import com.app.linkedlist.LinkedList;

public class Tester {

	public static void main(String[] args) {
		
		LinkedList l1=new LinkedList();
		
		l1.insertdata(10);
		l1.insertdata(20);
		l1.insertdata(40);
		
		l1.display();
		l1.insertatpos(30, 3);
		System.out.println(" after inserting at position 3rd :: ");		
		l1.insertatpos(50, 5);
		
		l1.insertatpos(60, 1);
		l1.display();
		
		l1.displayRev();
		l1.display();
		
		//60,10,20,30,40,50   now i want to delete the 20
		System.out.println("deleting the element from 3rd position ...");
		l1.deletebyposition(3);
		l1.display();
		
		
		
		
	}

}
