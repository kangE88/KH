package Child;

import Super.superClass;

public class ChildClass extends superClass {

	private double height;
	private String title;
	
	public ChildClass() {
		
	}

	public ChildClass(int num, String name, double height, String title) {
		super(num, name);
		this.height = height;
		this.title = title;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return super.toString() + " ChildClass [height=" + height + ", title=" + title + "]";
	}
	
}
