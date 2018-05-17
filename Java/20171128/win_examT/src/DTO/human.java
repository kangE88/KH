package DTO;

public class human {
	private int seq;
	private String name;
	private int age;
	
	public human() {
		
	}

	public human(int seq, String name, int age) {
		super();
		this.seq = seq;
		this.name = name;
		this.age = age;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "human [seq=" + seq + ", name=" + name + ", age=" + age + "]";
	}
	
}
