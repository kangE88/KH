package hashMap;

public class DTO {

	private int number;
	private String name;
	
	private DTO() {
		
	}

	public DTO(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DTO [number=" + number + ", name=" + name + "]";
	}
	
	
}
