package DTO;

public class other {
	private String coffee_name;
	private String syurp;
	private String size;
	private String shotadd;
	private String hcream;
	private String coffeeitem;
	private int coffeePri;
	public other(String coffee_name, String syurp, String size, String shotadd, String hcream, String coffeeitem,
			int coffeePri) {
		super();
		this.coffee_name = coffee_name;
		this.syurp = syurp;
		this.size = size;
		this.shotadd = shotadd;
		this.hcream = hcream;
		this.coffeeitem = coffeeitem;
		this.coffeePri = coffeePri;
	}
	public String getCoffee_name() {
		return coffee_name;
	}
	public void setCoffee_name(String coffee_name) {
		this.coffee_name = coffee_name;
	}
	public String isSyurp() {
		return syurp;
	}
	public void setSyurp(String syurp) {
		this.syurp = syurp;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String isShotadd() {
		return shotadd;
	}
	public void setShotadd(String shotadd) {
		this.shotadd = shotadd;
	}
	public String isHcream() {
		return hcream;
	}
	public void setHcream(String hcream) {
		this.hcream = hcream;
	}
	public String getCoffeeitem() {
		return coffeeitem;
	}
	public void setCoffeeitem(String coffeeitem) {
		this.coffeeitem = coffeeitem;
	}
	public int getCoffeePri() {
		return coffeePri;
	}
	public void setCoffeePri(int coffeePri) {
		this.coffeePri = coffeePri;
	}
	@Override
	public String toString() {
		return "Other [coffee_name=" + coffee_name + ", syurp=" + syurp + ", size=" + size + ", shotadd=" + shotadd
				+ ", hcream=" + hcream + ", coffeeitem=" + coffeeitem + ", coffeePri=" + coffeePri + "]";
	}
	
	
	
}
