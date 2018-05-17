package Jtable;


import java.io.Serializable;

public class DTO implements Serializable {
	
	private int sequenceNum;	//	중복되지 않는 번호
	private String name;		//	상품명 
	private int money;			//	가격
	private String company;		//	회사명
	
	public DTO(int sequenceNum, String name, int money, String company) {
		super();
		this.sequenceNum = sequenceNum;
		this.name = name;
		this.money = money;
		this.company = company;
	}

	public int getSequenceNum() {
		return sequenceNum;
	}

	public void setSequenceNum(int sequenceNum) {
		this.sequenceNum = sequenceNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "DTO [sequenceNum=" + sequenceNum + ", name=" + name + ", money=" + money + ", company=" + company + "]";
	}
	
}
