package datastructure.stack;

public class Arrays {

	int capacity = 1;
	int[] a = new int[capacity];

	int count;

	public void insert(int data) {
		if (size() == capacity) {
			expand();
		}

		a[count] = data;
		count = count + 1;
	}

	private void expand() {
		int length = size();
		int[] newArray = new int[capacity + 1];

		System.arraycopy(a, 0, newArray, 0, length);
		a = newArray;
		capacity++;

	}

	private int size() {

		return count;
	}
	
	public void length()
	{
		System.out.println(a.length);
	}

	public void insertAtBeginning(int data) {
		for (int i = a.length - 1; i > 0; i--) {
			a[i] = a[i - 1];
		}
		a[0] = data;
	}

	public void insertAT(int index, int data) {

		if (index <= capacity) {
			for (int i = a.length - 1; i < index; i--) {
				a[i] = a[i - 1];

			}
			a[index] = data;
		} else {
			System.out.println("index should be less than capacity" + " " + capacity);
		}

	}

	public void insertAtEnd(int data) {
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
		a[a.length - 1] = data;

	}

	public void deleteAt(int index) {
		if (index >= capacity) {
			System.out.println("index should be less than capacity" + " " + capacity);
		} else {

			for (int i = index; i < a.length - 1; i++) {
				a[i] = a[i + 1];

			}
			shrink();
		}

	}

	private void shrink() {

		int[] newArray = new int[capacity - 1];

		for (int i = 0; i < a.length - 1; i++) {
			newArray[i] = a[i];
		}
		a = newArray;
		capacity--;

	}

	public void searchIndex(int element) {

		int temp = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] == element) {
				System.out.println(i);
				temp = temp + 1;
			}

		}

		if (temp > 0) {
			System.out.println("Element is present in array");
		} else {
			System.out.println("Element not present in array");
		}
	}

	public void searchElement(int index) {
		int temp = 0;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (i == index) {
				temp = a[i];
				count++;
			}
		}

		if (count > 0) {
			System.out.println(temp);
		} else {
			System.out.println("Invalid input");
		}
	}

	public void show() {
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println();
	}

}
