class warapperClass 
{
	public static void main(String[] args) 
	{
		/*
			wrapper Class

			일반자료형 -> Class화 (Object)

			boolean  -> Boolean
			char		-> Character

			byte		-> Byte
			short		-> Short
			int			-> Integer -------->
			long		-> Long

			float		-> Float
			double	-> Double -------->

			char[]	-> String  -------->

			숫자 -> 문자열
			valueOf( 'l' ); --> " l ";
			valueOf( 123 ); --> "123";
			valueOf( 234.5678 ); --> "234.5678";

			숫자 -> 문자열
			toString()

			문자열 -> 숫자
		*/

		String str = "";

		int num = 123;

		//str = str +num+1;

		str = String.valueOf(num);

		System.out.println("str == "+str);


		Character ch1;
		ch1 = new Character('A');
		ch1 = 'A';

		char c= 'A';

		System.out.println("ch1 == " + ch1 );

		Character ch2 = new Character( 'B' );

		if(ch1.equals( ch2 )){
			System.out.println("같은 문자열");
		}else{
			System.out.println("다른 문자열");
		}

		System.out.println("ch1 toString== "+ch1.toString());

		//Integer

		int i = 20;

		Integer iObj = new Integer( i );

		int num1 = iObj.intValue();

		System.out.println("num == "+num1);


		// 숫자 -> 문자열

		System.out.println("iObj == "+(iObj.toString()+12));

		// 문자열 -> 숫자
		String str1 = "123";

		int num2 = Integer.parseInt( str1 );

		System.out.println("num2 == "+(num2+2));

		/////////////////////////////////////////////////

		//숫자 -> 문자열
	
		Integer _num =1233;

		//String _str = _num.toString();
		String _str = ""+_num;

		System.out.println("_str === "+_str);

		//문자열 -> 숫자
		String _str1 = "234";

		int _num1 = Integer.parseInt( _str1 );

		System.out.println("_num1 == "+_num1);

		
		//실수 

		Double d = 123.4567;
		Double d1 = new Double(123.4567);  //윗 라인과 동일한 뜻

		System.out.println("d == "+d);
	
		String _str2 ="345.6789";

		double d2 = Double.parseDouble( _str2 );

		System.out.println("d2 == "+ d2);

		//ASCII

		char c1 = '0';

		System.out.println("c1 == "+c1);
		System.out.println("c1 == "+(int)c1);



	}
}
