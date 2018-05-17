package main;

public class mainClass {

	public static void main(String[] args) {
	/*
	 * init
	 * 
	 * 
	 * 입력 method
	 * 		유저 몇개 숫자를 입력?
	 * 합계 method
	 * 
	 * 평균 method
	 * 
	 * 출력 method
	 * 
	 * 
	 * 
	 * 
	 */
		//타 Class 호출 
		input in = new input();
		
		
		//몇개의 숫자를 받을건지 유무 판단 및 배열에 저장
		in.inputmethod();
		
		//합계
		in.sum_method();
		
		//평균
		in.avg_method();
		
		//결과
		in.resultPrint();
		
		//static 
		System.out.println(input.ss);
	}
}
