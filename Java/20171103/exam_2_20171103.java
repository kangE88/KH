import java.util.Scanner;
import java.util.Random;

class exam_2_20171103 
{
	public static void main(String[] args) 
	{
		//���������� ����
	
		String hands, ui_hands;
		String regame;
		

		int  count;
		int regame_count;

		int p_win, u_win, draw;

		count = 0;
		regame_count =0;

		p_win = 0;
		u_win = 0;
		draw = 0;

		while(true){

			Scanner scan = new Scanner(System.in);
			
			System.out.println();
			System.out.println("========���� ���� �� ======");

			//�Է�
			while(true){
				System.out.print(" ������ ���ðڽ��ϱ� ? (���� ���� ��) : ");
				hands = scan.next();

				if("����".equals(hands) || "����".equals(hands) || "��".equals(hands) ){
					break;
				}else{
					System.out.println();
					System.out.println("�߸��Է��ϼ̽��ϴ�. ����, ����, �� �� �� �ϳ��� �Է��ϼž� �մϴ�.");
					continue;
				}
			}

			//����ȣ�� ui 3 case
			ui_hands = "";
			count = ((int)(Math.random()*3));

			if(count == 0){
				ui_hands = "����";
			}else if(count == 1){
				ui_hands = "����";
			}else if( count == 2 ){
				ui_hands = "��";
			}

			System.out.println();

			//���� ���
			if("����".equals(hands) && "����".equals(ui_hands)){
				System.out.println("�� = ["+hands+"]\t"+"UI =["+ui_hands+"]  �� UI�� �̰���ϴ�."); 		//UI �¸� ����
				u_win++;
			}else if("����".equals(hands) && "��".equals(ui_hands)){
				System.out.println("�� = ["+hands+"]\t"+"UI =["+ui_hands+"]  �� UI�� �̰���ϴ�.");
				u_win++;
			}else if("��".equals(hands) && "����".equals(ui_hands)){
				System.out.println("�� = ["+hands+"]\t"+"UI =["+ui_hands+"]  �� UI�� �̰���ϴ�.");
				u_win++;
			}else if("����".equals(ui_hands) && "����".equals(hands)){
				System.out.println("�� = ["+hands+"]\t"+"UI =["+ui_hands+"]  �� player�� �̰���ϴ�."); //player �¸� ����
				p_win++;
			}else if("����".equals(ui_hands) && "��".equals(hands)){
				System.out.println("�� = ["+hands+"]\t"+"UI =["+ui_hands+"]  �� player�� �̰���ϴ�.");
				p_win++;
			}else if("��".equals(ui_hands) && "����".equals(hands)){
				System.out.println("�� = ["+hands+"]\t"+"UI =["+ui_hands+"]  �� player�� �̰���ϴ�.");
				p_win++;
			}else 	if("����".equals(hands) && "����".equals(ui_hands)){
				System.out.println("�� = ["+hands+"]\t"+"UI =["+ui_hands+"]  �� �����ϴ�.");
				draw++;
			}else 	if("����".equals(hands) && "����".equals(ui_hands)){
				System.out.println("�� = ["+hands+"]\t"+"UI =["+ui_hands+"]  �� �����ϴ�.");
				draw++;
			}else 	if("��".equals(hands) && "��".equals(ui_hands)){
				System.out.println("�� = ["+hands+"]\t"+"UI =["+ui_hands+"]  �� �����ϴ�.");
				draw++;
			}


			System.out.println();
			System.out.print("�� �����Ͻðڽ��ϱ�? [ Y / N ] : ");

			regame = scan.next();

			System.out.println();

			if("Y".equals( regame ) || "y".equals( regame )){
				regame_count++;
				System.out.println("�� "+regame_count+"���� ���� "+"win [ "+p_win+" ]"+"\t"+" lose [ "+u_win+" ]"+"\t"+"same [ "+draw+" ]");
				continue;
			}else{
				regame_count++;
				System.out.println();
				System.out.println("�� "+regame_count+"���� ���� "+"win [ "+p_win+" ]"+"\t"+" lose [ "+u_win+" ]"+"\t"+"same [ "+draw+" ]");
				break;
			}

		}
	}
}
