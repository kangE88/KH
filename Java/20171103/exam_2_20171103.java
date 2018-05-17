import java.util.Scanner;
import java.util.Random;

class exam_2_20171103 
{
	public static void main(String[] args) 
	{
		//가위바위보 게임
	
		String hands, ui_hands;
		String regame;
		

		int  count;
		int regame_count;

		int p_win, u_win, draw;

		count = 0;
		regame_count =0;

		p_win = 0;
		u_win = 0;
		draw = 0;

		while(true){

			Scanner scan = new Scanner(System.in);
			
			System.out.println();
			System.out.println("========가위 바위 보 ======");

			//입력
			while(true){
				System.out.print(" 무엇을 내시겠습니까 ? (가위 바위 보) : ");
				hands = scan.next();

				if("가위".equals(hands) || "바위".equals(hands) || "보".equals(hands) ){
					break;
				}else{
					System.out.println();
					System.out.println("잘못입력하셨습니다. 가위, 바위, 보 셋 중 하나를 입력하셔야 합니다.");
					continue;
				}
			}

			//랜덤호출 ui 3 case
			ui_hands = "";
			count = ((int)(Math.random()*3));

			if(count == 0){
				ui_hands = "가위";
			}else if(count == 1){
				ui_hands = "바위";
			}else if( count == 2 ){
				ui_hands = "보";
			}

			System.out.println();

			//조건 출력
			if("가위".equals(hands) && "바위".equals(ui_hands)){
				System.out.println("나 = ["+hands+"]\t"+"UI =["+ui_hands+"]  로 UI가 이겼습니다."); 		//UI 승리 조건
				u_win++;
			}else if("바위".equals(hands) && "보".equals(ui_hands)){
				System.out.println("나 = ["+hands+"]\t"+"UI =["+ui_hands+"]  로 UI가 이겼습니다.");
				u_win++;
			}else if("보".equals(hands) && "가위".equals(ui_hands)){
				System.out.println("나 = ["+hands+"]\t"+"UI =["+ui_hands+"]  로 UI가 이겼습니다.");
				u_win++;
			}else if("가위".equals(ui_hands) && "바위".equals(hands)){
				System.out.println("나 = ["+hands+"]\t"+"UI =["+ui_hands+"]  로 player가 이겼습니다."); //player 승리 조건
				p_win++;
			}else if("바위".equals(ui_hands) && "보".equals(hands)){
				System.out.println("나 = ["+hands+"]\t"+"UI =["+ui_hands+"]  로 player가 이겼습니다.");
				p_win++;
			}else if("보".equals(ui_hands) && "가위".equals(hands)){
				System.out.println("나 = ["+hands+"]\t"+"UI =["+ui_hands+"]  로 player가 이겼습니다.");
				p_win++;
			}else 	if("가위".equals(hands) && "가위".equals(ui_hands)){
				System.out.println("나 = ["+hands+"]\t"+"UI =["+ui_hands+"]  로 비겼습니다.");
				draw++;
			}else 	if("바위".equals(hands) && "바위".equals(ui_hands)){
				System.out.println("나 = ["+hands+"]\t"+"UI =["+ui_hands+"]  로 비겼습니다.");
				draw++;
			}else 	if("보".equals(hands) && "보".equals(ui_hands)){
				System.out.println("나 = ["+hands+"]\t"+"UI =["+ui_hands+"]  로 비겼습니다.");
				draw++;
			}


			System.out.println();
			System.out.print("더 진행하시겠습니까? [ Y / N ] : ");

			regame = scan.next();

			System.out.println();

			if("Y".equals( regame ) || "y".equals( regame )){
				regame_count++;
				System.out.println("총 "+regame_count+"게임 진행 "+"win [ "+p_win+" ]"+"\t"+" lose [ "+u_win+" ]"+"\t"+"same [ "+draw+" ]");
				continue;
			}else{
				regame_count++;
				System.out.println();
				System.out.println("총 "+regame_count+"게임 진행 "+"win [ "+p_win+" ]"+"\t"+" lose [ "+u_win+" ]"+"\t"+"same [ "+draw+" ]");
				break;
			}

		}
	}
}
