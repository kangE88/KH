import java.util.Scanner;
import java.util.Random;

class randomNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int r_num, u_num;
		boolean clear;
		int w;
		String replay;

		//random Number

		//init(�ʱ�ȭ)
		clear = false;

		while(true){
			//���� ��ȣ �ޱ�
			r_num = (int)(Math.random() * 100)+1; //1 - 100

			System.out.println(r_num);

			w =0;
			while(w<10){
				//user input
				System.out.println("1-100 ���� �� �Է� : ");
				u_num = sc.nextInt();

				//fint number (loop)
				if(u_num  > r_num){
					System.out.println("�ʹ� Ů�ϴ�.");
				}else if(u_num  < r_num){
					System.out.println("�ʹ� �۽��ϴ�.");
				}else{
					System.out.println("�����Դϴ�.");
					clear = true;
					break;
				}
				w++;
			}

			//message

			//result
			if(clear){
				System.out.println("����Ŭ����");
			}else{
				System.out.println("���ӿ���");
			}

			System.out.println("���� �� ?(Y/N) - ");
			replay = sc.next();

			if(replay.equals("N") || replay.equals("n")){
				break;
			}

			System.out.println("�ٽ� �����մϴ�.");
		}
	}
}
