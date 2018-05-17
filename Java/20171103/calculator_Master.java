import java.util.Scanner;

class calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// 계산기
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

		// 입력
		// String 
		// number1 
		char c;
		boolean b = false;
		boolean out = true;

		while(out == true){
			b = false;
			System.out.print("첫번째 수 = ");
			num1 = sc.next();	// = 12a 1a3

			// 검사
			for(int i = 0;i < num1.length(); i++){
				c = num1.charAt( i );			
				if((int)c < 48 || (int)c > 57){	// 48 = '1'
					b = true;
					break;
				}
			}
			if(b == true){
				System.out.println("숫자가 아닙니다 다시 입력해 주십시오");
				continue;
			}
			out = false;
		}

		System.out.println("첫번째 수:" + num1);

		
		// 연산자(+, -, *, /)
		// 검사
		while(true){
			System.out.print("연산자(+, -, *, /) = ");
			oper = sc.next();

			if(oper.equals("+") || 
				oper.equals("-") || 
				oper.equals("*") ||
				oper.equals("/")){
				break;
			}
			else{
				System.out.println("연산자가 아닙니다 다시 입력해 주십시오");
			}
		}

		// number2 
		// 검사
		while(true){
			b = false;
			System.out.print("두번째 수 = ");
			num2 = sc.next();

			// 검사
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
				System.out.println("숫자가 아닙니다 다시 입력해 주십시오");
			}			
		}
		System.out.println("두번째 수:" + num2);




		// 변환처리 String -> int
		number1 = Integer.parseInt(num1);
		number2 = Integer.parseInt(num2);

		System.out.println("1번째 수:" + number1);
		System.out.println("2번째 수:" + number2);

		// 연산처리
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



		// 결과
		if(suc){
			System.out.println(number1  + " " + oper
					+ " " + number2 + " = " + result);
		}else{
			System.out.println("계산할 수 없습니다");
		}
		

	}
}
