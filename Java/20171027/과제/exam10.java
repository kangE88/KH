import java.util.Scanner;
import java.io.IOException;

class exam10 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		int myMoney, buyMoney, result;
		int w1, w2, w3, w4, w5, w6;
		int temp;
/*
		w1 =  5000;
		w2 =	1000;	
		w3 =	500;
		w4 =	100;
		w5 =	50;
		w6 = 10;
*/


		System.out.print("���� ������ �ִ� �ݾ��� ? ");
		myMoney = scan.nextInt();

		System.out.print("���� �� �ݾ� ? ");
		buyMoney = scan.nextInt();

		//����ݾ�-���ұݾ�
		result = myMoney-buyMoney;

		w1 = result / 5000;
		w2 = result % 5000 / 1000;
		w3 = result % 1000 / 500;
		w4 = result % 500 / 100;
		w5 = result % 100 / 50;
		w6 = result % 50 / 10;

		System.out.print(result +"�� <--���� ������");

		System.out.println("\n===========\n");
		System.out.println("5000�� " +w1+"��");
		System.out.println("1000�� "+w2+"��");
		System.out.println("500�� "+w3+"��");
		System.out.println("100�� "+w4+"��");
		System.out.println("50�� "+w5+"��");
		System.out.println("10�� "+w6+"��");
/*
		//5000
		temp = result;
		System.out.print("5000  =");
		System.out.println("  "+result/w1+"��\n");

		
		//5000���� ����
		result = temp-(result/w1*w1);

		//1000
		temp = result;
		System.out.print("1000  =");
		System.out.println("  "+result/w2+"��\n");

		//1000���� ����
		result = temp-(result/w2*w2);

		//500
		temp = result;
		System.out.print("500  =");
		System.out.println("  "+result/w3+"��\n");

		//500���� ����
		result = temp-(result/w3*w3);

		//100
		temp = result;
		System.out.print("100  =");
		System.out.println("  "+result/w4+"��\n");

		//100���� ����
		result = temp-(result/w4*w4);

		//50
		temp = result;
		System.out.print("50  =");
		System.out.println("  "+result/w5+"��\n");

		//50���� ����
		result = temp-(result/w5*w5);

		//10
		temp = result;
		System.out.print("10  =");
		System.out.println("  "+result/w6+"��\n");
*/

	}
}
