class breakClass
{
	public static void main(String[] args) 
	{
		/*
				break   //Ư������ (�ܵ����� ���Ұ�)
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
				System.out.println("���� f�� ã�ҽ��ϴ�.");
				break;
			}
		}

		System.out.println("\n======================\n");
		
		int count;

		count = 0;

		String str1 = "abcdabcdabcdabcd";
		//c �� ���ڰ� ���ڿ����� � ���� ī��Ʈ�Ͻÿ�
	
		for (int i=0;i<str1.length() ;i++ )
		{
			if(str1.charAt(i)== 'c'){
				count++;
			}
		}
		System.out.println("ã�� ���ڿ� c�� ���� : "+count);

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
		// 2. Ż�� ���
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
