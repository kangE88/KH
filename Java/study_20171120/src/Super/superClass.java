package Super;

public class superClass {
	private int num;
	private String name;
	
	public superClass() {
		
	}

	public superClass(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "superClass [num=" + num + ", name=" + name + "]";
	}
	
}
