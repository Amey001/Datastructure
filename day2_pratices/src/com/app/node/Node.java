package com.app.node;

public class Node {
	private Node prev;
	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	private int data;
	private Node next;
	
	public Node() {
		this.data=0;
		this.next=null;
	}
	
	public Node(int data) {
		this.data=data;
		this.next=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [prev=" + prev + ", data=" + data + ", next=" + next + "]";
	}
	
	
}
