import java.util.Random;

class exam_3 
{
	public static void main(String[] args) 
	{
		int arrCount[] = new int[5]; //= {3, 2, 5, 1, 4, 2};
/*
		for(int i=0;i<6;i++){
			for(int j=0;j<arrCount[i];j++){
					System.out.print("*");
			}
			System.out.println();
		}
*/
		

		for(int i=0;i<5;i++){

			arrCount[i] = ((int)(Math.random()*10)+5);

			System.out.println("Random 숫자 호출 = "+arrCount[i]);
		}
	}
}
