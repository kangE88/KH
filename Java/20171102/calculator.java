import java.util.Scanner;

class calculator 
{
	public static void main(String[] args) 
	{

		//계산기 

		Scanner scan = new Scanner(System.in);

		String num1, num2, oper;

		int number1, number2, op;

		int result;

		result =0;

		//number1 값 가져오기 
		while ( true ){
			System.out.print("처음 숫자를 입력하세요. : ");
			num1 = scan.next();

			number1 = num1.charAt(0);

			//검사
			if(number1 > 47 && number1 < 58){
				break;
			}else{
				System.out.println("숫자만 입력 가능합니다.");
				continue;
			}
		}

		//연산자 (+ - * / ) 가져오기 
		while ( true ){
			System.out.print("연산자를 입력하세요. (+, -, *, /) : ");
			oper = scan.next();
			op = oper.charAt(0);

			//검사 +(42) -(43) *(45) /(47) 
			if(op == 42 || op == 43 || op == 45 || op == 47){
				break;
			}else{
				System.out.println("연산자 입력 가능합니다.");
				continue;
			}
		}

		//number2 가져오기 
		while ( true ){
			System.out.print("두번째 숫자를 입력하세요. : ");
			num2 = scan.next();

			number2 = num2.charAt(0);

			//검사
			if(number2 > 47 && number2 < 58){
				break;
			}else{
				System.out.println("숫자만 입력 가능합니다.");
				continue;
			}
		}

		//변환 String -> int
		number1 = Integer.parseInt(num1);
		number2 = Integer.parseInt(num2);

		//연산처리
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

		//결과
		System.out.println("------- result -------");
		System.out.println(""+number1+" "+oper+" "+number2+" == "+result);
		
	}
}
