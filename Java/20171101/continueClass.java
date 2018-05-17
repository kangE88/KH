import java.util.Scanner;

class continueClass 
{
	public static void main(String[] args) 
	{
		/*
			continue : 생략

			for, while
		
			코드1
			코드2
			continue;
			코드3
				
		*/
		/*
		for (int i=0;i<10;i++){
			System.out.println("i = "+i);
			System.out.println("loop strat");

			if(i > 5){
				continue;
			}
			System.out.println("loop end");
		}
		

		int w = 0;

		while ( w < 10)
		{
			System.out.println("w = "+w);
			System.out.println("loop s");

			if(w >5){
				continue;
			}
			System.out.println("loop e");
			w++;
		}
*/
		//continue 

		//5개 숫자 입력 0< 입력숫자
		// -값 재입력 안내
		//합계 평균

		int num;
		int ww;
		int sum, avg;
		int count;
		int hu[];

		num = 0;
		ww = 0;

		sum = 0;
		avg = 0;

		count = 0;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("몇 개 입력 하시겠습니까 ? ");
		count = scan.nextInt();

		hu = new int[count];

		while(ww < hu.length){
			System.out.print("숫자 입력 하세요 : ");
			num = scan.nextInt();
			
			if(num <= 0){
				System.out.println("0보다 이하의 값은 입력이 불가능합니다.");
				continue;
			}
			
			//입력된 값 배열에 저장
			hu[ww] = num;
			
			//변수에 입력된 값 합산
			sum = sum + hu[ww];
			
			count++;
			ww++;
		}
		if(hu.length == 0){
			System.out.println("계산 할 수가 없습니다.");
			return;
		}

		avg = sum / hu.length;

		System.out.println("입력한 수의 합계는 ? : "+sum);
		System.out.println("입력한 수의 평균은 ? : "+avg);
	
	}
}
