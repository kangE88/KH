class exam_7_20171031 
{
	public static void main(String[] args) 
	{
		int sum = 0;

		for (int i=0;i<100; i++ ){
			if(i%2==0){		//Â¦¼ö
			//if(i%2!=0){  //È¦¼ö
				sum = sum+i;		
			}
		}
		System.out.println("sum : "+sum);
	}
}
