class bitClass 
{
	public static void main(String[] args) 
	{
		/*
			bit : 0 , 1

			&	AND
			|	OR
			^	XOR
			<< left Shift
			>> right Shift
			~  NOT
		*/

		int num;

		System.out.println("\n=======================\n");

		//and
		num = 0xD3 & 0xF0;
		//16
		System.out.printf("%x \n", num); 
		//10
		System.out.printf("%d \n", num); 
	
		System.out.println("\n=======================\n");
			
		//or
		num = 0xD3 | 0xF0;
		//16
		System.out.printf("%x \n", num); 
		//10
		System.out.printf("%d \n", num); 	

		System.out.println("\n=======================\n");

		//xor
		num = 0xD3 ^ 0xF0;
		//16
		System.out.printf("%x \n", num); 
		//10
		System.out.printf("%d \n", num); 	

		System.out.println("\n=======================\n");

		// ~ 반전
		// 0 -> 1 , 1-> 0
		num = ~0x55; 
		//16
		System.out.printf("%x \n", num); 
		//10
		System.out.printf("%d \n", num); 	

		System.out.println("\n=======================\n");

		// left Shift <<  x2값 출력 얻음
		byte b1;	

		b1 = 0x1 << 3;

		System.out.println("b1=="+b1);

		System.out.println("\n=======================\n");

		// right Shift >> /2값 출력 얻음

		b1 = 0x8 >> 2;

		System.out.println("b1=="+b1);


		System.out.println("\n=======================\n");



	}
}
