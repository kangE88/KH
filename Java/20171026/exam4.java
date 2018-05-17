import java.util.Scanner;

class exam4 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		//이름
		String  name;
		System.out.print("Name : ");
		name = scan.nextLine();
		
		//나이
		int  age;
		System.out.print("age : ");
		age = scan.nextInt();
		
		//남성판단
		boolean  man;
		System.out.print("man (true or false) : ");
		man = scan.nextBoolean();
		
		//핸드폰번호
		String  phone;
		System.out.print("phone : ");
		phone = scan.next();

		//주소
		String  address;
		System.out.print("address : ");
		address = scan.next();

		//result
		System.out.println("\n=================\n");
		System.out.println(">>Name == "+name);
		System.out.println(">>age == "+age);
		System.out.println(">>man == "+man);
		System.out.println(">>phone == "+phone);
		System.out.println(">>address == "+address);
		System.out.println("\n=================\n");


/*
>> name		
>> age	
>> man	
>> phone		
>> height	
>> address

*/		
	}
}

