import java.util.Scanner;
import java.util.Random;
class  arrayClass
{
	public static void main(String[] args) 
	{
		// Array : ���� �ڷ����� ����

		//����								       ����
		// �ڷ��� �迭������[] = new �ڷ���[�迭 ����];
		// �ڷ���[] �迭������ ==
 		// �ڷ��� []�迭������ ==
		// ���� : 0 - (�迭����-1)   5  0 1 2 3 4

		// �迭������[0] �迭������[1] --

// stack					heap						static							system
//							8Line ����� ���̴±���			
//							new ~
		int num1, num2, num3, num4, num5;

		int arrNum[] = new int[5];

		arrNum[0] = 11;
		arrNum[1] = 22;
		arrNum[2] = 33;
		arrNum[3] = 44;
		arrNum[4] = 55;

		System.out.println("arrNum[2] = "+arrNum[0]);
		System.out.println("arrNum[2] = "+arrNum[1]);
		System.out.println("arrNum[2] = "+arrNum[2]);
		System.out.println("arrNum[2] = "+arrNum[3]);
		System.out.println("arrNum[2] = "+arrNum[4]);

		int arrNum1[];

		arrNum1 = new int[3];

		int count;
		int myArr[];

		Scanner scan = new Scanner(System.in);

		System.out.print("��� �Է��Ͻðڽ��ϱ�? = ");
		count = scan.nextInt();

		myArr = new int[count];

		// myArr.length; �迭�� ����

		System.out.println("�迭�� ���� = "+myArr.length);

		char arrC[] = new char[10];

		arrC[0] ='H';
		arrC[1] ='e';
		arrC[2] ='l';
		arrC[3] ='l';
		arrC[4] ='o';

		System.out.println(""+arrC[0]+arrC[1]+arrC[2]+arrC[3]+arrC[4]);

		char arrC1[] = {'A','B', 'C'}; // �迭 �ʱ�ȭ

		System.out.println(""+arrC1[0]+arrC1[1]);

		int arrNum2[] = {10, 20, 30, 40, 50};

		//0 ~ 4
		System.out.println(""+arrNum2[0]+arrNum2[1]+arrNum2[2]+arrNum2[3]+arrNum2[4]);

		String []arrStr = {"abc","def","ghi"};

		System.out.println(arrStr[1]);

		//�迭 ����
		int numArr[] = {111, 222, 333};
		int _myArr[];
		_myArr = numArr;

		System.out.println(numArr[0]);
		System.out.println(numArr[1]);
		System.out.println(numArr[2]);

		_myArr[1] = 444;
		System.out.println(numArr[1]);

		System.out.println("\n================\n");

		// 1~ 45 random 6�� 
		// �迭6

		int	 randomArr[];
		randomArr = new int[6];

		/*
		for (int i=0;i<6 ;i++)
		{
			randomArr[i] = (int)(Math.random()*45)+1; 
		}
		*/
		
		randomArr[0] = (int)(Math.random()*45)+1;
		randomArr[1] = (int)(Math.random()*45)+1;
		randomArr[2] = (int)(Math.random()*45)+1;
		randomArr[3] = (int)(Math.random()*45)+1;
		randomArr[4] = (int)(Math.random()*45)+1;
		randomArr[5] = (int)(Math.random()*45)+1;
		
		System.out.println(randomArr[0]);
		System.out.println(randomArr[1]);
		System.out.println(randomArr[2]);
		System.out.println(randomArr[3]);
		System.out.println(randomArr[4]);
		System.out.println(randomArr[5]);

	}
}
