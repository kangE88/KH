import java.util.Scanner;
import java.util.Random;

class exam_4_20171103 
{
	public static void main(String[] args) 
	{
		//random number
		//user input
		//find y/n -- 범위값  ~보다 크다 ~보다 작다 , 검색 횟수 지정(10회)
		//regame y/n

		int user_input;

		int random;

		int w;

		Scanner scan = new Scanner(System.in);

		random = ((int)(Math.random()*100)+1);

		System.out.println("random == "+random);
		
		w = 0;
		while(w <10){
			System.out.println();
			System.out.println("====random 숫자 맞추기 (10번 안에 맞추셔야 합니다.)=====\n");
			System.out.print("임의 숫자 입력 : ");
			user_input = scan.nextInt();

				if(user_input == random){
					System.out.println("=========================================");
					System.out.println("정답 입니다.");
					System.out.println("=========================================");
					break;
				}else{
					if(user_input > random){
						System.out.println("=========================================");
						System.out.println("\n남은 도전 횟수 : " +( 9 - w ) + "\n\n");
						System.out.println("=========================================");
						System.out.println(user_input+"보다 작습니다.");
						System.out.println("=========================================");					
						w++;
					}else if(user_input < random){
						System.out.println("=========================================");
						System.out.println("\n남은 도전 횟수 : " +( 9 - w ) + "\n\n");
						System.out.println("=========================================");
						System.out.println(user_input+"보다 큽니다.");
						System.out.println("=========================================");
						w++;
					}
				}
			}
	}
}
