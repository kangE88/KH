class warapperClass 
{
	public static void main(String[] args) 
	{
		/*
			wrapper Class

			�Ϲ��ڷ��� -> Classȭ (Object)

			boolean  -> Boolean
			char		-> Character

			byte		-> Byte
			short		-> Short
			int			-> Integer -------->
			long		-> Long

			float		-> Float
			double	-> Double -------->

			char[]	-> String  -------->

			���� -> ���ڿ�
			valueOf( 'l' ); --> " l ";
			valueOf( 123 ); --> "123";
			valueOf( 234.5678 ); --> "234.5678";

			���� -> ���ڿ�
			toString()

			���ڿ� -> ����
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
			System.out.println("���� ���ڿ�");
		}else{
			System.out.println("�ٸ� ���ڿ�");
		}

		System.out.println("ch1 toString== "+ch1.toString());

		//Integer

		int i = 20;

		Integer iObj = new Integer( i );

		int num1 = iObj.intValue();

		System.out.println("num == "+num1);


		// ���� -> ���ڿ�

		System.out.println("iObj == "+(iObj.toString()+12));

		// ���ڿ� -> ����
		String str1 = "123";

		int num2 = Integer.parseInt( str1 );

		System.out.println("num2 == "+(num2+2));

		/////////////////////////////////////////////////

		//���� -> ���ڿ�
	
		Integer _num =1233;

		//String _str = _num.toString();
		String _str = ""+_num;

		System.out.println("_str === "+_str);

		//���ڿ� -> ����
		String _str1 = "234";

		int _num1 = Integer.parseInt( _str1 );

		System.out.println("_num1 == "+_num1);

		
		//�Ǽ� 

		Double d = 123.4567;
		Double d1 = new Double(123.4567);  //�� ���ΰ� ������ ��

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
