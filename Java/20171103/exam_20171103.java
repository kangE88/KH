import java.util.Scanner;

class exam_20171103 
{
	public static void main(String[] args) 
	{
		
		int number[];

		int min, max;

		int w;

		String str[];
		
		int oper;

		number = new int[10];
		str = new String[10];

		min = 0;
		max = 0;
	
		Scanner scan = new Scanner(System.in);


		
		w = 0;
		while(w < 10){
			// 1- 100 �� �Է� �ޱ�

			System.out.print("1- 100 ���� ���ڸ� �Է��ϼ��� : ");
			str[w] = scan.next();


			oper = str[w].charAt(0);

			/*
			if(oper > 47 && oper < 57){
				System.out.println(oper);
			}
			*/

			if(oper > 47 && oper < 58){
				w++;
			}else{
				System.out.println("\n==================================");
				System.out.println("1- 100 ������ ���ڸ� �Է��Ͻʽÿ�.");
				System.out.println("==================================\n");
				continue;
			}
		}
		
		

		// �ּҰ�
		min = number[0];
		for(int i=0;i<number.length;i++){
			number[i] = Integer.parseInt(str[i]);
			if(min > number[i]){
				min = number[i];
			}
		}

		// �ִ밪
		max = number[0];
		for(int i=0;i<number.length;i++){
			number[i] = Integer.parseInt(str[i]);
			if(max < number[i]){
				max = number[i];
			}
		}

		//���
		System.out.println("10�� ���� �Է� �� �ּҰ� = "+min);
		System.out.println("10�� ���� �Է� �� �ִ밪 = "+max);
	}
}
