package connectionTest;

public class mainClass {

	public static void main(String[] args) {

			/*
			 * 	.dll 동적 메모리영역 공유 절약 보안X 
			 *  .lib 정적 메모리영역 별도 X    보안O
			 * 
			 *  .txt -> .dll, .lib ->(java 내에서는) .jar
			 *  .txt 파일을 작성하여 .dll 혹은 .lib 파일을 생성
			 *  .jar 도 위 처럼 class파일들을 모아놓은 집합이라 할 수 있다.
			 * 
			 */
			
			connectionTest ct = new connectionTest();
			
			ct.makeConnection();
	}

}
