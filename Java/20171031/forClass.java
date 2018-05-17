class forClass 
{
	public static void main(String[] args) 
	{
		/*
			for : loop

			for ( 초기화 ; 조건문 ; 연산식 ){
			
				처리

			} // 초기화 -> 처리 -> 연산식 -> 조건문 -> 처리 -> 연산식 -> 조건문 -> 처리 -> 연산식 -> 조건문
		
		*/

		int i;

		for (i=0 ; i<100 ; i++){
			System.out.println("Loop : "+ i);
		}

		System.out.println("Loop F : " + i);
		
/*
		for(int j =0; j < 10; j++){
		}
		for(int j =0; j > 10; j--){
		}
		for(int j =0; j > 10; j+2){
		}
*/
/*
		int count = 0;
		for( ;true;  ){
			System.out.println("-");
		}
*/
		for (int j=0,k=10; j<10; j++,k--){
			System.out.println("J :"+j);
			System.out.println("K :"+k);
		}

		int sum= 0;
		
		// 1- 100 사이 짝수 합을 구하세요
		for(int j=0;j<100;j++){
			if(j%2==0){
				sum = sum+j;
				System.out.println("result : "+sum);
			}
		}

		for (int j =0;j<10 ;j++ ){
			System.out.println("J : "+j);
			for (int k =0;k<5 ;k++ ){
				System.out.println("\t K : "+k);
			}
		}


	}
}
