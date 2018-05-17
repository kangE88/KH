package sort;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// user 정렬할 갯수?
		String user_s_count;
		
		int u_count;
		
		int u_number[];
		
		int w;
		int temp;
		
		String sort_q;
		
		//init
		w=0;
		
		System.out.print("몇개의 숫자를 입력하시겠습니까? ");
		user_s_count = sc.next();
		
		u_count = Integer.parseInt(user_s_count);
		
		u_number = new int[u_count];
		
		// 숫자 입력 받기
		while(true) {
			while(w < u_count) {
				System.out.print(u_count+"개 숫자를 입력하세요. : " );
				u_number[w] = sc.nextInt();
				w++;
			}
			for(int i=0;i<u_count;i++) {
				System.out.print(u_number[i]+"\t");
			}
			
			// 오름 차순 or 내림차순
			System.out.print("\n\n오름차순? 내림차순?");
			sort_q = sc.next();
			
			//sorting
			if("오름차순".equals(sort_q) ){
				for(int i=0; i<u_number.length-1;i++) {
					for(int j=i+1; j<u_number.length;j++) {
						if(u_number[i] > u_number[j]) {
							temp = u_number[i];
							u_number[i] = u_number[j];
							u_number[j] = temp;
						}
					}
					break;
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
					break;
				}
			}else{
				System.out.println("잘못입력하셨습니다.");
				continue;
			}
			//result
			System.out.println(" ["+sort_q+"] ");
			for(int i=0; i<u_number.length;i++) {
				System.out.print("result : "+u_number[i]+"\t");
			}
		}
	}
}
