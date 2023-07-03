package com.app.main;

import com.app.BST.BinarySearchTree;

public class Tester {

	public static void main(String[] args) {
		
		BinarySearchTree b=new BinarySearchTree();
		
		b.insert(20);
		b.insert(40);
		b.insert(60);
		b.insert(90);
		b.insert(10);
		
		b.preOrder();
		b.inOrder();

	}

}
