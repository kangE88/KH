package sample06_20180205;

import java.io.Serializable;

public class memberDTO implements Serializable {
private int number;
private String name;

public memberDTO() {
}

public memberDTO(int number, String name) {
	super();
	this.number = number;
	this.name = name;
}

@Override
public String toString() {
	return "memberDTO [number=" + number + ", name=" + name + "]";
}

	
}
