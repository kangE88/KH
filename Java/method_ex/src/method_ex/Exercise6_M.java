package method_ex;

public class Exercise6_M {
	public static void main(String[] args) {
		// abcdefghijklmnopqrstuvwxyz

		

		

		
		String src ="abcppp012";
		String resultStr = incode(src);

		
		System.out.println("원본 :"+ src);
		System.out.println("암호화코드 :"+ resultStr);
	}
	
	static String incode(String s) {
		char[] abcCode ={ 	'`','~','!','@','#','$','%','^','&','*','(',')','-','_','+','=','|','[',']','{','}',';',':',',','.','/'};
		
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		String src = s;
		
		String resultStr ="";
		
		char temp;
		int n;
		
		for(int i=0;i<src.length();i++) {
			temp =src.charAt(i);
			n = (int)temp;
			
			//알파벳의 경우 (97~
			if(n>=97 && n<=122) {
				n = n -97;
				resultStr = resultStr +abcCode[n];
			}else {
			//숫자인경우
				n = n - 48;
				resultStr = resultStr + numCode[n];
			}
		}
		return resultStr;
	}
}