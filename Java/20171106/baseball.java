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
				//���� ���� 3�� ����
				for(int i=0; i<3; i++){
					r_num[i] = (int)(Math.random()*9)+1;
				}
			
				//�ߺ�üũ
				if(r_num[0] != r_num[1]&& r_num[1] != r_num[2] && r_num[2] != r_num[0]){
					break;
				}
			}

			System.out.println("======= ���� =======");
			System.out.print(" "+r_num[0]+" ");
			System.out.print(" "+r_num[1]+" ");
			System.out.print(" "+r_num[2]+" ");
			
			System.out.println();


			//user_input
			//System.out.print("�Է��� ���� ? : ");
			//u_num[0] = sc.nextInt();

			while(loop < 10){

				//�ʱ�ȭ 
				strike = 0;
				ball = 0;
				w = 0;
				while(w < 3){
					System.out.print("�Է��� ���� ? : ");
					u_num[w] = sc.nextInt();

					//������ ���� �˻� �� �����
					if(w != 0){
						if( u_num[0] == u_num[1] || u_num[1] == u_num[2] ||  u_num[2] == u_num[0]){
							System.out.println("�ٽ� �Է��ϼ���. �ߺ� �Է� �Ұ�.");
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

				//����
				if(strike > 2){
					System.out.println("����!");
					break;
				}else{
					System.out.println(" ==> "+strike+" ��Ʈ����ũ "+ball+" �� ");
				}
				loop++;
			}
	}
}