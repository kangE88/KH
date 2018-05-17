package main;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread1 = new ThreadEx("퐁");
		Thread thread2 = new ThreadEx("당");
		Thread thread3 = new ThreadEx("퐁!");
		Thread thread4 = new ThreadEx("당!");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		System.out.println("프로그램 종료");
		
	}

}
