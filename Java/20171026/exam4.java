import java.util.Scanner;

class exam4 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		//�̸�
		String  name;
		System.out.print("Name : ");
		name = scan.nextLine();
		
		//����
		int  age;
		System.out.print("age : ");
		age = scan.nextInt();
		
		//�����Ǵ�
		boolean  man;
		System.out.print("man (true or false) : ");
		man = scan.nextBoolean();
		
		//�ڵ�����ȣ
		String  phone;
		System.out.print("phone : ");
		phone = scan.next();

		//�ּ�
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

