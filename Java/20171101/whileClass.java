class whileClass 
{
	public static void main(String[] args) 
	{
		/*
				while, do while

				초기화
				while ( 조건 ){
					처리
					연산식
				}

				for(초기화; 조건식; 연산식){
					처리
				}
		*/

		//application

		int w;

		//initialize(초기화)
		w = 0;

		//loop(무한)
		while(w < 10){		//조건
			System.out.println("w = "+ w);
			w++;	//연산처리
		}

		//release(해방)
		//w = -1;
/*
		int w1, w2;

		w1 = 0;
		w2 = 0;

		while(w1 < 10){
			//w2 =0;
			while(w2 <5){
				System.out.println("w = "+ w1+"  "+w2);
				w2++;
			}
			w1++;
		}

		int count = 0;

		while(true){
			System.out.println("count = "count);
			count++;
		}
*/

		//do while
		/*
		do{
			연산식
		}while(조건식){
		
		}
		*/
/*
		int w3 = 10;
		
		do{
			System.out.println(w3);
			w3++;
		}
		while (w3 < 10);
*/

		int w4,w5, temp;

		w4 =0;
		w5=0;
		temp =0;

		while(w4 < 9){
			
			if(w4 <5){
				temp++;
			}else{
				temp--;	
			}

			System.out.println("w5=="+w5);
			//w5 = 0;
			while(w5 < temp){
				System.out.print("*");
				w5++;
			}
			System.out.println();
			w4++;
		}
	}
}
