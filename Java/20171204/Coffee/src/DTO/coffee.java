package DTO;

public class coffee {
	private String coffeeName;
	private int SizeS;
	private int SizeT;
	private int SizeG;
	public coffee(String coffeeName, int sizeS, int sizeT, int sizeG) {
		super();
		this.coffeeName = coffeeName;
		SizeS = sizeS;
		SizeT = sizeT;
		SizeG = sizeG;
	}
	public String getCoffeeName() {
		return coffeeName;
	}
	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	public int getSizeS() {
		return SizeS;
	}
	public void setSizeS(int sizeS) {
		SizeS = sizeS;
	}
	public int getSizeT() {
		return SizeT;
	}
	public void setSizeT(int sizeT) {
		SizeT = sizeT;
	}
	public int getSizeG() {
		return SizeG;
	}
	public void setSizeG(int sizeG) {
		SizeG = sizeG;
	}
	@Override
	public String toString() {
		return "coffee [coffeeName=" + coffeeName + ", SizeS=" + SizeS + ", SizeT=" + SizeT + ", SizeG=" + SizeG + "]";
	}

	
	
}
