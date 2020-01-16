package com.sid.DAA;

import java.util.List;

class Node{
	public int value;
	Node next;
	public Node(int NewValue) {
		value=NewValue;
	}
}

class list {
	private int length;
	private Node head;
	
	public void AddList(int value) {
		Node node=new Node(value);
		if(length==0)
			node.next=null;
		else
			node.next=head;
		head=node;
		length++;		
	}
	
	public void print() {
		Node node=head;
		while(node !=null) {
			System.out.println(node.value);
			node=node.next;
		}
	}
	
	public void selectionSort() {
		for (Node n1=head; n1 !=null; n1=n1.next) {
			Node min=n1;
			for(Node n2=n1; n2!=null; n2=n2.next) {
				if(min.value>n2.value) {
					min=n2;
				}
			}
			
			//SWAPPING
			Node temp=new Node(n1.value);
			n1.value=min.value;
			min.value=temp.value;
		}
	}
}




public class SelectionLinkedList {
public static void main(String[] args) {
	 list l1=new list();
	 l1.AddList(5);
	 l1.AddList(10);
	 l1.AddList(55);
	 l1.AddList(22);
	 l1.AddList(65);
	 l1.AddList(12);
	 l1.AddList(75);
	 
	System.out.println("Befor sorting:");
	l1.print();
	l1.selectionSort();
	System.out.println("After sorting:");
	l1.print();
	 
}
}
