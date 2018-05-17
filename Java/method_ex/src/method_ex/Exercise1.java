package method_ex;

public class Exercise1 {

	public static void main(String[] args) {
		
		//공식 루트 [ (y1-y)2승+(x1-x)2승 ]
		
		//제곱근, 루트 근사값 구하기
		//double d = Math.sqrt(3);
		//System.out.println(d);
		
		double result;
		
		result = method(0, 3, 0, 4);
		
		System.out.println("result === "+result);
		
		
		System.out.println();
		
	} 
	static double method(double x, double x1, double y, double y1) {
		double result=0;
		double temp;
		
		temp = Math.sqrt((Math.pow(y1-y, 2)+Math.pow(x1-x, 2)));

		return temp;
		
		
	}
}
