package main;

import my.myClass;
import you.youClass;

public class mainClass {

	public static void main(String[] args) {
		myClass my = new myClass();
		youClass you = new youClass();
		
		my.myMethod();
		you.youMethod();
		
		System.out.println(you.toString());

	}

}
