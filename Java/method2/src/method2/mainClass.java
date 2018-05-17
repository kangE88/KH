package method2;

public class mainClass {
	public static void main(String[] args) {
		/*
		함수명 : myRandom
		
		parameter : int max
						 int min
						 int len
						 
						 int[] 받을 배열
		
		*/
		int arr[] = myRandom(11,8,100);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	static int[] myRandom(int max, int min, int len) {
		int r;
		
		int arr[] = new int[len];
		
		for(int i=0;i<arr.length;i++) {
			r = (int)(Math.random()*(max+1-min))+min;
			
			//Math.random()*2)+
			arr[i] = r;
			System.out.println(r);
		}
		
		return arr;
	}
}
