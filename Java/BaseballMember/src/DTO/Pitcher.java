package DTO;

public class Pitcher extends Human{
	
	private int win;
	private int lose;
	private double defence;
	
	public Pitcher() {
		
	}
	
	public Pitcher(int no, String name, String birth, int age, double height, boolean position, int win, int lose, double defence) {
		super(no, name, birth, age, height, position);
		this.win = win;
		this.lose = lose;
		this.defence = defence;
	}



	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public double getDefence() {
		return defence;
	}

	public void setDefence(double defence) {
		this.defence = defence;
	}

	@Override
	public String toString() {
		return super.toString() + "-" + win + "-" + lose + "-" + defence;
	}
	
	
	
}
