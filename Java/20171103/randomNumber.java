import java.util.Scanner;
import java.util.Random;

class randomNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int r_num, u_num;
		boolean clear;
		int w;
		String replay;

		//random Number

		//init(초기화)
		clear = false;

		while(true){
			//랜덤 번호 받기
			r_num = (int)(Math.random() * 100)+1; //1 - 100

			System.out.println(r_num);

			w =0;
			while(w<10){
				//user input
				System.out.println("1-100 사이 수 입력 : ");
				u_num = sc.nextInt();

				//fint number (loop)
				if(u_num  > r_num){
					System.out.println("너무 큽니다.");
				}else if(u_num  < r_num){
					System.out.println("너무 작습니다.");
				}else{
					System.out.println("정답입니다.");
					clear = true;
					break;
				}
				w++;
			}

			//message

			//result
			if(clear){
				System.out.println("게임클리어");
			}else{
				System.out.println("게임오버");
			}

			System.out.println("한판 더 ?(Y/N) - ");
			replay = sc.next();

			if(replay.equals("N") || replay.equals("n")){
				break;
			}

			System.out.println("다시 시작합니다.");
		}
	}
}
