import java.util.Random;

class sdClass 
{
	public static void main(String[] args) 
	{
		//player, com
		//card 2 (�� 20��)  1 - 10
		//�� -> 1

		// 1 2 
		// 1 4
		// 1 9
		// 1 10
		// 4 10
		// 4 6

		//card + card % 10
		//win lose ��� ����

		//swap

		// init

		//random

		//card �Ҵ�

		//��

		//�� - ��

		//�絵��

		int player_c[]; 
		int com_c[];

		int w, r;

		int 1st_result;
		int 2st_result;
		int 3st_result;

		player_c = new int[2];
		com_c = new int[2];

		boolean swit[];

		swit = new boolean[20];

		1st_result=0;
		2st_result=0;
		3st_result=0;

		//�ʱ�ȭ
		for(int i=0;i<swit.length;i++){
			swit[i] = false;
		}

		w=0;
		//player
		while(w < 2){
			r= (int)(Math.random()*20); //0-19
			if(!swit[r]){
				swit[r] =true;
					r = r % 10;
					player_c[w] = r+1;
					w++;
			}
		}
		for(int i=0;i<2;i++){
			System.out.println("player_c : "+player_c[i]);
		}

		if(player_c[0] == player_c[1]){
			System.out.println("same");
		}

		System.out.println();

		w=0;
		//com
		while(w < 2){
			r= (int)(Math.random()*20); //0-19
			if(!swit[r]){
				swit[r] =true;
					r = r % 10;
					com_c[w] = r+1;
					w++;
			}
		}
		for(int i=0;i<2;i++){
			System.out.println("com_c : "+com_c[i]);
		}

		if(com_c[0] == com_c[1]){
			System.out.println("same");
		}

		//��������
		for(int i=0;i<2;i++){
			if(player_c[i] == player_c){
			}
		}

	}
}
