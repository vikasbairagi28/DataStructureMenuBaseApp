package datastructure.stack;

import java.util.List;
import java.util.Scanner;

public class ConfigurationMenu {

	public static final Stack stack = new Stack();
	public static final LinkedList ll = new LinkedList();
	public static final Queue queue = new Queue();
	public static final Arrays array = new Arrays();

	public static void main(String args[]) {

		Menu mainMenu = new Menu("Data Structure");

		Menu stackMenu = new Menu(1, "Stack");
		Menu queueMenu = new Menu(2, "Queue");
		Menu linkedlistMenu = new Menu(3, "LinkedList");
		Menu arrayMenu = new Menu(4, "Array");

		mainMenu.addMenuItem(stackMenu);
		mainMenu.addMenuItem(queueMenu);
		mainMenu.addMenuItem(linkedlistMenu);
		mainMenu.addMenuItem(arrayMenu);

		stackMenu.addMenuItem(new MenuItem(1, "Push"));
		stackMenu.addMenuItem(new MenuItem(2, "Pop"));
		stackMenu.addMenuItem(new MenuItem(3, "Peek"));

		queueMenu.addMenuItem(new MenuItem(1, "Enqueue"));
		queueMenu.addMenuItem(new MenuItem(2, "Dequeue"));

		linkedlistMenu.addMenuItem(new MenuItem(1, "Insertelement"));
		linkedlistMenu.addMenuItem(new MenuItem(2, "InsertAt"));
		linkedlistMenu.addMenuItem(new MenuItem(3, "DeleteAt"));

		arrayMenu.addMenuItem(new MenuItem(1, "insert"));
		arrayMenu.addMenuItem(new MenuItem(2, "delete"));
		arrayMenu.addMenuItem(new MenuItem(3, "searchelement"));

		mainMenu.display();

	}
}
