import java.util.Scanner;

class  exam_t
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		int num;
		int max= 100;

		System.out.print("�� �Է� : ");
		num = scan.nextInt();

		for (int i=0; i < max; i+=10 )
		{
			//55 <= 60
			if(num >= i && num < i+10){
				System.out.println("i = "+i);
				//System.out.println("num = "+num);
				System.out.println(num+"�� "+i+"���� ũ�� "+(i+10)+"���� �۴�.");
			}
		}
	}
}
