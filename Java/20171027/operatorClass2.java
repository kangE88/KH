class operatorClass2 
{
	public static void main(String[] args) 
	{
		int num = 0;


		//������

		//and
		System.out.println("num > 0 && num < 10 " + (num > 0 && num < 10));
		System.out.println("num < 0 && num < 10 " + (num < 0 && num < 10));
		System.out.println("num < 0 && num > 10 " + (num < 0 && num > 10));

		System.out.println("\n=====================================\n");

		//or
		System.out.println("num > 0 || num < 10 " + (num > 0 || num < 10));
		System.out.println("num < 0 || num < 10 " + (num < 0 || num < 10));
		System.out.println("num < 0 || num > 10 " + (num < 0 || num > 10));

		System.out.println("\n=====================================\n");

		//not
		System.out.println("!(num > 0) " + !(num > 0));
		System.out.println("!(num < 0) " + !(num < 0));
		System.out.println("!(num > 10) " + !(num > 10));
	
		System.out.println("!( num > 0 && num < 10 ) " + !( num > 0 || num < 10 ));
		System.out.println("!(num < 0 || num < 10 ) " + !(num < 0 || num < 10));

		System.out.println("\n=======================\n");

		//���� ����

		char c;
		int number = 0;
		int i;
		String str;

		c = (number > 0) ? 'Y' : 'N';
		System.out.println("c == "+ c);

		i = (number < 5) ? 1 : 0;
		System.out.println("i == "+ i);

		str = (number <= 10) ? "10���� �۴�" : "10���� ũ��";
		System.out.println("str == "+ str);

		System.out.println("\n=======================\n");

	}
}
