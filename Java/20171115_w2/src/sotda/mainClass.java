package sotda;

public class mainClass {
	public static void main(String[] args) {
		
		sotda sd = new sotda();
		
		//랜덤 카드 생성
		sd.cardShupple();
		//카드 2장씩 셋팅
		sd.cardThrow();
		//결과 값
		sd.resultPrint();
	}

}
