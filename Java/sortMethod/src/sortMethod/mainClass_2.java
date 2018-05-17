package sortMethod;

import java.util.Scanner;

public class mainClass_2 {

	public static void main(String[] args) {
		
		int[] u_number;
		
		String sort_q;
		
		//입력
		u_number = input();
		
		//sort처리
		sort_q = sorting(u_number);
			/*			
			//swap 처리
			swap()
			*/
		
		//결과출력
		resultPrint(u_number,sort_q);
		
	}
static int[] input() {
	Scanner sc = new Scanner(System.in);
	
	String user_s_count;
	
	int u_count;
	
	int u_number[];
	
	int w;
	
	w=0;
	System.out.print("몇개의 숫자를 입력하시겠습니까? ");
	user_s_count = sc.next();
	
	u_count = Integer.parseInt(user_s_count);
	
	u_number = new int[u_count];
	
	while(w < u_count) {
		System.out.print(u_count+"개 숫자를 입력하세요. : " );
		u_number[w] = sc.nextInt();
		w++;
	}
	for(int i=0;i<u_count;i++) {
		System.out.print(u_number[i]+"\t");
	}
	return u_number;
	
}
	
static String sorting(int[]u_number) {
	
	Scanner sc = new Scanner(System.in);
	
	String sort_q;

	int w;
	
	w=0;
	
	while(true) {	
		// 오름 차순 or 내림차순
		System.out.print("\n\n오름차순? 내림차순?");
		sort_q = sc.next();

		if("오름차순".equals(sort_q) ){
			swap(u_number,sort_q);
			break;
		}else	 if("내림차순".equals(sort_q) ){
			swap(u_number,sort_q);
			break;
		}else{
			System.out.println("잘못입력하셨습니다.");
			continue;
		}
	}
	return sort_q;
}


static int[] swap(int[]u_number, String sort_q) {
	int temp;
	int w;
	
		if("오름차순".equals(sort_q) ){
			for(int i=0; i<u_number.length-1;i++) {
				for(int j=i+1; j<u_number.length;j++) {
					if(u_number[i] > u_number[j]) {
						temp = u_number[i];
						u_number[i] = u_number[j];
						u_number[j] = temp;
					}
				}
			}
		}else	 if("내림차순".equals(sort_q) ){
			for(int i=0; i<u_number.length-1;i++) {
				for(int j=i+1; j<u_number.length;j++) {
					if(u_number[i] < u_number[j]) {
						temp = u_number[i];
						u_number[i] = u_number[j];
						u_number[j] = temp;
					}
			}
		}
	}
		return u_number;
}
	
static void resultPrint(int[] u_number, String sort_q) {
	System.out.println(" ["+sort_q+"] ");
	for(int i=0; i<u_number.length;i++) {
		System.out.print("result : "+u_number[i]+"\t");
	}
}

}
