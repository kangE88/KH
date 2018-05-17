package method_ex;

public class Exercise2 {

	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
	static int[] shuffle(int arr[]) {
		
		int temp;
		int r;
		
		for(int i=0;i<arr.length-1;i++) {
			
			r = (int)(Math.random()*9); //0-8
			
			temp = arr[r];
			arr[r] = arr[i+1];
			arr[i+1] = temp;
		}
		
		return arr;
	}

}
