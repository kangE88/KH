package jinsuChange;

public class Mchange10To2 {

	public static void main(String [] args) {
		
		//10진수 -> 2진수
		int number = 123;
		int tag;
		String numStr = "";
		
		int oldNumber = number;
		
		while(true) {
			tag = number % 2;
			numStr = String.valueOf(tag)+numStr;
			if(number / 2 == 0) {
				break;
			}
			number = number / 2;
		}
		
		System.out.println(oldNumber+ "의 2진수는 ? == "+numStr+" 입니다.");
		
		//2진수 -> 10진수
		//1010 Math.pow(숫자, 승수)
		
		//String int
		int len = numStr.length();
		char cnum;
		int n, n1;
		int num =0;
		int l = len;
		
		for(int i=0;i<len;i++) {
			cnum = numStr.charAt(i); 
			
			n = Integer.parseInt(cnum +"");
			
			n1 = (int)Math.pow(2, l - 1);
			n = n * n1;
			
			l--;
			num = num + n;
		}
		System.out.println(numStr+"의 10진수는 "+num+" 입니다.");
		
		//10진수 -> 16진수
		String numStr16 = "";
		String s1 = "";
		
		int tag16;
		
		while(true) {
			tag16 = num % 16;
			
			switch(tag16) {
				case 10:
					s1 = "A";
					break;
				case 11:
					s1 = "B";
					break;
				case 12:
					s1 = "C";
					break;
				case 13:
					s1 = "D";
					break;
				case 14:
					s1 = "E";
					break;
				case 15:
					s1 = "F";
					break;
				default:
					s1 = tag16+"";
					break;
			}
			
			numStr16 = s1 + numStr16;
			
			if(num / 16 == 0) {
				break;
			}
			
			num = num / 16;
		}
		System.out.println(oldNumber+"의 16진수는 "+numStr16+"입니다.");
		
		//16진수 -> 10진수
		int len16 = numStr16.length();
		
		String c16;
		int l16 = len16;
		int temp = 0;
		int n16;
		int number16 = 0;
		//char cnum16;
		
		for(int i=0;i<len16;i++) {
			c16 =  numStr16.charAt(i)+ "";
			
			if(c16.equals("A") ||c16.equals("a") ) {
				c16 = "10";
			}else if(c16.equals("B") ||c16.equals("b") ) {
				c16 = "11";
			}else if(c16.equals("c") ||c16.equals("c") ) {
				c16 = "12";
			}else if(c16.equals("D") ||c16.equals("d") ) {
				c16 = "13";
			}else if(c16.equals("E") ||c16.equals("e") ) {
				c16 = "14";
			}else if(c16.equals("F") ||c16.equals("f") ) {
				c16 = "15";
			}
			temp = (int)Math.pow(16, l16 -1);
			n16 =  Integer.parseInt(c16) * temp;
			
			number16 = number16 +n16;
			l16--;
		}
		
		System.out.println(numStr16+"의 10진수는 "+number16+" 입니다.");
		
		
	}
}
