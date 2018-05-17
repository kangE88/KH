import java.util.Scanner;

class exam09 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		int x, y, z;

		System.out.println("(x-y)/(z-y) = 공식에 들어갈 숫자를 선택하십시오\n");
		System.out.print("x = ");
		x = scan.nextInt();
		System.out.print("y = ");
		y = scan.nextInt();
		System.out.print("z = ");
		z = scan.nextInt();
		System.out.println("("+x+"-"+y+")"+"/"+"("+z+"-"+y+") = "+(x-y)/(z-y));
	}
}
