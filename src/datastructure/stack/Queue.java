package datastructure.stack;

public class Queue {

	int capacity = 2;
	int[] queue = new int[capacity];
	int rear;
	int front;
	int size;
	int start = 0;

	public void enqueue(int data) {
		if (size() == capacity) {
			expand();
		}

		queue[rear] = data;
		rear = rear + 1;
		size = size + 1;
		start++;
	}

	public int size() {
		return start;
	}

	private void expand() {
		int length = size();
		int[] newqueue = new int[capacity + 1];

		System.arraycopy(queue, 0, newqueue, 0, length);
		queue = newqueue;
		capacity++;

	}

	public int dequeue() {

		int data = 0;
		if (isEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			start--;
			data = queue[front];
			front = (front + 1);
			size = size - 1;

		}
		return data;

	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		boolean response = false;
		if (size == 0) {
			response = true;
		}
		return response;
	}

	public void show() {
		for (int i = 0; i < size; i++) {
			System.out.print(queue[front + i] + " ");
		}
		System.out.println();

	}

}
