class exam_3_20171031  
{
	public static void main(String[] args) 
	{
		int num=0;

		for (int i=1;i<=1000;i++)
		/*
			int n = 0;
			for (int i=0;i<1000;i++)
			{
				n++;
				num = num+n;
			}
		*/
		{
			num = num+i;
		}
		System.out.println("1-1000 sum : "+num);
	}
}
