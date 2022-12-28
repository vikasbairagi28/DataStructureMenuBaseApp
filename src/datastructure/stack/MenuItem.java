package datastructure.stack;

public class MenuItem {

	private int index;
	private String title;
	private MenuItem parent;

	public MenuItem() {
	}

	public MenuItem(int index, String title) {
		super();
		this.index = index;
		this.title = title;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public MenuItem getParent() {
		return parent;
	}

	public void setParent(MenuItem parent) {
		this.parent = parent;
	}

	public void display() {
		System.out.println(index + " - " + title);
	}

	public void back() {
		if (parent != null) {
			display();
		} else {
			System.out.println("Parent is null");
		}
	}
}
