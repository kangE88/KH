import java.util.Scanner;

class exam_4_20171031 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		int num;
		int max= 100;

		System.out.print("�� �Է� : ");
		num = scan.nextInt();

		/*
		 if(num > 0 && num <=10){
			System.out.println();
		 } ---
		*/

		int _num = 0;

		for(int i=0;i<10;i++){
			_num = 10*i;
			if(num > _num && num <=(_num+10)){
				System.out.println("--> "+num+"�� "+_num+"���� ũ�� "+(_num+10)+"���� �۴�.");
			}
		}
/*
		for (int i=0; i < max; i+=10 )
		{
			if(num >= i && num < i+10){
				System.out.println("--> "+num+"�� "+i+"���� ũ�� "+(i+10)+"���� �۴�.");
			}
		}
*/
	}
}