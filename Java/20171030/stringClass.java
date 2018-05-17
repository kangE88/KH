class stringClass 
{
	public static void main(String[] args) 
	{
		/*
			Str��ng ���ڿ� ����, ����, ��������,
			Array ���� length
		
		*/
		String str; // String Ŭ���� == Object (��ü)
		//str == ����, Ŭ������ ����(instance== ��ü)

		str = "Hello";
		System.out.println("str== "+str);

		String str1 = new String ("Hello");
		System.out.println("str1== "+str1);
		
		String str2 = "Hello";
		System.out.println("str2== "+str2);

		String str3;
		char data[] = {'H','e','l','l','o'};
		str3 = new String (data);

		System.out.println("str3 == "+str3);

		String str4 = str1 + str2;

		System.out.println("str4 == "+str4);

		/*
			class �ΰ�
			��� (�Լ� == method)
			�Դ�,
			�ȴ�,
			�����ϴ�
		*/
		
		// ���Լ� equals
		String str5, str6;

		str5 = "Hello";
		str6 = "Hell";

		str6 = str6 + "o"; // Hello

		if(str5 == str6){
			System.out.println("str5 == str6 ����");
		}else{
			System.out.println("");
		}

		boolean b = str5.equals(str6);

		System.out.println("b== "+b);

		// indexOf Ư�� ���ڰ� ���° ��ġ�ϴ��� ���ڷ� ��Ÿ�� (�����κ���)
		// char arr[] = "Hello"; 

		String str7 = "abc123abc";
		
		int i = str7.indexOf("c");

		System.out.println("i = "+i); //���ڿ��� ��ã���� -1 ����

		// indexOf Ư�� ���ڰ� ���° ��ġ�ϴ��� ���ڷ� ��Ÿ�� (�ڷκ���)
		i = str7.lastIndexOf("C");
		System.out.println("i = "+i);  //���ڿ��� ��ã���� -1 ����

		// length
		int len = str7.length();

		System.out.println("len== "+len);

		// �Լ�  return �� = �Լ���(�μ�, ����, parameter)
		// �Լ���(�μ�1, �μ�2) �μ� == ���°�

		String _str = null;

		len = "Hello world".length(); // nul(/0) null
		System.out.println("len== "+len);

		// replace(����)
		str7 = "A*B*C*D";

		String repStr = str7.replace("*","");

		System.out.println("repStr == "+repStr);

		str7 = "�� �� �� �� �� �� �� �� �� �� ī Ÿ �� ��";

		repStr = str7.replace(" ","");
		System.out.println("repStr == "+repStr);

		/*
			split = tokken�� Ȱ���ؼ� ���ڿ��� �ڸ��� �۾�
			
			ȫ�浿-24-2000/01/01-�����    ( - ��ū )  ������� ���ƾ� �� ��ȣ +, /, \ 
			
			ȫ�浿
			24
			2000/01/01
			�����

		*/		
		
		String str8 = "ȫ�浿-24-2000/01/01-�����";
		
		String splits[] = str8.split("-");

		System.out.println("splits[0]== "+splits[0]);
		System.out.println("splits[1]== "+splits[1]);
		System.out.println("splits[2]== "+splits[2]);
		System.out.println("splits[3]== "+splits[3]);

		// substring -> oracle substr

		String subStr = str8.substring(4,6);

		System.out.println("subStr = "+subStr);

		// ���ڿ� ==> �빮��
		// toUpperCase
		String str9 = "abcDEF";
		String upStr = str9.toUpperCase();

		System.out.println("upStr = "+ upStr);

		// ���ڿ� ==> �ҹ���
		// toLowerCase
		String lowStr = str9.toLowerCase();

		System.out.println("lowStr = "+ lowStr);

		//toString()
		String str10 = "�ݰ����ϴ�.";
		System.out.println("str10 = "+str10.toString());

		// trim �յڿ� �ִ� ��������

		String str11 = "    java  java   java      ";
		String trimStr = str11.trim();

		System.out.println("trimStr = "+trimStr);

		//valueOf ���� -> ���ڿ�

		/*
				valueOf
				int				String
				12345		"12345"
				
				String			int
				"23456"		23456
		*/

		int num = 123;
		long lo = 12345L;
		double  d = 123.45678;

		String iStr = String.valueOf(num);
		System.out.println("iStr = "+iStr+111);

		String lStr = String.valueOf(lo);
		System.out.println("lStr = "+lStr);

		String dStr = String.valueOf(d);
		System.out.println("dStr = "+dStr);


		//�˰���(ó�����) : Ž��, ����, Ʈ��, ����
		// Ž��
		String str12 = "����� ������";
		String findStr = "����";

		boolean b1 = str12.contains(findStr);

		System.out.println("b1 = "+b1);

		//charAt
		String str13 = "�����ٶ�";
		char ch1 = str13.charAt(2);
		System.out.println("ch1 = "+ch1);

		// concat ���ڿ� ����
		// "abc" "def"
		String str14, str15;

		str14 = "abc";
		str15 = "def";

		String conStr = str14.concat(str15);

		System.out.println("conStr = "+conStr);
	
	}
}
