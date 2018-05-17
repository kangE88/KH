package sort;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Sort : 정렬
		 * 
		 * 퀵소트 >  합병소트 > 버블소트
		 * 
		 * 1 5 2 4 3
		 * 
		 * 1 2 3 4 5 -> 오름차순 정렬
		 * 5 4 3 2 1 -> 내림차순 정렬
		 * 
		 * 최신등록순, 가격순, 연봉순, 입사순서
		 * 
		 */
		
		int number[] = { 1, 5, 6, 7, 8, 2, 4, 3, 9, 10 };
		int temp;
		
		for(int i=0; i<number.length-1; i++) {
			for(int j= i+1; j<number.length; j++) {
				if(number[i] > number[j]) { //오름차순
				//if(number[i] < number[j]) { //내림차순
					//swap(교환)
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		for(int i=0; i<number.length;i++) {
			System.out.println(number[i]);
		}
	}

}
