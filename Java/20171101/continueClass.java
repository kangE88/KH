import java.util.Scanner;

class continueClass 
{
	public static void main(String[] args) 
	{
		/*
			continue : ����

			for, while
		
			�ڵ�1
			�ڵ�2
			continue;
			�ڵ�3
				
		*/
		/*
		for (int i=0;i<10;i++){
			System.out.println("i = "+i);
			System.out.println("loop strat");

			if(i > 5){
				continue;
			}
			System.out.println("loop end");
		}
		

		int w = 0;

		while ( w < 10)
		{
			System.out.println("w = "+w);
			System.out.println("loop s");

			if(w >5){
				continue;
			}
			System.out.println("loop e");
			w++;
		}
*/
		//continue 

		//5�� ���� �Է� 0< �Է¼���
		// -�� ���Է� �ȳ�
		//�հ� ���

		int num;
		int ww;
		int sum, avg;
		int count;
		int hu[];

		num = 0;
		ww = 0;

		sum = 0;
		avg = 0;

		count = 0;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("�� �� �Է� �Ͻðڽ��ϱ� ? ");
		count = scan.nextInt();

		hu = new int[count];

		while(ww < hu.length){
			System.out.print("���� �Է� �ϼ��� : ");
			num = scan.nextInt();
			
			if(num <= 0){
				System.out.println("0���� ������ ���� �Է��� �Ұ����մϴ�.");
				continue;
			}
			
			//�Էµ� �� �迭�� ����
			hu[ww] = num;
			
			//������ �Էµ� �� �ջ�
			sum = sum + hu[ww];
			
			count++;
			ww++;
		}
		if(hu.length == 0){
			System.out.println("��� �� ���� �����ϴ�.");
			return;
		}

		avg = sum / hu.length;

		System.out.println("�Է��� ���� �հ�� ? : "+sum);
		System.out.println("�Է��� ���� ����� ? : "+avg);
	
	}
}
