import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
		String str = "홍길동=22=2001/03/14=서울시";
		
		String split[] = str.split("=");
		
		for (int i = 0; i < split.length; i++) {
			System.out.println("split["+i+"] =="+split[i]);
		}
		
		StringTokenizer st = new StringTokenizer(str, "=");
		
		int len = st.countTokens(); //나뉜 data 갯수
		
		System.out.println(len);
		
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		
		
		
		/*
		 * spilit : null 문자를 같은 데이터로 인정
		 * StringTokenizer : null 문자를 같은 데이터로 인정하지 않음 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		st = new StringTokenizer(str, "=");
		
		String name = st.nextToken();
		
		int age = Integer.parseInt(st.nextToken());
		
		String birth = st.nextToken();
		
		String address = st.nextToken();
		
		System.out.println(name+" "+age+" "+birth+" "+address);
	}

}
