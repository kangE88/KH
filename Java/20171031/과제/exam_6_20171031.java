import java.util.Scanner;

class exam_6_20171031 
{
	public static void main(String[] args) 
	{
		int number;
		
		Scanner scan = new Scanner(System.in);

		System.out.print("������ ��� (���ϴ� �ܼ��� ����) : ");
		number = scan.nextInt();

		for (int j=1;j<10;j++){
			System.out.println(number+" x "+j+" = "+number*j);
		}
		System.out.println();
	}
}
