import java.util.Scanner;

class calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// ����
		String num1, num2, oper;
		int number1, number2;
		int result;
		int w;
		boolean suc;

		// init
		num1 = "";
		num2 = "";
		result = 0;
		oper = "";	
		w = 0;
		suc = true;

		// �Է�
		// String 
		// number1 
		char c;
		boolean b = false;
		boolean out = true;

		while(out == true){
			b = false;
			System.out.print("ù��° �� = ");
			num1 = sc.next();	// = 12a 1a3

			// �˻�
			for(int i = 0;i < num1.length(); i++){
				c = num1.charAt( i );			
				if((int)c < 48 || (int)c > 57){	// 48 = '1'
					b = true;
					break;
				}
			}
			if(b == true){
				System.out.println("���ڰ� �ƴմϴ� �ٽ� �Է��� �ֽʽÿ�");
				continue;
			}
			out = false;
		}

		System.out.println("ù��° ��:" + num1);

		
		// ������(+, -, *, /)
		// �˻�
		while(true){
			System.out.print("������(+, -, *, /) = ");
			oper = sc.next();

			if(oper.equals("+") || 
				oper.equals("-") || 
				oper.equals("*") ||
				oper.equals("/")){
				break;
			}
			else{
				System.out.println("�����ڰ� �ƴմϴ� �ٽ� �Է��� �ֽʽÿ�");
			}
		}

		// number2 
		// �˻�
		while(true){
			b = false;
			System.out.print("�ι�° �� = ");
			num2 = sc.next();

			// �˻�
			for(int i = 0;i < num2.length(); i++){
				c = num2.charAt( i );			
				if((int)c < 48 || (int)c > 57){	// 48 = '1'
					b = true;
					break;
				}
			}

			if( !b ){
				break;
			}else{
				System.out.println("���ڰ� �ƴմϴ� �ٽ� �Է��� �ֽʽÿ�");
			}			
		}
		System.out.println("�ι�° ��:" + num2);




		// ��ȯó�� String -> int
		number1 = Integer.parseInt(num1);
		number2 = Integer.parseInt(num2);

		System.out.println("1��° ��:" + number1);
		System.out.println("2��° ��:" + number2);

		// ����ó��
		char chOp = oper.charAt(0); 
		switch( chOp ){
			case '+':
				result = number1 + number2;
				break;
			case '-':
				result = number1 - number2;
				break;
			case '*':
				result = number1 * number2;
				break;
			case '/':
				if(number2 != 0){
					result = number1 / number2;
				}else{
					result = 0;
					suc = false;
				}
				break;
		}



		// ���
		if(suc){
			System.out.println(number1  + " " + oper
					+ " " + number2 + " = " + result);
		}else{
			System.out.println("����� �� �����ϴ�");
		}
		

	}
}
