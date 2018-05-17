package arr2ToArr1;

public class arr2ToArr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		int arr2[][] = {
				{11, 12, 13, 14},
				{21, 22, 23, 24},
				{31, 32, 33, 34}
		};
		
		int arr1[] = new int[arr2.length * arr2[0].length];
		//System.out.println(arr2.length); //3
		//System.out.println(arr2[0].length); //4
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				//1-4   //0 //0 1 2 3
				//4-8   //1 //0 1 2 3
				//8-12 //2 //0 1 2 3
				arr1[arr2[0].length*i+j] = arr2[i][j];
			}
		}
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println("arr1[ "+ i +" ] == "+arr1[i]);
		}


	}

}
