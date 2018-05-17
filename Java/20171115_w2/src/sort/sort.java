package sort;

import java.util.Scanner;

public class sort {


	
	private int num_arr[];
	private int num_count;
	private int select;
	private boolean updown;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 할 숫자의 갯수 : ");
		num_count = sc.nextInt();
		
		num_arr = new int[num_count];
		
		for(int i=0;i<num_arr.length;i++) {
			System.out.print(num_count+" 개의 숫자를 입력하세요.");
			num_arr[i] = sc.nextInt();
		}
		
		System.out.println("up(1)? down(2)? : ");
		select = sc.nextInt();
		
		if(select==1) {
			updown =true;
		}else {
			updown =false;
		}
		
		
		for (int i = 0; i < num_arr.length; i++) {
			System.out.println("num_arr[" + i+ "]=== "+num_arr[i]);
		}
	}
	
	public void sorting() {
		for (int i = 0; i < num_arr.length; i++) {
			for (int j = i+1; j < num_arr.length; j++) {
				if(updown) {
					if(num_arr[i] > num_arr[j]) {
						swap(i,j);
					}
				}else{
					if(num_arr[i] < num_arr[j]) {
						swap(i,j);
					}
				}
			}
		}
	}
	
	public void swap(int i, int j) {
		int temp = num_arr[i];
		num_arr[i] = num_arr[j];
		num_arr[j] = temp;
	}

	public void resultPrint() {
		for (int i = 0; i < num_arr.length; i++) {
			System.out.print("[");
			System.out.print(num_arr[i]);
			System.out.print("]");
		}
	}
	
}
