package sortMethod;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		int u_number[];

		//입력
		u_number = input();

		//sort처리
		String sorting_str;
		sorting_str = sorting(u_number);
		
			/*			
			//swap 처리
			swap()
			*/
		
		//결과출력
		resultPrint(u_number,sorting_str);

	}
static int[] input() {
	Scanner sc = new Scanner(System.in);
	
	String user_s_count;

	int u_count;
	
	int u_number[];
	
	int w;
	
	System.out.print("몇개의 숫자를 입력하시겠습니까? ");
	user_s_count = sc.next();
	
	u_count = Integer.parseInt(user_s_count);
	
	u_number = new int[u_count];
	
	w=0;
	// 숫자 입력 받기
	while(w<2) {
		while(w < u_count) {
			System.out.print(u_count+"개 숫자를 입력하세요. : " );
			u_number[w] = sc.nextInt();
			w++;
		}
		for(int i=0;i<u_count;i++) {
			System.out.print(u_number[i]+"\t");
		}
	}
	return u_number;
}
static String sorting (int[] number) {
	Scanner sc = new Scanner(System.in);
	
	int w;
	
	String sort_q;
	
	//init
	w=0;
	while(true) {
		// 오름 차순 or 내림차순
		System.out.print("\n\n오름차순? 내림차순?");
		sort_q = sc.next();
		
		//sorting
		if("오름차순".equals(sort_q) ){
			swap(sort_q, number);
			break;
		}else	 if("내림차순".equals(sort_q) ){
			swap(sort_q, number);
			break;
		}else{
			System.out.println("잘못입력하셨습니다.");
			continue;
		}
	}
	return sort_q;
}

static int[] swap (String s, int[] number) {
		
	int temp;
	
	String sort_q;
	
	if("오름차순".equals(s) ){
		for(int i=0; i<number.length-1;i++) {
			for(int j=i+1; j<number.length;j++) {
				if(number[i] > number[j]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
	}else	 if("내림차순".equals(s) ){
		for(int i=0; i<number.length-1;i++) {
			for(int j=i+1; j<number.length;j++) {
				if(number[i] < number[j]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
	}
	return number;
}
static void resultPrint(int[] number, String s) {
	//result
	System.out.println(" ["+s+"] ");
	for(int i=0; i<number.length;i++) {
		System.out.print("result : "+number[i]+"\t");
	}
}
}