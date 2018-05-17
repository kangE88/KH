import java.util.Scanner;

class exam_20171103 
{
	public static void main(String[] args) 
	{
		
		int number[];

		int min, max;

		int w;

		String str[];
		
		int oper;

		number = new int[10];
		str = new String[10];

		min = 0;
		max = 0;
	
		Scanner scan = new Scanner(System.in);


		
		w = 0;
		while(w < 10){
			// 1- 100 수 입력 받기

			System.out.print("1- 100 사이 숫자를 입력하세요 : ");
			str[w] = scan.next();


			oper = str[w].charAt(0);

			/*
			if(oper > 47 && oper < 57){
				System.out.println(oper);
			}
			*/

			if(oper > 47 && oper < 58){
				w++;
			}else{
				System.out.println("\n==================================");
				System.out.println("1- 100 사이의 숫자를 입력하십시오.");
				System.out.println("==================================\n");
				continue;
			}
		}
		
		

		// 최소값
		min = number[0];
		for(int i=0;i<number.length;i++){
			number[i] = Integer.parseInt(str[i]);
			if(min > number[i]){
				min = number[i];
			}
		}

		// 최대값
		max = number[0];
		for(int i=0;i<number.length;i++){
			number[i] = Integer.parseInt(str[i]);
			if(max < number[i]){
				max = number[i];
			}
		}

		//결과
		System.out.println("10개 숫자 입력 중 최소값 = "+min);
		System.out.println("10개 숫자 입력 중 최대값 = "+max);
	}
}
