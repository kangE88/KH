package main;

import ArrayStack.ArrayStack;

public class mainClass {

	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(10);
		
		if(stack.isEmpty()) {
			
/*			String str = "AAA";
			stack.push(str);
			
			String rStr = (String)stack.peek();
			System.out.println("rStr == "+rStr);
			
			
			 * Object 로 받아오면 포인터(void poinrter)로 받는다.
			 * 포인터의 크기는 모두 같다 (캐스팅) 으로 사용하면 된다.
			 * Integer		4	porinter -> 4
			 * Character	2	porinter -> 4
			 * Double		8	porinter -> 4
			 * 
			 * 
			 * 
			 
			
			str = "BBB";
			stack.push(str);
			
			rStr = (String)stack.peek();
			System.out.println("rStr == "+rStr);
			
			str = "CCC";
			stack.push(str);
			
			rStr = (String)stack.peek();
			System.out.println("rStr == "+rStr);
			
			//맨 위의 공을 pop(삭제) 한다
			stack.pop();
			rStr = (String)stack.peek();
			System.out.println("rStr == "+rStr);
			
*/
			
			
			Integer in = 111;
			stack.push(in);

			in = 222;
			stack.push(in);
			in = 333;
			stack.push(in);
			
			Integer top = (int)stack.peek();	
			System.out.println("top == "+top);
			
			Integer r = (Integer)stack.pop();
			System.out.println("r== "+r);
			
			
			top = (int)stack.peek();	
			System.out.println("top == "+top);
			
			
		}
	}

}
