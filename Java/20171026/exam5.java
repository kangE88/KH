class exam5 
{
	public static void main(String[] args) 
	{
		//��������
		int x, y;
		int temp;

		x=1;
		y=2;

		//result
		System.out.println("\n===========================\n");
		System.out.println("��ȯ �� x="+x + "\n" + "��ȯ �� y="+y);
		System.out.println("\n===========================\n");

		//change result

		temp = x;
		x = y;
		y = temp;

		System.out.println("��ȯ �� x="+x + "\n" + "��ȯ �� y="+y);
		System.out.println("\n===========================\n");

	}
}
