import java.util.Scanner;

class study1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int users;
		
		int allSum, allAvg;
		int top, low;

		int allLangSum, allLangAvg;
		int allEngSum, allEngAvg;
		int allMathSum, allMathAvg;

		int langMax, langMin;
		int engMax, engMin;
		int mathMax, mathMin;
	
		int w, n;

		/////// init ///////
		allSum = 0;
		allAvg = 0;
		allLangSum = 0;
		allLangAvg = 0;
		w = 0;

		/////// input //////
		// user 몇명의 데이터를 입력?
		// >> ..명
		System.out.print("몇명의 데이터를 입력할 것입니까? = ");
		users = sc.nextInt();

		int dataArr[][] = new int[users][3];
		/*
		int dataArr[][] = {
			{ 70, 80, 100 },
			{ 85, 90, 75 },
			{ 80, 90, 95 },
			{ 80, 90, 95 },
		}*/

		String title[] = { "국어", "영어", "수학" };
		
		// >> 국어, 영어, 수학 > 0
		/*for(int i = 0;i < dataArr.length; i++){
			for(int j = 0;j < dataArr[0].length; j++){
				System.out.println((i + 1) + "번째 학생의 ");
				
				//if(j == 0)
				//	System.out.print("국어 점수 = ");
				//else if(j == 1)
				//	System.out.print("영어 점수 = ");
				//else
				//	System.out.print("수학 점수 = ");
				
				System.out.print(title[j] + " 점수 = ");

				dataArr[i][j] = sc.nextInt();
			}
		}*/

		for(int i = 0;i < dataArr.length; i++){
			w = 0;
			while(w < dataArr[0].length){
				System.out.println((i + 1) + "번째 학생의 ");
								
				System.out.print(title[w] + " 점수 = ");

				n = sc.nextInt();
				if(n < 0){
					System.out.println("잘못된 값이 입력되었습니다 다시 입력하십시오");
					continue;
				}

				dataArr[i][w] = n;	
				w++;
			}
		}

		// 확인
		for(int i = 0;i < dataArr.length; i++){
			for(int j = 0;j < dataArr[0].length; j++){
				System.out.print(dataArr[i][j] + " ");
			}
			System.out.println();
		}

		////////////////////







		//////// 연산 처리 /////
		// 총점
		for(int i = 0;i < dataArr.length; i++){
			for(int j = 0;j < dataArr[0].length; j++){
				allSum = allSum + dataArr[i][j];
			}
		}

		// 평균
		allAvg = allSum / (dataArr.length * dataArr[0].length);



		top = dataArr[0][0];
		// 제일 높은 점수
		for(int i = 0;i < dataArr.length; i++){
			for(int j = 0;j < dataArr[0].length; j++){
				if(top < dataArr[i][j]){
					top = dataArr[i][j];
				}
			}
		}
	
		low = dataArr[0][0];
		// 제일 낮은 점수
		for(int i = 0;i < dataArr.length; i++){
			for(int j = 0;j < dataArr[0].length; j++){
				if(low > dataArr[i][j]){
					low = dataArr[i][j];
				}
			}
		}
			
		// 국어 총점, 평균
		for(int i = 0;i < dataArr.length; i++){
			allLangSum = allLangSum + dataArr[i][0];
		}
		allLangAvg = allLangSum / dataArr.length;



		// 수학
		for(int i = 0;i < dataArr.length; i++){
			allLangSum = allLangSum + dataArr[i][1];
		}
		allLangAvg = allLangSum / dataArr.length;

		// 영어
		for(int i = 0;i < dataArr.length; i++){
			allLangSum = allLangSum + dataArr[i][2];
		}
		allLangAvg = allLangSum / dataArr.length;

		// 국어	제일 높은 점수
		langMax = dataArr[0][0];
		for(int i = 0;i < dataArr.length; i++){
			if(langMax < dataArr[i][0]){
				langMax = dataArr[i][0];
			}
		}


		// 제일 낮은 점수
		langMin = dataArr[0][0];
		for(int i = 0;i < dataArr.length; i++){
			if(langMin > dataArr[i][0]){
				langMin = dataArr[i][0];
			}
		}

		// 수학	제일 높은 점수
		mathMax = dataArr[0][0];
		for(int i = 0;i < dataArr.length; i++){
			if(mathMax < dataArr[i][1]){
				mathMax = dataArr[i][1];
			}
		}

		//		제일 낮은 점수
		mathMin = dataArr[0][0];
		for(int i = 0;i < dataArr.length; i++){
			if(mathMin > dataArr[i][1]){
				mathMin = dataArr[i][1];
			}
		}

		// 영어	제일 높은 점수
		engMax = dataArr[0][0];
		for(int i = 0;i < dataArr.length; i++){
			if(engMax < dataArr[i][2]){
				engMax = dataArr[i][2];
			}
		}

		//		제일 낮은 점수	
		engMin = dataArr[0][0];
		for(int i = 0;i < dataArr.length; i++){
			if(engMin > dataArr[i][2]){
				engMin = dataArr[i][2];
			}
		}

		/////////////////////


		
		//////// 출력 ///////

		// 총점 평균

		System.out.println("\n=======================\n");

		System.out.println("총 점 =="+allSum);
		System.out.println("총 평 균 =="+allAvg);

		System.out.println("\n=======================\n");

		// 국어 총점, 평균
		System.out.println("국어 총점 == "+allLangSum);
		System.out.println("국어 총 평균 == "+allLangAvg);
	
		// 수학
		System.out.println("수학 총점 == "+allLangSum);
		System.out.println("수학 총 평균 == "+allLangAvg);
		// 영어
		System.out.println("영어 총점 == "+allLangSum);
		System.out.println("영어 총 평균 == "+allLangAvg);

		// 국어	제일 높은 점수
		System.out.println("\n=======================\n");
		System.out.println("국어 제일 높은 점수 = "+langMax);
		//		제일 낮은 점수
		System.out.println("국어 제일 낮은 점수 = "+langMin);

		// 수학	제일 높은 점수				
		System.out.println("\n=======================\n");
		System.out.println("수학 제일 높은 점수 = "+mathMax);
		//		제일 낮은 점수
		System.out.println("수학 제일 낮은 점수 = "+mathMin);
		// 영어	제일 높은 점수
		System.out.println("\n=======================\n");
		System.out.println("영어 제일 높은 점수 = "+engMax);
		//		제일 낮은 점수
		System.out.println("영어 제일 낮은 점수 = "+engMin);
		System.out.println("\n=======================\n");
		
	}
}
