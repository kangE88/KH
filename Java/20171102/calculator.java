import java.util.Scanner;

class calculator 
{
	public static void main(String[] args) 
	{

		//���� 

		Scanner scan = new Scanner(System.in);

		String num1, num2, oper;

		int number1, number2, op;

		int result;

		result =0;

		//number1 �� �������� 
		while ( true ){
			System.out.print("ó�� ���ڸ� �Է��ϼ���. : ");
			num1 = scan.next();

			number1 = num1.charAt(0);

			//�˻�
			if(number1 > 47 && number1 < 58){
				break;
			}else{
				System.out.println("���ڸ� �Է� �����մϴ�.");
				continue;
			}
		}

		//������ (+ - * / ) �������� 
		while ( true ){
			System.out.print("�����ڸ� �Է��ϼ���. (+, -, *, /) : ");
			oper = scan.next();
			op = oper.charAt(0);

			//�˻� +(42) -(43) *(45) /(47) 
			if(op == 42 || op == 43 || op == 45 || op == 47){
				break;
			}else{
				System.out.println("������ �Է� �����մϴ�.");
				continue;
			}
		}

		//number2 �������� 
		while ( true ){
			System.out.print("�ι�° ���ڸ� �Է��ϼ���. : ");
			num2 = scan.next();

			number2 = num2.charAt(0);

			//�˻�
			if(number2 > 47 && number2 < 58){
				break;
			}else{
				System.out.println("���ڸ� �Է� �����մϴ�.");
				continue;
			}
		}

		//��ȯ String -> int
		number1 = Integer.parseInt(num1);
		number2 = Integer.parseInt(num2);

		//����ó��
		if("+".equals(oper)){
			result = number1 + number2;
		}else if("-".equals(oper)){
			result = number1 - number2;
		}else if("*".equals(oper)){
			result = number1 * number2;
		}else{
			if(number1 !=0 || number2 !=0){
				result = number1 / number2;
			}
		}

		//���
		System.out.println("------- result -------");
		System.out.println(""+number1+" "+oper+" "+number2+" == "+result);
		
	}
}
