import java.util.Scanner;
import java.util.Random;

class gbbGame 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// ����, ����, �� ������ �ۼ��Ͻÿ�.
		// ��ǻ�ʹ� Random���� ���� �Ҵ��մϴ�.

		// �����Է� �˻�
		// �����Է� �˻�
		// ?�� ?�� ?�� -> 10��

		// ����/����/��
		// user == �Է�
		// com == random

		// �����
		int userNum, comNum;
		int win, lose, draw;
		String aw;

		win = lose = draw = 0;

		System.out.println("----------<����, ����, ��>-----------");

		while(true){
						
			System.out.println("Game Start >>");

			//////////////////////////// input
			// user
			// 0 ~ 2 (���� == 0)(���� == 1)(�� == 2)
			
			System.out.print("�Է��� �ֽʽÿ�(����=0 ����=1 ��=2)= ");
			userNum = sc.nextInt();
			// �˻�

			// com 
			comNum = (int)(Math.random() * 3);	
			////////////////////////////

			//////////////////////////// ����
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

			int result = (comNum - userNum + 2) % 3;

			String userStr = "";
			String comStr = "";

			String resultStr = "";

			switch( result ){
				case 1:		// ��
					win++;
					resultStr = "�¸�!!";
					break;
				case 0:		// ��
					lose++;
					resultStr = "�й�~";
					break;
				case 2:		// ��
					draw++;
					resultStr = "�����..";
					break;
			}

			if(userNum == 0)		userStr = "����";			
			else if(userNum == 1)	userStr = "����";			
			else					userStr = "��";

			if(comNum == 0)			comStr = "����";			
			else if(comNum == 1)	comStr = "����";			
			else					comStr = "��";
			
			
			// ��� ���
			System.out.println("User:" + userStr + " Com:" + comStr);
			System.out.println("����:" + resultStr);
			
			System.out.println(win + "�� " + lose + "�� " + draw + "��"); 

			
			// ���� ��?
			System.out.print("���� �� �Ͻðڽ��ϱ�? (y/n)= ");
			aw = sc.next();

			if(aw.equals("n") || aw.equals("N")){
				System.out.println("�ȳ��� ���ʽÿ�");
				break;
			}
			
			System.out.println("�ٽ� �����մϴ�");
		}


	}
}
