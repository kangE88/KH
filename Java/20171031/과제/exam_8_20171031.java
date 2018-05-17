import java.util.Scanner;

class exam_8_20171031 
{
	public static void main(String[] args) 
	{
/*
	int arrNum[];

	arrNum = new int[number];

	for(int i=0;i<arrNum.length;i++){
		System.out.println((i+1)+"변째 숫자 =");
		arrNum[i] = sc.nextInt();
	}

	int _sum = 0, _avg;

	for(int i =0; i<arrNum.length;i++){
		_sum = _sum+arrNum[i];
	}

	_avg = _sum/ arrNum.length;

*/

		Scanner scan = new Scanner(System.in);

		//입력 할 숫자의 갯수
		int number;

		//평균
		int avg = 0;
		
		//최종합계
		int result = 0;
		
		System.out.print("합계와 평균을 계산할 숫자의 갯수를 선택하세요 : ");
		number = scan.nextInt();

		int sum[] = new int[number];

		if(number == 1){
			System.out.println("2개 이상 입력하세요.");
		}else{
			for (int i=0; i < number; i++ )
			{
				System.out.print("숫자 " + number + "개를 입력하세요. ("+(i+1)+"개 입력중) =");
				sum[i] = scan.nextInt();
				result = result+sum[i];
			}
			avg = result / number;
			System.out.println("result = " + result);		
			System.out.println("avg = "+avg);
		}
	}
}
