import java.util.Scanner;

class array2Class 
{
	public static void main(String[] args) 
	{
		/*
			array : 정의
			같은 자료형의 묶음

			char[]
			int[]
			double[]
			String[]

			intdex number 로 관리 한다

			structure 구조체

			int array[] = new int[5]; 5개

			2차원  배열
			int Array2[][];
			
			int Array[] = {1,2,3,4,5};

			int Array2[3][4] = {
			
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
			}

		*/


/*
		int Array2[][];

		Array2 = new int[3][];

		int data1[] = new int[4];
		data1[0] = 1;
		data1[1] = 2;
		data1[2] = 3;
		data1[3] = 4;
		//data1[4] = 41;
		//data1[5] = 42;

		int data2[] = new int[5];
		data2[0] = 5;
		data2[1] = 6;
		data2[2] = 7;
		data2[3] = 8;
		data2[4] = 81;
		
		int data3[] = new int[4];
		data3[0] = 9;
		data3[1] = 10;
		data3[2] = 11;
		data3[3] = 12;

		Array2[0] = data1;
		Array2[1] = data2;
		Array2[2] = data3;
*/
/*
		int Array2[][] = new int[3][4];

		Array2[0][0] = 1;
		Array2[0][1] = 2;
		Array2[0][2] = 3;
		Array2[0][3] = 4;

		Array2[1][0] = 5;
		Array2[1][1] = 6;
		Array2[1][2] = 7;
		Array2[1][3] = 8;

		Array2[2][0] = 9;
		Array2[2][1] = 10;
		Array2[2][2] = 11;
		Array2[2][3] = 12;

		for(int i=0;i<Array2.length;i++){
			for(int j=0;j<Array2[0].length; j++){
				System.out.print("\t"+Array2[i][j] +"  ");
			}
				System.out.println();
		}

		int sum = 0;

		for(int i=0;i<Array2.length;i++){
			for(int j=0;j<Array2[0].length; j++){
				sum = sum + Array2[i][j];
			}
		}
		System.out.println("sum == "+sum);
*/

		// ? 명 (국 영 수)
		//array2[5][3];
		//개인평균 과목평균

		int student;
		int jumsu[][];  //0국 1영 2수 순
		int wc, wc2;

		// 모든과목 총점 && 평균
		int tot_sum;
		int tot_avg;

		// 국,영,수 총점
		int k_sum;
		int m_sum;
		int e_sum;

		// 국, 영, 수 과목평균 
		int s_avg;

		//최대 최소
		int top, under;

		student = 0;

		wc = 0;
		wc2 = 0;

		tot_sum = 0;
		tot_avg = 0;

		k_sum = 0;
		m_sum = 0;
		e_sum = 0;

		s_avg = 0;

		
		Scanner scan = new Scanner(System.in);


		System.out.print("몇 명의 (국,영,수) 과목의 성적을 입력 하시겠습니까? ");
		student = scan.nextInt();

		if(student <= 0){
			System.out.println("1명 이상 입력하십시오.");
		}else{
			jumsu = new int[student][3];
			System.out.println(jumsu.length);

			// input
			// 국 영 수 > 0

			while(wc < student){

				wc2=0;

				while(wc2 < 3){

					System.out.print("점수 입력(국,영,수) 순서 : ");
					jumsu[wc][wc2] = scan.nextInt();

					if(jumsu[wc][wc2] < 0){
						System.out.println("0점 이상이어야 합니다.");
						continue;
					}
					wc2++;
				}
				wc++;
			}

			System.out.println("\n===========결과============\n");
			// 출력
			System.out.println("\t국어\t영어\t수학\t");
			for(int i=0;i<student;i++){
				for(int j=0;j<3;j++){
					tot_sum = tot_sum+jumsu[i][j];
					System.out.print("\t"+jumsu[i][j]);
				}
				k_sum = k_sum+jumsu[i][0];
				m_sum = m_sum+jumsu[i][1];
				e_sum = e_sum+jumsu[i][2];
				
				System.out.println();
			}

		System.out.println("\n======총점 & 평균=====\n");

		// 총점
		System.out.println("총점 : "+tot_sum);
		tot_avg = tot_sum / student;
		System.out.println("평균 : "+tot_avg);

		System.out.println("\n====== 국 어 ========\n");

		// 국어 총점 평균
		System.out.println("국어 총점 : "+k_sum);
		s_avg = k_sum / student;
		System.out.println("국어 평균 : "+s_avg);

		System.out.println("\n====== 수  학 ========\n");

		// 수학 총점 평균
		System.out.println("수학 총점 : "+m_sum);
		s_avg = m_sum / student;
		System.out.println("수학 평균 : "+s_avg);

		System.out.println("\n====== 영 어 =========\n");

		// 영어 총점 평균
		System.out.println("영어 총점 : "+e_sum);
		s_avg = e_sum / student;
		System.out.println("영어 평균 : "+s_avg);

		System.out.println("\n===================\n");

		// 국어 제일 높은 점수 & 낮은 점수

		//비교 점수 초기화
        top = 0;
		under = 100;
     /////////////////////////////////////////////////////////////    
        for(int i=0 ; i<jumsu.length ; i++){
            if(jumsu[i][0] >= top){
                top = jumsu[i][0];
            }
			if(jumsu[i][0] < under){
				under = jumsu[i][0];
			}
		}
		System.out.println("국어 최고 점수 : "+ top);
		System.out.println("국어 최저 점수 : "+ under);

		System.out.println("\n================\n");

		// 수학 제일 높은 점수 & 낮은 점수

		//비교 점수 초기화
		top = 0;
		under = 100;

        for(int i=0 ; i<jumsu.length ; i++){
            if(jumsu[i][1] >= top){
                top = jumsu[i][1];
            }
			if(jumsu[i][1] < under){
				under = jumsu[i][1];
			}
		}

		System.out.println("수학 최고 점수 : "+ top);
		System.out.println("수학 최저 점수 : "+ under);

		System.out.println("\n================\n");

		// 영어 제일 높은 점수 & 낮은 점수

		//비교 점수 초기화
		top = 0;
		under = 100;

        for(int i=0 ; i<jumsu.length ; i++){
            if(jumsu[i][2] >= top){
                top = jumsu[i][2];
            }
			if(jumsu[i][2] < under){
				under = jumsu[i][2];
			}
		}

		System.out.println("영어 최고 점수 : "+ top);
		System.out.println("영어 최저 점수 : "+ under);

		System.out.println("\n================\n");
		}
	}
	
}
