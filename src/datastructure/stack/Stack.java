package datastructure.stack;

import java.util.List;

public class Stack {

	int capacity = 1;
	int[] stack = new int[capacity];
	int start = 0;

	public void push(int data) {
		if (size() == capacity) {
			expand();
		}

		stack[start] = data;
		start = start + 1;

	}

	public int size() {
		return start;
	}

	private void expand() {
		int length = size();
		int[] newStack = new int[capacity + 1];

		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		capacity++;

	}

	public int pop() {

		int data = 0;
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		} else {
			start--;
			data = stack[start];
			stack[start] = 0;
			shrink();
		}
		return data;

	}

	private void shrink() {
		int length = size();
		if (length <= (capacity / 2) / 2)
			capacity = capacity - 1;

		int[] newStack = new int[capacity - 1];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		capacity--;

	}

	private boolean isEmpty() {

		return start <= 0;
	}

	public int peek() {
		int data;
		try {

			data = stack[start - 1];
			return data;
		} catch (Exception e) {
			System.out.println("Stack is Empty");
		}
		return 0;
	}

	public void show() {
		for (int n : stack) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
