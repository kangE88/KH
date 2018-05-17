import java.util.Scanner;
import java.util.Random;

class baseball 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int r_num[];
		int u_num[];

		int strike;
		int ball;

		int w;

		int loop;
		String re;

		strike = 0;
		ball = 0;

		r_num = new int[3];
		u_num = new int[3];

		loop = 0;


			while(true){
				//랜덤 숫자 3개 생성
				for(int i=0; i<3; i++){
					r_num[i] = (int)(Math.random()*9)+1;
				}
			
				//중복체크
				if(r_num[0] != r_num[1]&& r_num[1] != r_num[2] && r_num[2] != r_num[0]){
					break;
				}
			}

			System.out.println("======= 문제 =======");
			System.out.print(" "+r_num[0]+" ");
			System.out.print(" "+r_num[1]+" ");
			System.out.print(" "+r_num[2]+" ");
			
			System.out.println();


			//user_input
			//System.out.print("입력할 숫자 ? : ");
			//u_num[0] = sc.nextInt();

			while(loop < 10){

				//초기화 
				strike = 0;
				ball = 0;
				w = 0;
				while(w < 3){
					System.out.print("입력할 숫자 ? : ");
					u_num[w] = sc.nextInt();

					//생성된 숫자 검사 후 재생성
					if(w != 0){
						if( u_num[0] == u_num[1] || u_num[1] == u_num[2] ||  u_num[2] == u_num[0]){
							System.out.println("다시 입력하세요. 중복 입력 불가.");
							continue;
						}
					}
					w++;
				}

				//	strike ball count
				for(int i=0;i<3;i++){
					for(int j=0;j<3;j++){
						if(u_num[i] == r_num[j]){
							if( i == j ){
								strike++;
							}else{
								ball++;
							}
						}
					}
				}

				//검증
				if(strike > 2){
					System.out.println("정답!");
					break;
				}else{
					System.out.println(" ==> "+strike+" 스트라이크 "+ball+" 볼 ");
				}
				loop++;
			}
	}
}