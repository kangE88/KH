package dto;

// Data Transfer Object
public class student extends Human{

	
	private int ko;
	private int eng;
	private int math;
	
	//student init 
	public student() {
	}

	public student(int ko, int eng, int math, int number, String name, String address) {
		super(number, name, address);
		this.ko = ko;
		this.eng = eng;
		this.math = math;
	}

	public int getKo() {
		return ko;
	}

	public void setKo(int ko) {
		this.ko = ko;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return super.toString() + " student [ko=" + ko + ", eng=" + eng + ", math=" + math + "]";
	}
	

	
}
