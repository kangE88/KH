package method_ex;

public class mainClass {

	public static void main(String[] args) {
		
		int number; //지역변수 = 로컬변수
		
		number = 0;
		
		System.out.println("main number ==="+number);
		
		method(number); // method(0); value (값)의 할당
		
		//////////////////////////////////////////////////////
		
		int pNumber[] = new int[1];

		pNumber[0] = 7; 
		
		System.out.println("pNumber[0] === "+pNumber[0]);
		
		method1(pNumber);
		
		System.out.println("  method1 pNumber[0] === "+pNumber[0]);
		
		///////////////배열 넘기기
		
		int numArr[];
		
		numArr = arrFunc();
		
		for(int i=0;i<numArr.length;i++) {
			System.out.println("numArr["+i+"] = "+numArr[i]);
		}
		
		/////
		
		int num1, num2;
		
		num1 =1;
		num2 = 2;
		
		swap(num1, num2);
		System.out.println("호출전 num1, num2 === "+num1+"    "+num2);
		
		////////////////////////////////////////////////////////////////////////
		
		int arrNum[] = new int[2];
		
		arrNum[0] = 1;
		arrNum[1] = 2;
			
		System.out.println("호출전 arrNum[0], arrNum[1] === "+arrNum[0]+"    "+arrNum[1]);
		
		swapArr(arrNum);
		
		//////////////////////////////////////////////////////////////////////
		
		//함수 1개 두수를 나눈 몫과 나머지를 구한다
		
		//몫 -> return 값
		
		//나머지 -> address에 의한 할당
		
		int arr[] = new int[2];
		
		int result1;
		
		result1 = method3(9,2,arr);
		
		System.out.println("몫 === "+result1);
		System.out.println("나머지== "+arr[0]);
		System.out.println("몫합계== "+arr[1]);
				
	}
	
	//return 값 설정 전달과 배열에 담긴 주소에 의한 값 전달
	static int method3(int num1, int num2, int result[]) {
	
		result[0] = num1 % num2;
		result[1] = num1 + num2;
		return num1 / num2;
	}
	
	static void swapArr(int arrNum[]) {
		int temp;
		
		temp = arrNum[0];
		arrNum[0] = arrNum[1];
		arrNum[1] = temp;
		
		System.out.println("호출후 arrNum[0], arrNum[1] === "+arrNum[0]+"    "+arrNum[1]);
	}
	
	
	static void swap(int n1, int n2) {
		int temp;
		
		temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.println("호출후 num1, num2=== "+n1+"    "+n2);
	}
	
	//배열 넘기기
	static int[] arrFunc() {
		int arr[] = {1,2,3,4,5};
		return arr;
	}
	
	
	static void method1(int number[]) {
		number[0] = 14;
		System.out.println(" method1 pNumber[0] === "+number[0]);
	}
	
	public static void method(int number) {
		//int number; //로컬변수
		
		number = number + 12;
		System.out.println("method number ==="+number);
	}
}
