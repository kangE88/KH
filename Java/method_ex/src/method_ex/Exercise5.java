package method_ex;

public class Exercise5 {

	public static void main(String[] args) {
		int num1[] = {1, 2, 3, 4, 5};
		
		int result[] =new int[5];
		
		result = getDouble(num1);
			
		// 결과 출력
		for(int i=0;i<num1.length;i++) {
			System.out.println("result "+i+" == "+result[i]);
		}

	}
	static int[] getDouble(int arr[]) {
		
		//배열 안에 있는 값에 곱하기 2값 저장
		for(int i=0;i<arr.length;i++) {
			arr[i] = arr[i] *2;
		}
		
		return arr;
	}
}
