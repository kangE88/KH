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


		System.out.print("현재 가지고 있는 금액은 ? ");
		myMoney = scan.nextInt();

		System.out.print("지불 할 금액 ? ");
		buyMoney = scan.nextInt();

		//현재금액-지불금액
		result = myMoney-buyMoney;

		w1 = result / 5000;
		w2 = result % 5000 / 1000;
		w3 = result % 1000 / 500;
		w4 = result % 500 / 100;
		w5 = result % 100 / 50;
		w6 = result % 50 / 10;

		System.out.print(result +"원 <--현재 소지금");

		System.out.println("\n===========\n");
		System.out.println("5000원 " +w1+"개");
		System.out.println("1000원 "+w2+"개");
		System.out.println("500원 "+w3+"개");
		System.out.println("100원 "+w4+"개");
		System.out.println("50원 "+w5+"개");
		System.out.println("10원 "+w6+"개");
/*
		//5000
		temp = result;
		System.out.print("5000  =");
		System.out.println("  "+result/w1+"장\n");

		
		//5000원권 제외
		result = temp-(result/w1*w1);

		//1000
		temp = result;
		System.out.print("1000  =");
		System.out.println("  "+result/w2+"장\n");

		//1000원권 제외
		result = temp-(result/w2*w2);

		//500
		temp = result;
		System.out.print("500  =");
		System.out.println("  "+result/w3+"개\n");

		//500원권 제외
		result = temp-(result/w3*w3);

		//100
		temp = result;
		System.out.print("100  =");
		System.out.println("  "+result/w4+"개\n");

		//100원권 제외
		result = temp-(result/w4*w4);

		//50
		temp = result;
		System.out.print("50  =");
		System.out.println("  "+result/w5+"개\n");

		//50원권 제외
		result = temp-(result/w5*w5);

		//10
		temp = result;
		System.out.print("10  =");
		System.out.println("  "+result/w6+"개\n");
*/

	}
}
