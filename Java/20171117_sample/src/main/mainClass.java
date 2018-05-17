package main;

import Child.Student;

public class mainClass {

	public static void main(String[] args) {
		Student st = new Student(1, 1, "홍길동", 30, 178);
		
		System.out.println(st.toString());

	}

}
