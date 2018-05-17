package fibonachi;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//피보나치
		//0 1 1 2 3 5 8 13 21 34
		
		long a, b, c;
		long arrNum[] = new long[20];
		
		int w;
		
		a =0;
		b =1;
		
		arrNum[0] = a;
		arrNum[1] = b;
		
		w=0;
		while(w < 18) {
			c= a+b;
			arrNum[w+2] = c;
			
			a = b;
			b = c;
			
			w++;
		}
		for(int i=0;i<arrNum.length;i++) {
			System.out.println("arrNum["+i+"] == "+arrNum[i]);
			
		}
	}

}
