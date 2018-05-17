import java.util.Scanner;

class scannerTest 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		boolean  age;
		System.out.print("age : ");
		age = scan.hasNextInt();
		
		System.out.println("age ==="+age);

	}
}
