import java.util.Scanner;
import java.util.Random;

class gbbGame 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// 가위, 바위, 보 게임을 작성하시오.
		// 컴퓨터는 Random으로 수를 할당합니다.

		// 문자입력 검사
		// 숫자입력 검사
		// ?승 ?패 ?무 -> 10전

		// 가위/바위/보
		// user == 입력
		// com == random

		// 선언부
		int userNum, comNum;
		int win, lose, draw;
		String aw;

		win = lose = draw = 0;

		System.out.println("----------<가위, 바위, 보>-----------");

		while(true){
						
			System.out.println("Game Start >>");

			//////////////////////////// input
			// user
			// 0 ~ 2 (가위 == 0)(바위 == 1)(보 == 2)
			
			System.out.print("입력해 주십시오(가위=0 바위=1 보=2)= ");
			userNum = sc.nextInt();
			// 검사

			// com 
			comNum = (int)(Math.random() * 3);	
			////////////////////////////

			//////////////////////////// 판정
			/*
				(가위 == 0)(바위 == 1)(보 == 2)

				com		user		win	-> 1
				2	-	0   + 2 =	4	% 3	-> 1
				0	-	1	+ 2	=	1	% 3
				1	-	2	+ 2	=	1	% 3

				com		user		lose -> 0
				0	-	2	+ 2 =	0	% 3	-> 0
				1	-	0	+ 2 =	3	% 3
				2	-	1	+ 2 =	3	% 3

				com		user		draw -> 2	
				0	-	0	+ 2 =	2	% 3
				1	-	1	+ 2	=	2	% 3
				2	-	2	+ 2 =	2	% 3
			*/

			int result = (comNum - userNum + 2) % 3;

			String userStr = "";
			String comStr = "";

			String resultStr = "";

			switch( result ){
				case 1:		// 승
					win++;
					resultStr = "승리!!";
					break;
				case 0:		// 패
					lose++;
					resultStr = "패배~";
					break;
				case 2:		// 무
					draw++;
					resultStr = "비겼음..";
					break;
			}

			if(userNum == 0)		userStr = "가위";			
			else if(userNum == 1)	userStr = "바위";			
			else					userStr = "보";

			if(comNum == 0)			comStr = "가위";			
			else if(comNum == 1)	comStr = "바위";			
			else					comStr = "보";
			
			
			// 결과 출력
			System.out.println("User:" + userStr + " Com:" + comStr);
			System.out.println("판정:" + resultStr);
			
			System.out.println(win + "승 " + lose + "패 " + draw + "무"); 

			
			// 한판 더?
			System.out.print("한판 더 하시겠습니까? (y/n)= ");
			aw = sc.next();

			if(aw.equals("n") || aw.equals("N")){
				System.out.println("안녕히 가십시오");
				break;
			}
			
			System.out.println("다시 시작합니다");
		}


	}
}
