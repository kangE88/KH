import java.util.Scanner;

class  exam_t
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		int num;
		int max= 100;

		System.out.print("수 입력 : ");
		num = scan.nextInt();

		for (int i=0; i < max; i+=10 )
		{
			//55 <= 60
			if(num >= i && num < i+10){
				System.out.println("i = "+i);
				//System.out.println("num = "+num);
				System.out.println(num+"은 "+i+"보다 크고 "+(i+10)+"보다 작다.");
			}
		}
	}
}
