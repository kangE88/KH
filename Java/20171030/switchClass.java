class switchClass 
{
	public static void main(String[] args) 
	{
		/*
			switch : ���� ��Ȯ�ؾ� �Ѵ�. == (������ ��� �Ұ�)
						������ ���� ����� �Ұ����ϴ�.
						< > >= <= 

			switch(����)
			{
					case ��:
						break;
					case ��:
						break;
					
					default:
					// �ƹ� ���� �ƴ� ���
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
					System.out.println("C����");
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
