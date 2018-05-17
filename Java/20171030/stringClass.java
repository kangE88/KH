class stringClass 
{
	public static void main(String[] args) 
	{
		/*
			Strㅑng 문자열 저장, 편집, 정보제공,
			Array 갯수 length
		
		*/
		String str; // String 클래스 == Object (객체)
		//str == 변수, 클래스의 변수(instance== 주체)

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
			class 인간
			기능 (함수 == method)
			먹다,
			걷다,
			공부하다
		*/
		
		// 비교함수 equals
		String str5, str6;

		str5 = "Hello";
		str6 = "Hell";

		str6 = str6 + "o"; // Hello

		if(str5 == str6){
			System.out.println("str5 == str6 같다");
		}else{
			System.out.println("");
		}

		boolean b = str5.equals(str6);

		System.out.println("b== "+b);

		// indexOf 특정 문자가 몇번째 위치하는지 숫자로 나타냄 (앞으로부터)
		// char arr[] = "Hello"; 

		String str7 = "abc123abc";
		
		int i = str7.indexOf("c");

		System.out.println("i = "+i); //문자열을 몾찾으면 -1 리턴

		// indexOf 특정 문자가 몇번째 위치하는지 숫자로 나타냄 (뒤로부터)
		i = str7.lastIndexOf("C");
		System.out.println("i = "+i);  //문자열을 몾찾으면 -1 리턴

		// length
		int len = str7.length();

		System.out.println("len== "+len);

		// 함수  return 값 = 함수명(인수, 인자, parameter)
		// 함수명(인수1, 인수2) 인수 == 들어가는값

		String _str = null;

		len = "Hello world".length(); // nul(/0) null
		System.out.println("len== "+len);

		// replace(수정)
		str7 = "A*B*C*D";

		String repStr = str7.replace("*","");

		System.out.println("repStr == "+repStr);

		str7 = "가 나 다 라 마 바 사 아 자 차 카 타 파 하";

		repStr = str7.replace(" ","");
		System.out.println("repStr == "+repStr);

		/*
			split = tokken을 활용해서 문자열을 자르는 작업
			
			홍길동-24-2000/01/01-서울시    ( - 토큰 )  사용하지 말아야 할 기호 +, /, \ 
			
			홍길동
			24
			2000/01/01
			서울시

		*/		
		
		String str8 = "홍길동-24-2000/01/01-서울시";
		
		String splits[] = str8.split("-");

		System.out.println("splits[0]== "+splits[0]);
		System.out.println("splits[1]== "+splits[1]);
		System.out.println("splits[2]== "+splits[2]);
		System.out.println("splits[3]== "+splits[3]);

		// substring -> oracle substr

		String subStr = str8.substring(4,6);

		System.out.println("subStr = "+subStr);

		// 문자열 ==> 대문자
		// toUpperCase
		String str9 = "abcDEF";
		String upStr = str9.toUpperCase();

		System.out.println("upStr = "+ upStr);

		// 문자열 ==> 소문자
		// toLowerCase
		String lowStr = str9.toLowerCase();

		System.out.println("lowStr = "+ lowStr);

		//toString()
		String str10 = "반갑습니다.";
		System.out.println("str10 = "+str10.toString());

		// trim 앞뒤에 있는 공백제거

		String str11 = "    java  java   java      ";
		String trimStr = str11.trim();

		System.out.println("trimStr = "+trimStr);

		//valueOf 숫자 -> 문자열

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


		//알고리즘(처리방식) : 탐색, 정렬, 트리, 셔플
		// 탐색
		String str12 = "서울시 강남구";
		String findStr = "서울";

		boolean b1 = str12.contains(findStr);

		System.out.println("b1 = "+b1);

		//charAt
		String str13 = "가나다라마";
		char ch1 = str13.charAt(2);
		System.out.println("ch1 = "+ch1);

		// concat 문자열 연결
		// "abc" "def"
		String str14, str15;

		str14 = "abc";
		str15 = "def";

		String conStr = str14.concat(str15);

		System.out.println("conStr = "+conStr);
	
	}
}
