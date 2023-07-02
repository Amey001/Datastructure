package com.app.main;

import java.util.Iterator;
import java.util.Scanner;

import com.app.ddl.DoublyList;

public class Tester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DoublyList dll=new DoublyList();
		dll.display();
		dll.insert(10);
		dll.insert(20);
		dll.insert(30);
		dll.display();
	}

}
