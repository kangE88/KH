import	java.util.Scanner;
import    java.util.InputMismatchException;

class scanClass 
{
	public static void main(String[] args) 
	{
		//입력
		Scanner scan = new Scanner(System.in);
		//console 창에서 입력

/*
		//bollean
		boolean b;
		
		System.out.print("b==");
		b = scan.nextBoolean();
		System.out.println("b=="+b);

		//int 정수
		int number;

		System.out.print("number==");
		number = scan.nextInt();
		System.out.println("number=="+number);


		//double 실수
		double d;

		System.out.print("double==");
		d = scan.nextDouble();
		System.out.println("double=="+d);

*/
		// String 문자열
		String str, str2;
	
		System.out.print("str==");
		str = scan.nextLine();
		System.out.println("str=="+str);

		

		System.out.print("str2==");
		str2 = scan.nextLine();
		System.out.println("str2=="+str2);


	}
}
