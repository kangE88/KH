import java.util.Scanner;
import java.util.Random;

class exam_4_20171103 
{
	public static void main(String[] args) 
	{
		//random number
		//user input
		//find y/n -- ������  ~���� ũ�� ~���� �۴� , �˻� Ƚ�� ����(10ȸ)
		//regame y/n

		int user_input;

		int random;

		int w;

		Scanner scan = new Scanner(System.in);

		random = ((int)(Math.random()*100)+1);

		System.out.println("random == "+random);
		
		w = 0;
		while(w <10){
			System.out.println();
			System.out.println("====random ���� ���߱� (10�� �ȿ� ���߼ž� �մϴ�.)=====\n");
			System.out.print("���� ���� �Է� : ");
			user_input = scan.nextInt();

				if(user_input == random){
					System.out.println("=========================================");
					System.out.println("���� �Դϴ�.");
					System.out.println("=========================================");
					break;
				}else{
					if(user_input > random){
						System.out.println("=========================================");
						System.out.println("\n���� ���� Ƚ�� : " +( 9 - w ) + "\n\n");
						System.out.println("=========================================");
						System.out.println(user_input+"���� �۽��ϴ�.");
						System.out.println("=========================================");					
						w++;
					}else if(user_input < random){
						System.out.println("=========================================");
						System.out.println("\n���� ���� Ƚ�� : " +( 9 - w ) + "\n\n");
						System.out.println("=========================================");
						System.out.println(user_input+"���� Ů�ϴ�.");
						System.out.println("=========================================");
						w++;
					}
				}
			}
	}
}
