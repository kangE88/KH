import java.util.Scanner;
import java.util.Random;

class exam_3_20171103 
{
	public static void main(String[] args) 
	{
		int player;

		String hand[];
		String com_hand[];
		
		String t_hand;

		int hands_c;
		int com_count;

		int hand_p[];

		int h_result;

		int result;

		hand = new String[2];
		com_hand = new String[2];
		hand_p = new int[2];

		hands_c = 0;
		com_count = 0;
		h_result = 0;
		result = 0;

		Scanner scan = new Scanner(System.in);

		while(true){
			for(int i=0;i<2;i++){
				System.out.print("���� ���� ��  (�Է�) "+(i+1)+" / 2 ��° �Է� : ");
				hand[i] = scan.next();

				//�Է¹��� �� ���ڷ� ��ȯ
				if("����".equals(hand[i]) || "����".equals(hand[i]) || "��".equals(hand[i])){
					if(hand[i] == "����"){
						hand_p[i] = 0;
					}else if(hand[i] == "����"){
						hand_p[i] = 1;
					}else{
						hand_p[i] = 2;
					}
					//2�� �Է� ī��Ʈ
					hands_c++;
				}else{
					System.out.println("�ùٸ����� �Է��ϼ��� . (����, ����, ��)");
					continue;
				}
			}
			//2���Է� �� break;
			if(hands_c == 2){
				break;
			}
		}
		//�ϳ�����
		while(true){
			System.out.print("������ ���ðڽ��ϱ� ? : ");
			t_hand = scan.next();

			if("����".equals(t_hand)){
					h_result = 0;
			}else if("����".equals(t_hand)){
					h_result = 1;
			}else{
					h_result = 2;
			}
			
			System.out.println("h_result 1====="+h_result);

			//���� �� üũ
				if(hand_p[0] == h_result || hand_p[1] == h_result){
					System.out.println(t_hand+" �� ���� �Ͽ����ϴ�.");
					break;
				}else{
					System.out.println("�߸� ���� �Ͽ����ϴ�.");
					continue;
				}			
		}
	
		//com �� random 
		while(true){
			//com random �� �Է�
			for(int i=0;i<2;i++){
				com_count = ((int)(Math.random()*3));
				com_hand[i] = String.valueOf(com_count);
			}
			// ���� = 0 / ���� = 1 / �� = 2 /	
			System.out.println();

			if(com_count == 0){
				System.out.println("����");
			}else if(com_count == 1){
				System.out.println("����");
			}else if(com_count == 2){
				System.out.println("��");
			}
			break;
		}

		//p	c	result
//		result = 
			/*
				(���� == 0)(���� == 1)(�� == 2)

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

		result = ((com_count - h_result + 2)%3);

		if(result == 1){
			System.out.println("player win");
		}else if(result == 0){
			System.out.println("com win");		
		}else if(result == 2){
			System.out.println("draw");
		}

		


	}
}
