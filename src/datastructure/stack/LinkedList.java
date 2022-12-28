package datastructure.stack;

import java.util.Scanner;

public class LinkedList {

	Node head;

	public void insertAtEnd(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;

		} else {
			Node temp = head;
			while (temp.next != null) // to add new node at end of LL,need to check the null reference to add
			{
				temp = temp.next; // Used to travers from head to last node
			}
			temp.next = node;

		}

	}

	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;

	}

	public void insertAt(int index, int data) {
		try {
			Node node = new Node();

			node.data = data;
			node.next = null;

			if (index == 0) {
				insertAtStart(data);
			} else {
				Node temp = head;
				for (int i = 0; i < index - 1; i++) {
					temp = temp.next;
				}
				node.next = temp.next;
				temp.next = node;

			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index selected !!!!");
		} catch (NullPointerException e) {
			System.out.println("Invalid index selected !!!!");
		}
	}

	public void deleteAt(int index) {
		try {
			if (index == 0) {
				head = head.next;
			} else {
				Node temp = head;
				Node temp1 = null;
				for (int i = 0; i < index - 1; i++) {
					temp = temp.next;
				}
				temp1 = temp.next;
				temp.next = temp1.next;
				temp1 = null; // to destroy the node which is deleted
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid input");
		} catch (NullPointerException e) {
			System.out.println("Invalid index selected");
		}
	}

	public void deleteAtBegining() {
		Node node = new Node();

		node.next = null;

		Node temp = head;
		temp = temp.next;
		head = temp;

	}

	public void deleteAtEnd() {
		Node node = new Node();

		node.next = null;
		Node temp = head;
		Node ptr = temp.next;
		while (ptr.next != null) {
			temp = ptr;
			ptr = ptr.next;
		}
		temp.next = null;
	}

	public void show() {
		try {
			Node node = head;
			while (node.next != null) {
				System.out.print(node.data + " ");
				node = node.next; // to shift at new node
			}
			System.out.print(node.data + " ");
			System.out.println();
		} catch (NullPointerException e) {
			System.out.println("Linked List is empty");
		}

	}

}
