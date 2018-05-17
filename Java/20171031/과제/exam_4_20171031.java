import java.util.Scanner;

class exam_4_20171031 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		int num;
		int max= 100;

		System.out.print("수 입력 : ");
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
				System.out.println("--> "+num+"은 "+_num+"보다 크고 "+(_num+10)+"보다 작다.");
			}
		}
/*
		for (int i=0; i < max; i+=10 )
		{
			if(num >= i && num < i+10){
				System.out.println("--> "+num+"은 "+i+"보다 크고 "+(i+10)+"보다 작다.");
			}
		}
*/
	}
}