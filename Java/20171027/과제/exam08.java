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
		//inch 변환
		System.out.print("바꿀 inch= ");
		num = scan.nextInt();
		System.out.println(num+"inch 는 몇cm ? "+num*inch+" inch");

		//yard 변환
		System.out.print("바꿀 yard= ");
		num = scan.nextInt();
		System.out.println(num+"yard 는 몇 m ? "+num*yard+" m");
*/
		//mile 변환
		System.out.print("바꿀 mile= ");
		num = scan.nextInt();
		System.out.println(num+"mile 는 몇 km ? "+num*mile+" km");

/*
		String str, str2;

		System.out.println("변환 할 수치를 선택하십시오.(inch,yard,mile)\n");
		str = scan.next();
		System.out.println("변환 할 수치를 선택하십시오. (cm,m,km) \n");
		str2 = scan.next();


		if("inch".equals(str)){
			System.out.print("바꿀 cm= ");
			num = scan.nextInt();
			System.out.println(num+"cm 는 몇 inch ? "+num*inch);			
		}else if("yard".equals(str)){
			System.out.print("바꿀 yard= ");
			num = scan.nextInt();
			System.out.println(num+"yard 는 몇 m ? "+num*yard);
		}else{
			System.out.print("바꿀 mile= ");
			num = scan.nextInt();
			System.out.println(num+"mile 는 몇 km ? "+num*mile);
		}
*/

	}
}
