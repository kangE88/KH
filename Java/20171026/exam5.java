class exam5 
{
	public static void main(String[] args) 
	{
		//변수선언
		int x, y;
		int temp;

		x=1;
		y=2;

		//result
		System.out.println("\n===========================\n");
		System.out.println("변환 전 x="+x + "\n" + "변환 전 y="+y);
		System.out.println("\n===========================\n");

		//change result

		temp = x;
		x = y;
		y = temp;

		System.out.println("변환 후 x="+x + "\n" + "변환 후 y="+y);
		System.out.println("\n===========================\n");

	}
}
