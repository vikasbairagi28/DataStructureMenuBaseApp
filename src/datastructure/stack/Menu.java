package datastructure.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Menu extends MenuItem {

	private List<MenuItem> items = new ArrayList<>();
	private static boolean isStageOne = true;
	private static Scanner sc = new Scanner(System.in);

	public Menu() {
		super();
	}

	public Menu(int order, String title) {
		super(order, title);
		addMenuItem(new MenuItem(0, "Back"));
	}

	public Menu(String title) {
		super(0, title);
	}

	public void addMenuItem(MenuItem item) {
		item.setParent(this);
		items.add(item);
	}

	public List<MenuItem> getMenuItems() {
		return items;
	}

	public void display() {
		if (isStageOne) {
			isStageOne = false;
			// items.forEach(e -> e.display());
			for (MenuItem m : items) {
				m.display();
			}
			isStageOne = true;
			System.out.println("Select Your choice..!!!!");
			int select = sc.nextInt();
			if (select == 0) {
				goBack();
			} else {
				MenuItem mi = getMenuItems().stream().filter(menuItem -> menuItem.getIndex() == select).
						findFirst().orElse(null);
						
				if (mi == null) {
					System.out.println("Invalid Selection..!");
					display();
				} else if (mi instanceof Menu) {
					mi.display();
				} else {
					String operation = mi.getTitle();
					String ds = mi.getParent().getTitle();

					switch (ds) {
					case "Stack":
						stackOperations(operation);
						break;
					case "Queue":
						queueOperations(operation);
						break;
					case "LinkedList":
						linkedListOperations(operation);
						break;
					case "Array":
						arrayOperations(operation);
						break;

					}
				}
			}
		} else {
			super.display();
		}
	}

	public void goBack() {
		if (getParent() != null) {
			getParent().display();
		} else {
			System.exit(0);
		}
	}

	public void stackOperations(String operationName) {

		switch (operationName) {
		case "Push":
			System.out.println("Please enter how many values to insert in stack : ");
			int n = sc.nextInt();
			System.out.println("Enter " + n + " values");
			for (int i = 1; i <= n; i++) {
				ConfigurationMenu.stack.push(sc.nextInt());
			}
			System.out.println("Data in stack are -> ");
			ConfigurationMenu.stack.show();
			back();
			break;
		case "Pop":
			System.out.println("Removed Value is : " + ConfigurationMenu.stack.pop());
			back();
			break;
		case "Peek":
			System.out.println("Peeked Data is -> " + ConfigurationMenu.stack.peek());
			back();
			break;

		}

	}

	public void queueOperations(String operationName) {

		switch (operationName) {
		case "Enqueue":
			System.out.println("How many values want to be inserterd in Queue.!");
			int n = sc.nextInt();
			System.out.println("Enter " + n + " values");
			for (int i = 1; i <= n; i++) {
				ConfigurationMenu.queue.enqueue(sc.nextInt());
			}
			System.out.println("Data inside the Queue is-> ");
			ConfigurationMenu.queue.show();
			back();
			break;
		case "Dequeue":
			System.out.println("Removed Data for Queue is-> " + ConfigurationMenu.queue.dequeue());
			back();
			break;
		}
	}

	public void linkedListOperations(String operationName) {

		switch (operationName) {
		case "Insertelement":
			System.out.println("Please How many value want to be entered.!");
			int n = sc.nextInt();
			System.out.println("Please enter " + n + " values");
			for (int i = 1; i <= n; i++) {
				ConfigurationMenu.ll.insertAtEnd(sc.nextInt());
			}
			System.out.println("Added Data is ");
			ConfigurationMenu.ll.show();
			back();
			break;

		case "InsertAt":
			System.out.println("Enter index and value -> ");
			ConfigurationMenu.ll.insertAt(sc.nextInt(), sc.nextInt());
			ConfigurationMenu.ll.show();
			back();
			break;
		case "DeleteAt":
			System.out.println("Enter index  -> ");
			ConfigurationMenu.ll.deleteAt(sc.nextInt());
			ConfigurationMenu.ll.show();
			back();
			break;

		}

	}

	public void arrayOperations(String operationName) {

		switch (operationName) {
		case "insert":
			System.out.println("Please How many value want to be entered.!");
			int n = sc.nextInt();
			System.out.println("Please enter   " + n + " values");
			for (int i = 1; i <= n; i++) {
				ConfigurationMenu.array.insert(sc.nextInt());
			}
			System.out.println("Added Data is ");
			ConfigurationMenu.array.show();
			back();
			break;

		case "delete":
			System.out.println("Enter index and value -> ");
			ConfigurationMenu.array.deleteAt(sc.nextInt());
			ConfigurationMenu.array.show();
			back();
			break;
		case "searchelement":
			System.out.println("Enter index  -> ");
			ConfigurationMenu.array.searchElement(sc.nextInt());
			ConfigurationMenu.array.show();
			back();
			break;

		}

	}

}
