class exam12 
{
	public static void main(String[] args) 
	{
		int num1, num2;

		num1 = 128; 
		num2 = 56;

		//num1 = 1000 0000
		//num2 = 0011 1000
	
		//num1 = 0000 0000

		System.out.printf("%02x",128);
		System.out.println();
		System.out.printf("%02x",56);
		System.out.println();

		// 0000 0000 | 0000 0000
		num1 = (num1 & num2) | (num1 & num2);


		// 1100 0111
		num2 = ~(num1 ^ num2);

		System.out.println(num1);
		System.out.println(num2);
	}
}
