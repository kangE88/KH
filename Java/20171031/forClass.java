class forClass 
{
	public static void main(String[] args) 
	{
		/*
			for : loop

			for ( �ʱ�ȭ ; ���ǹ� ; ����� ){
			
				ó��

			} // �ʱ�ȭ -> ó�� -> ����� -> ���ǹ� -> ó�� -> ����� -> ���ǹ� -> ó�� -> ����� -> ���ǹ�
		
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
		
		// 1- 100 ���� ¦�� ���� ���ϼ���
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
