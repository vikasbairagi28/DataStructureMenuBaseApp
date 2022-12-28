package datastructure.stack;

import java.util.Scanner;

public class MenuDrivenSwitchClass {

	{

		Stack stack = new Stack();
		LinkedList ll = new LinkedList();
		Queue queue = new Queue();
		Arrays array = new Arrays();
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		String str;
		String again;

		System.out.println("Select the Data base which you want to use");
		a = sc.nextInt();

		switch (a) {
		case 1:
			do {
				System.out.println("***Wel-come to Stack Data-Structure ");
				// System.out.println("00.Back");
				System.out.println("01.Push");
				System.out.println("02.Pop");
				System.out.println("03.peek");
				System.out.println("Select the operation which you want to perform");
				b = sc.nextInt();

				switch (b) {
//					case 0:
//						System.out.println("Thank you-Exited from Stack");
//						break;
				case 1:
					System.out.println("Enter the element");
					int element = sc.nextInt();
					stack.push(element);
					System.out.println("Element added Successfully & below is your stack");
					stack.show();
					break;
				case 2:
					System.out.println(stack.pop());
					System.out.println("Element poped Successfully & below is your stack");
					stack.show();
					break;
				case 3:
					System.out.println("This is UpperMost element" + " " + stack.peek());
					break;
				default:
					System.out.println("Incorrect selection");

				}
				System.out.println("Do you want to perform more operations; Y/N ?");
				str = sc.next();
			} while (str.equalsIgnoreCase("Y")); {
			System.out.println("Thank you for using Stack Database");
		}

			break;
		case 2:
			do {
				System.out.println("***Wel-come to Queue Data-Structure ");
				// System.out.println("00.Back");
				System.out.println("01.Enqueue");
				System.out.println("02.dequeue");
				System.out.println("Select the operation which you want to perform");
				b = sc.nextInt();
				switch (b) {
//					case 0:
//						System.out.println("Thank you-Exited from Queue");
//						break;
				case 1:
					System.out.println("Enter the Element");
					int element = sc.nextInt();
					queue.enqueue(element);
					System.out.println("Element added Successfully & below is your Queue");
					queue.show();

					break;
				case 2:
					System.out.println(queue.dequeue());
					System.out.println("Element Dequeued Successfully & below is your Queue");
					queue.show();

					break;
				default:
					System.out.println("Incorrect selection");
				}
				System.out.println("Do you want to perform more operations; Y/N ?");
				str = sc.next();
			} while (str.equalsIgnoreCase("Y")); {
			System.out.println("Thank you for using Queue Database");
		}
			break;
		case 3:
			do {
				System.out.println("***Wel-come to LinkedList Data-Structure ");
				// System.out.println("00.Back");
				System.out.println("01.Insertelement");
				System.out.println("02.InsertAt");
				System.out.println("03.DeleteAt");
				System.out.println("Select the operation which you want to perform");
				b = sc.nextInt();
				switch (b) {
//					case 0:
//						System.out.println("Thank you-Exited from LinkedList");
//						break;
				case 1:
					System.out.println("Enter the element which you want to insert");
					int element = sc.nextInt();
					ll.insertAtEnd(element);
					System.out.println(element + ":Added Successfully below is your LinkedList");
					ll.show();
					break;
				case 2:
					System.out.println("Enter the Element  which you want to add ");
					int element1 = sc.nextInt();
					System.out.println("Enter the index at which you want to add the element");
					int index = sc.nextInt();
					ll.insertAt(index, element1);
					System.out.println(element1 + ": added Successfully at Index:" + "" + index + " "
							+ "below is your LinkedList");
					ll.show();
					break;
				case 3:
					System.out.println("Enter index at which you want to delete the element");
					int index1 = sc.nextInt();
					ll.deleteAt(index1);
					System.out.println("Element Deleted Successfully !!! below is your updated LinkedList");
					ll.show();
					break;

				default:
					System.out.println("Incorrect selection");
				}
				System.out.println("Do you want to perform more operations; Y/N ?");
				str = sc.next();
			} while (str.equalsIgnoreCase("Y")); {
			System.out.println("Thank you for using LinkedList Database");
		}
			break;
		case 4:
			do {
				System.out.println("***Wel-come to Array Data-Structure ");
				// System.out.println("00.Back");
				System.out.println("01.insert");
				System.out.println("02.delete");
				System.out.println("03.searchelement");
				System.out.println("Select the operation which you want to perform");
				b = sc.nextInt();
				switch (b) {
//					case 0:
//						System.out.println("Thank you-Exited from Array");
//						break;
				case 1:
					System.out.println("Enter the element which you want to insert");
					int element = sc.nextInt();
					array.insert(element);
					System.out.println(element + ": added Successfully below is your updated Array");
					array.show();
					break;
				case 2:
					System.out.println("Enter the index at which element you want to delete ");
					int index = sc.nextInt();
					array.deleteAt(index);
					System.out.println("Element added Successfully below is your updated Array");
					array.show();
					break;
				case 3:
					System.out.println("searchElement");
					break;
				default:
					System.out.println("Incorrect selection");
					break;
				}
				System.out.println("Do you want to perform more operations; Y/N ?");
				str = sc.next();
			} while (str.equalsIgnoreCase("Y")); {
			System.out.println("Thank you for using Array Database");
		}

		default:
			System.out.println("Incorrect selection");
			break;

		}

	}

}
