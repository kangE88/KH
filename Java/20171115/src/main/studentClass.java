package main;

public class studentClass {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름:"+ s.name);
		System.out.println("총점:"+ s.getTotal(s.kor, s.eng, s.math)  );
		System.out.println("평균:"+ s.getAverage()  );	

	}
}
class Student{
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int sum;

	
	int getTotal(int k, int e, int m) {		
		sum = k + e + m;		
		return sum;		
	}
	
	int getAverage() {
		return (kor + eng + math) / 3;
	}	
	
	
}
