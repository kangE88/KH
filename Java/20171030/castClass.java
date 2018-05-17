class castClass 
{
	public static void main(String[] args) 
	{
		/*
				boolean 1byte
				byte 1byte
				short 2byte
				int 4byte
				long 8byte

				float 4byte
				double 8byte
				
				char 2byte
				String --

				우선순위 (자동 형변환, 강제 형(cast)변환)

				double
				float
				long
				int
				short / char
				byte
		*/

		short sh= 10;
		int i;

		i = sh; //자동형변환
		System.out.println("i = "+i);

		sh = (short)(i+2); //강제형변환
		System.out.println("sh = "+sh);

		long l = 123123123123L;

		float f = l;	//자동형변환
		double d = l;//자동형변환

		System.out.println("f = "+f);
		System.out.println("d = "+d);

		//1.23123122E11
		// E11 10의 11승
		//1.23123122 * 10의 11승

		float f1;

		f1 = (float)3 / 2; //강제형변환

		System.out.println("f1= "+f1);

		double val = 123.45678;
		int j;

		j = (int)val;
		System.out.println("j = "+j);

	}
}
