package dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import dto.status;

public class dao_HClass {
	private status arr[];
	private int count;
	private String arrStr[];

	Scanner sc = new Scanner(System.in);
	
	File f = new File("e:\\tmp1\\contact.txt");


	
	public dao_HClass(){
		arr = new status[20];
		count = 0;
		arrStr = new String[20];
	}
	
	public void insert() {
		System.out.println("번호 :");
		int number = sc.nextInt();
		System.out.println("이름 :");
		String name = sc.next();
		System.out.println("주소 :");
		String address = sc.next();
		System.out.println("나이 :");
		int age = sc.nextInt();
		System.out.println("키 :");
		double height = sc.nextDouble();
		System.out.println("몸무게 :");
		double weight = sc.nextDouble();
		
		
		status st = new status(number, name, address, age, height, weight);
		
		arr[count] = st;
		
		//for (int i = 0; i < arr.length; i++) {
			//if(arr[count] == null) {
		if(!checkBeforeReadFile(f)) {
			try {
				f.createNewFile();
				
				FileWriter fw = new FileWriter(f);
				
				BufferedWriter br = new BufferedWriter(fw);
				
				br.write(arr[count].getNumber()+"-"+arr[count].getName()+"-"+arr[count].getAddress()+"-"+arr[count].getAge()+"-"+arr[count].getHeight()+"-"+arr[count].getWeight()+",");
				br.close();
				
				count++;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(arr[count] == null) {
			try {
				BufferedWriter br = new BufferedWriter(new FileWriter(f));
				
				br.write(arr[count].getNumber()+"-"+arr[count].getName()+"-"+arr[count].getAddress()+"-"+arr[count].getAge()+"-"+arr[count].getHeight()+"-"+arr[count].getWeight()+",");
				br.close();
				
				count++;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void delete() {
		
	}
	public void select() {
		
	}
	public void update() {
		
	}
	public void allPrint() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[ "+i+" ]== "+arr[i]);
		}
	}
	
	static boolean checkBeforeReadFile(File f) {
		if(f.exists()) {
			if(f.isFile() && f.canRead()) {
				return true;
			}
		}
		return false;
	}
}
