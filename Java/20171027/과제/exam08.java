import java.util.Scanner;

class exam08 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		int num;
		double inch,yard,mile;

		inch = 2.54;
		yard = 0.3048;
		mile = 1.6093;

/*
		//inch ��ȯ
		System.out.print("�ٲ� inch= ");
		num = scan.nextInt();
		System.out.println(num+"inch �� ��cm ? "+num*inch+" inch");

		//yard ��ȯ
		System.out.print("�ٲ� yard= ");
		num = scan.nextInt();
		System.out.println(num+"yard �� �� m ? "+num*yard+" m");
*/
		//mile ��ȯ
		System.out.print("�ٲ� mile= ");
		num = scan.nextInt();
		System.out.println(num+"mile �� �� km ? "+num*mile+" km");

/*
		String str, str2;

		System.out.println("��ȯ �� ��ġ�� �����Ͻʽÿ�.(inch,yard,mile)\n");
		str = scan.next();
		System.out.println("��ȯ �� ��ġ�� �����Ͻʽÿ�. (cm,m,km) \n");
		str2 = scan.next();


		if("inch".equals(str)){
			System.out.print("�ٲ� cm= ");
			num = scan.nextInt();
			System.out.println(num+"cm �� �� inch ? "+num*inch);			
		}else if("yard".equals(str)){
			System.out.print("�ٲ� yard= ");
			num = scan.nextInt();
			System.out.println(num+"yard �� �� m ? "+num*yard);
		}else{
			System.out.print("�ٲ� mile= ");
			num = scan.nextInt();
			System.out.println(num+"mile �� �� km ? "+num*mile);
		}
*/

	}
}
