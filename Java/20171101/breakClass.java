class breakClass
{
	public static void main(String[] args) 
	{
		/*
				break   //특정제어 (단독으로 사용불가)
				switch, for, while

				switch(  ){
					case1:
						break;
					case2:
						break;
				}

				for(1->10){
					
				}
		*/

		for (int i=0;i<10;i++){
			System.out.println("i = "+i);
			if(i==4){
				break;
			}
		}

		String str = "abcdefgh";

		for(int i=0; i<str.length(); i++){
			System.out.println(i +" : ");
			if(str.charAt(i) == 'f'){
				System.out.println("문자 f를 찾았습니다.");
				break;
			}
		}

		System.out.println("\n======================\n");
		
		int count;

		count = 0;

		String str1 = "abcdabcdabcdabcd";
		//c 에 문자가 문자열에서 몇개 인지 카운트하시오
	
		for (int i=0;i<str1.length() ;i++ )
		{
			if(str1.charAt(i)== 'c'){
				count++;
			}
		}
		System.out.println("찾은 문자열 c의 갯수 : "+count);

		System.out.println("\n======================\n");
	
		boolean b = false;
/*	
		for(int i=0;i<10;i++){
			
			System.out.println("i = "+i);
			for (int j=0;j<5 ;j++ ){
				System.out.println("\t j = "+j);

				if(i == 4 && j == 2){
					b = true;				
				}
				if(b==true){
					break;
				}
			}
			if(b==true){
				break;
			}
		}
*/
/*
		// 2. 탈출 방법
		//goto
		outside:for(int i=0;i<10;i++){
			
						System.out.println("i = "+i);
						for (int j=0;j<5 ;j++ ){
							System.out.println("\t j = "+j);

							if(i == 4 && j == 2){
								b = true;				
							}
							if(b==true){
								break outside;
							}
						}
		}
*/
	}
}
