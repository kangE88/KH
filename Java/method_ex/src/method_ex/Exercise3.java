package method_ex;

public class Exercise3 {

	public static void main(String[] args) {

		int[] data = {3,2,1,4,9};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값: "+max(data));
		
	}
	static int max(int arr[]) {
		
		int temp;
		
		int result;
		
		result =0;
		//높은 숫자 0번배열에 세팅
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {

				if(arr[i] > arr[j]) { 
					arr[j] = arr[i];    
				}
				if(arr == null || arr.length == 0) {
					result = -999999;
					break;
				}else {
					result = arr[i];
					break;
				}
			}
		}
		return result;
	}

}
