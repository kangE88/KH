package method_ex;

import java.util.Arrays;

public class Exercise6 {

	public static void main(String[] args) {
		//a b c d e f g h i j k l m n o p q r s t u v w x y z 
		
		//` ~ ! @ # $ % ^ & * ( ) - _ + = | [ ] { } ; : , . /
		
		
		//0 1 2 3 4 5 6 7 8 9
		//q w e r t y u i o p
	
		//char[] abcCode = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		//char[] abcCode = { 	'`','~','!','@','#','$','%','^','&','*','(',')','-','_','+','=','|','[',']','{','}',';',':',',','.','/'};
		


		char[] c = incode("hello1");
		
		char[] d = decode("qwertyuiop");
		
		for(int i=0;i<c.length;i++) {
			System.out.print("  "+c[i]+" ");
		}
		
		System.out.println();
		
		
		for(int i=0;i<d.length;i++) {
			System.out.print(" "+d[i]+" ");
		}

	}

	static char[] incode(String  s) {
		char[] abcCode = { 	'`','~','!','@','#','$','%','^','&','*','(',')','-','_','+','=','|','[',']','{','}',';',':',',','.','/'};
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		int temp;
		
		char[] narr = new char[s.length()];
		
		for(int i=0;i<s.length();i++) {
			temp= s.charAt(i);
			if(temp > 47 && temp < 58) {
				temp= s.charAt(i)-48;			//0-26
				narr[i] = numCode[temp]; 
			}else {
				temp= s.charAt(i)-97;			//0-26
				narr[i] = abcCode[temp]; 
			}
		}
			
		return narr;
		
	}
	
	static char[] decode(String  s) {
		char[] abcCode = { 	'`','~','!','@','#','$','%','^','&','*','(',')','-','_','+','=','|','[',']','{','}',';',':',',','.','/'};
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
			
		char[] narr = new char[s.length()];
		
		int temp;
		
		for(int i=0;i<s.length();i++) {
			temp= s.charAt(i);
			if(temp > 47 && temp < 58) {
				for(int j=0;j< numCode.length;j++) {
					for(int k=0;k<s.length();k++) {
						if(numCode[j] ==s.charAt(k)) {
							narr[k] = (char)(47+j);
						}
					}
				}
			}else {
				for(int j=0;j< abcCode.length;j++) {
					for(int k=0;k<s.length();k++) {
						if(abcCode[j] ==s.charAt(k)) {
							narr[k] = (char)(97+j);
						}
					}
				}
			}
		}
		return narr;
		
	}
}
