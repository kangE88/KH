import java.util.Scanner;

class exam_8_20171031 
{
	public static void main(String[] args) 
	{
/*
	int arrNum[];

	arrNum = new int[number];

	for(int i=0;i<arrNum.length;i++){
		System.out.println((i+1)+"��° ���� =");
		arrNum[i] = sc.nextInt();
	}

	int _sum = 0, _avg;

	for(int i =0; i<arrNum.length;i++){
		_sum = _sum+arrNum[i];
	}

	_avg = _sum/ arrNum.length;

*/

		Scanner scan = new Scanner(System.in);

		//�Է� �� ������ ����
		int number;

		//���
		int avg = 0;
		
		//�����հ�
		int result = 0;
		
		System.out.print("�հ�� ����� ����� ������ ������ �����ϼ��� : ");
		number = scan.nextInt();

		int sum[] = new int[number];

		if(number == 1){
			System.out.println("2�� �̻� �Է��ϼ���.");
		}else{
			for (int i=0; i < number; i++ )
			{
				System.out.print("���� " + number + "���� �Է��ϼ���. ("+(i+1)+"�� �Է���) =");
				sum[i] = scan.nextInt();
				result = result+sum[i];
			}
			avg = result / number;
			System.out.println("result = " + result);		
			System.out.println("avg = "+avg);
		}
	}
}
