import java.util.Scanner;

class exam09 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		int x, y, z;

		System.out.println("(x-y)/(z-y) = ���Ŀ� �� ���ڸ� �����Ͻʽÿ�\n");
		System.out.print("x = ");
		x = scan.nextInt();
		System.out.print("y = ");
		y = scan.nextInt();
		System.out.print("z = ");
		z = scan.nextInt();
		System.out.println("("+x+"-"+y+")"+"/"+"("+z+"-"+y+") = "+(x-y)/(z-y));
	}
}
