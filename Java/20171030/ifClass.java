class ifClass 
{
	public static void main(String[] args) 
	{
		/*
			���

			����
				if

				if
				else
				
				if
				else if
				
				if
				else if
				else

				switch
					case
					break;
					default;
			��ȯ(loop)
				for
				while
				do while
					break;
					continue;
					
		*/

		// if, else if, else
		// �������� : && || !
		// �ε�ȣ, ��ȣ : >, <, >= <=, ==, != !
		/*
			if(����){
				
			}else if{
			
			}else{
			
			}
		*/

		int number = 10;

		if (number > 9){
			//ó��
			System.out.println("number�� 9 �̻�");
		}

		if(number >=10){
			System.out.println("number�� 10���� ũ�ų� ����.");
		}

		if(number > 10){
			System.out.println("number�� 10���� ũ��.");
		}else{
			System.out.println("number�� 10���� ���ų� �۴�.");
		}

		number = 85;

		if(number == 100){
			System.out.println("A++");
		}else if(number > 90){
			System.out.println("A+");
		}else if(number > 80){
			System.out.println("B+");
		}else if(number > 70){
			System.out.println("C+");
		}else{
			System.out.println("C+ ����");
		}
		
		if(number >= 60 && number <70){
			System.out.println("D+");
		}else if(number >=70 && number <80){
			System.out.println("C+");
		}else if(number >=80 && number <90){
			System.out.println("B+");
		}else if(number >=90 && number <100){
			System.out.println("A+");
		}else if(number >=100){
			System.out.println("A++");
		}else{
			System.out.println("C+ ����");
		}

		boolean b;

		b = false;

		if(b == false){
			System.out.println("false.");
		}
		
		if(!b){
			System.out.println("!false");
		}

		if(b){
			System.out.println("true");
		}

		if(b != true){
			System.out.println("false");
		}

		number = 75;

		if(number == 100){
			//A+
		}else if(number < 100 && number >=90){
			//A+ A-
			if(number >=95){
				System.out.println("A+");
			}else{
				System.out.println("A-");
			}
		}else if(number < 90 && number >=80){
			//B+ B-
			if(number >=85){
				System.out.println("B+");
			}else{
				System.out.println("B-");
			}	
		}else if(number < 80 && number >=70){
			//C+ C-
			if(number >=75){
				System.out.println("C+");
			}else{
				System.out.println("C-");
			}
		}else if(number < 70 && number >=60){
			//D+ D-
			if(number >=65){
				System.out.println("D+");
			}else{
				System.out.println("D-");
			}
		}
		
				int age;

				age = 12;

				if(age < 13 || age > 75){
					System.out.println("�̿� �Ұ���");
				}else{
					System.out.println("�̿� ����");
				}

		String str1 = "Hello";
		String str2 = "Hell";

		str2 = str2 + "o";

		if(str1 == str2){
			System.out.println("str1 == str2 �����ϴ�.");		
		}

		if(str1.equals(str2)){
			System.out.println("str1 equals str2 �����ϴ�.");
		}
	}
}
