class exam_7_20171031 
{
	public static void main(String[] args) 
	{
		int sum = 0;

		for (int i=0;i<100; i++ ){
			if(i%2==0){		//¦��
			//if(i%2!=0){  //Ȧ��
				sum = sum+i;		
			}
		}
		System.out.println("sum : "+sum);
	}
}
