package dto;

public class Batter extends Human {
	
	private int batCount;
	private int hit;
	private double hitAvg;
	
	public Batter() {		
	}

	public Batter(int number, String name, String birth, int age, double height, int batCount, int hit, double hitAvg) {
		super(number, name, birth, age, height);
		this.batCount = batCount;
		this.hit = hit;
		this.hitAvg = hitAvg;
	}
	
	

}
