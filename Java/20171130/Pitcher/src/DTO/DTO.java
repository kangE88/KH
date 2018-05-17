package DTO;

public class DTO {
	
	private int Number;
	private String Name;
	private double ballSpeed;
	private double Defense;
	
	public DTO(int number, String name, double ballSpeed, double defense) {
		super();
		Number = number;
		Name = name;
		this.ballSpeed = ballSpeed;
		Defense = defense;
	}

	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getBallSpeed() {
		return ballSpeed;
	}

	public void setBallSpeed(double ballSpeed) {
		this.ballSpeed = ballSpeed;
	}

	public double getDefense() {
		return Defense;
	}

	public void setDefense(double defense) {
		Defense = defense;
	}

	@Override
	public String toString() {
		return "DTO [Number=" + Number + ", Name=" + Name + ", ballSpeed=" + ballSpeed + ", Defense=" + Defense + "]";
	}
	
	

}
