import java.util.Scanner;
import java.util.Random;
class  arrayClass
{
	public static void main(String[] args) 
	{
		// Array : 같은 자료형의 묶음

		//정적								       동적
		// 자료형 배열변수명[] = new 자료형[배열 갯수];
		// 자료형[] 배열변수명 ==
 		// 자료형 []배열변수명 ==
		// 범위 : 0 - (배열갯수-1)   5  0 1 2 3 4

		// 배열변수명[0] 배열변수명[1] --

// stack					heap						static							system
//							8Line 선언시 쌓이는구간			
//							new ~
		int num1, num2, num3, num4, num5;

		int arrNum[] = new int[5];

		arrNum[0] = 11;
		arrNum[1] = 22;
		arrNum[2] = 33;
		arrNum[3] = 44;
		arrNum[4] = 55;

		System.out.println("arrNum[2] = "+arrNum[0]);
		System.out.println("arrNum[2] = "+arrNum[1]);
		System.out.println("arrNum[2] = "+arrNum[2]);
		System.out.println("arrNum[2] = "+arrNum[3]);
		System.out.println("arrNum[2] = "+arrNum[4]);

		int arrNum1[];

		arrNum1 = new int[3];

		int count;
		int myArr[];

		Scanner scan = new Scanner(System.in);

		System.out.print("몇개를 입력하시겠습니까? = ");
		count = scan.nextInt();

		myArr = new int[count];

		// myArr.length; 배열의 길이

		System.out.println("배열의 길이 = "+myArr.length);

		char arrC[] = new char[10];

		arrC[0] ='H';
		arrC[1] ='e';
		arrC[2] ='l';
		arrC[3] ='l';
		arrC[4] ='o';

		System.out.println(""+arrC[0]+arrC[1]+arrC[2]+arrC[3]+arrC[4]);

		char arrC1[] = {'A','B', 'C'}; // 배열 초기화

		System.out.println(""+arrC1[0]+arrC1[1]);

		int arrNum2[] = {10, 20, 30, 40, 50};

		//0 ~ 4
		System.out.println(""+arrNum2[0]+arrNum2[1]+arrNum2[2]+arrNum2[3]+arrNum2[4]);

		String []arrStr = {"abc","def","ghi"};

		System.out.println(arrStr[1]);

		//배열 복제
		int numArr[] = {111, 222, 333};
		int _myArr[];
		_myArr = numArr;

		System.out.println(numArr[0]);
		System.out.println(numArr[1]);
		System.out.println(numArr[2]);

		_myArr[1] = 444;
		System.out.println(numArr[1]);

		System.out.println("\n================\n");

		// 1~ 45 random 6개 
		// 배열6

		int	 randomArr[];
		randomArr = new int[6];

		/*
		for (int i=0;i<6 ;i++)
		{
			randomArr[i] = (int)(Math.random()*45)+1; 
		}
		*/
		
		randomArr[0] = (int)(Math.random()*45)+1;
		randomArr[1] = (int)(Math.random()*45)+1;
		randomArr[2] = (int)(Math.random()*45)+1;
		randomArr[3] = (int)(Math.random()*45)+1;
		randomArr[4] = (int)(Math.random()*45)+1;
		randomArr[5] = (int)(Math.random()*45)+1;
		
		System.out.println(randomArr[0]);
		System.out.println(randomArr[1]);
		System.out.println(randomArr[2]);
		System.out.println(randomArr[3]);
		System.out.println(randomArr[4]);
		System.out.println(randomArr[5]);

	}
}
