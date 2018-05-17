package method_ex;

public class Exercise4 {

	public static void main(String[] args) {
		
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));

	}
	static boolean isNumber(String str) {		
		
		boolean result= false;
		
		//검사
		if(str==null || str=="") {
			result = false;
		}else {
			//str이 Null이거나 "" 빈문자열이 아닐때
			for(int i=0;i<str.length();i++) {
				
				char c = str.charAt(i);
				
				//ASCII 숫자인지 판단
				if(c > 47 && c < 58){
					result=true;
					break;
				}else {
					result =false;
					break;
				}
			}
		}
		return result;
	}
}
