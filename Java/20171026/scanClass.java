import	java.util.Scanner;
import    java.util.InputMismatchException;

class scanClass 
{
	public static void main(String[] args) 
	{
		//�Է�
		Scanner scan = new Scanner(System.in);
		//console â���� �Է�

/*
		//bollean
		boolean b;
		
		System.out.print("b==");
		b = scan.nextBoolean();
		System.out.println("b=="+b);

		//int ����
		int number;

		System.out.print("number==");
		number = scan.nextInt();
		System.out.println("number=="+number);


		//double �Ǽ�
		double d;

		System.out.print("double==");
		d = scan.nextDouble();
		System.out.println("double=="+d);

*/
		// String ���ڿ�
		String str, str2;
	
		System.out.print("str==");
		str = scan.nextLine();
		System.out.println("str=="+str);

		

		System.out.print("str2==");
		str2 = scan.nextLine();
		System.out.println("str2=="+str2);


	}
}
