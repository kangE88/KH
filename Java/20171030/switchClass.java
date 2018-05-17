class switchClass 
{
	public static void main(String[] args) 
	{
		/*
			switch : 값이 명확해야 한다. == (범위값 사용 불가)
						부정한 값은 사용이 불가능하다.
						< > >= <= 

			switch(변수)
			{
					case 값:
						break;
					case 값:
						break;
					
					default:
					// 아무 값도 아닐 경우
			}
		*/

		int number = 85;

		switch (number){
			case 100 :
					System.out.println("A+");
					break;
			case 90:
					System.out.println("B+");
					break;
			case 85:
					System.out.println("B");
					break;
			case 80:
					System.out.println("C+");
					break;
			case 70:
					System.out.println("D+");
					break;
			default:
					System.out.println("C이하");
		}

		char c = 'A';

		switch (c){
		case 'A':
			System.out.println("A");
			break;
		case 'B':
			System.out.println("B");
			break;
		}

		String str =	 "ABC";

		switch(str){
			case "ABC":
				System.out.println("str = ABC");
				break;
		}

	}
}
