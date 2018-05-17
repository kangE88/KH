class operatorClass2 
{
	public static void main(String[] args) 
	{
		int num = 0;


		//논리연산

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

		//삼항 연산

		char c;
		int number = 0;
		int i;
		String str;

		c = (number > 0) ? 'Y' : 'N';
		System.out.println("c == "+ c);

		i = (number < 5) ? 1 : 0;
		System.out.println("i == "+ i);

		str = (number <= 10) ? "10보다 작다" : "10보다 크다";
		System.out.println("str == "+ str);

		System.out.println("\n=======================\n");

	}
}
