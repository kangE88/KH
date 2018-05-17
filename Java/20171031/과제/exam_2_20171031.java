class exam_2_20171031 
{
	public static void main(String[] args) 
	{
		int count = 0;

		for(int i=0;i<9;i++){
			
			if(i < 5){
				count++;
			}else{
				count--;
			}

			for(int j=0;j<count;j++){
					System.out.print("*");			
			}
			System.out.println();
		}
	}
}
