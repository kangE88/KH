package sort;

import java.util.Scanner;

public class sortM {
	
	private int number[] = null;
	private boolean upDown;
	
	// 초기화
	public void init() {	
		input();		
	}
	
	// 입력
	public void input() {
		Scanner sc = new Scanner(System.in);
		// 몇개?
		System.out.print("몇개의 숫자 정렬할 것입니까? = ");
		int count = sc.nextInt();
		
		this.number = new int[count];
		
		// 숫자 입력
		for (int i = 0; i < number.length; i++) {
			System.out.print((i + 1) + "번째 수 = ");
			number[i] = sc.nextInt();
		}
		
		// 오름/내림
		System.out.print("올림(1)/내림(2) = ");
		int ud = sc.nextInt();
		if(ud == 1)	upDown = true;
		else		upDown = false;
	}		
	
	// 정렬처리		
	public void sorting() {
		for (int i = 0; i < number.length - 1; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if(upDown){	// 올림
					if(number[i] > number[j]){
						swap(i, j);						
					}					
				}else{// 내림
					if(number[i] < number[j]){ 
						swap(i, j);						
					}					
				}
			}
		}
	}
	// swap
	private void swap(int i, int j) {
		int temp = number[i];
		number[i] = number[j];
		number[j] = temp;
	}	
	
	// 결과출력	
	public void resultPrint() {
		for (int i = 0; i < number.length; i++) {
			System.out.println("number[" + i + "] = " + number[i]);
		}
	}	
}
