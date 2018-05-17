class exam3 
{
	public static void main(String[] args) 
	{
		//변수선언
		String name1, name2, name3;
		String phoneNumber1, phoneNumber2, phoneNumber3;
		String addr1, addr2, addr3;

		int age1, age2, age3;
		boolean man1, man2, man3;
		double height1, height2, height3;
	
		//변수값에 데이터 세팅
		name1 = "\"홍길동\""; name2 = "\"일지매\""; name3 = "\"장옥정\""; 
		phoneNumber1 = "010-111-2222"; phoneNumber2 = "02-123-4567"; phoneNumber3 = "02-345-7890"; 
		addr1 = "\"경기도\""; addr2 =  "\"서울\""; addr3 =  "\"부산\"";

		age1 = 20; age2 = 18; age3 = 14;
		man1 = true; man2 = true; man3 = false;
		 
		height1 =175.12;		height2 =180.01;		height3 =155.78;
		

		//result
		System.out.print("============================================================================\n");
		System.out.println("\\ name\t\tage\tman\tphone\t\theight\taddress\t\t\\");
		System.out.print("============================================================================\n");
		System.out.println("\\ "+name1 + "\t" + age1 + "\t" + man1 + "\t" + phoneNumber1 + "\t" + height1 + "\t" + addr1+ "\t\\");
		System.out.println("\\ "+name2 + "\t" + age2 + "\t" + man2 + "\t" + phoneNumber2 + "\t" + height2 + "\t" + addr2+ "\t\t\\");
		System.out.println("\\ "+name3 + "\t" + age3 + "\t" + man3 + "\t" + phoneNumber3 + "\t" + height3 + "\t" + addr3+ "\t\t\\");
		System.out.print("============================================================================\n");
	}
}
