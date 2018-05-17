package DTO;

public class Batter extends Human{
	private int batCount;
	private int hit;
	private double hitAvg;

	public Batter() {
		
	}
	
	public Batter(int no, String name, String birth, int age, double height, boolean position, int batCount, int hit, double hitAvg) {
		super(no, name, birth, age, height, position);
		this.batCount = batCount;
		this.hit = hit;
		this.hitAvg = hitAvg;
	}

	public int getBatCount() {
		return batCount;
	}

	public void setBatCount(int batCount) {
		this.batCount = batCount;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public double getHitAvg() {
		return hitAvg;
	}

	public void setHitAvg(double hitAvg) {
		this.hitAvg = hitAvg;
	}

	@Override
	public String toString() {
		return super.toString() +"-" + batCount + "-" + hit + "-" + hitAvg;
	}

	
	
}
