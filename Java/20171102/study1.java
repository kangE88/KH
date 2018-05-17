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
		// user ����� �����͸� �Է�?
		// >> ..��
		System.out.print("����� �����͸� �Է��� ���Դϱ�? = ");
		users = sc.nextInt();

		int dataArr[][] = new int[users][3];
		/*
		int dataArr[][] = {
			{ 70, 80, 100 },
			{ 85, 90, 75 },
			{ 80, 90, 95 },
			{ 80, 90, 95 },
		}*/

		String title[] = { "����", "����", "����" };
		
		// >> ����, ����, ���� > 0
		/*for(int i = 0;i < dataArr.length; i++){
			for(int j = 0;j < dataArr[0].length; j++){
				System.out.println((i + 1) + "��° �л��� ");
				
				//if(j == 0)
				//	System.out.print("���� ���� = ");
				//else if(j == 1)
				//	System.out.print("���� ���� = ");
				//else
				//	System.out.print("���� ���� = ");
				
				System.out.print(title[j] + " ���� = ");

				dataArr[i][j] = sc.nextInt();
			}
		}*/

		for(int i = 0;i < dataArr.length; i++){
			w = 0;
			while(w < dataArr[0].length){
				System.out.println((i + 1) + "��° �л��� ");
								
				System.out.print(title[w] + " ���� = ");

				n = sc.nextInt();
				if(n < 0){
					System.out.println("�߸��� ���� �ԷµǾ����ϴ� �ٽ� �Է��Ͻʽÿ�");
					continue;
				}

				dataArr[i][w] = n;	
				w++;
			}
		}

		// Ȯ��
		for(int i = 0;i < dataArr.length; i++){
			for(int j = 0;j < dataArr[0].length; j++){
				System.out.print(dataArr[i][j] + " ");
			}
			System.out.println();
		}

		////////////////////







		//////// ���� ó�� /////
		// ����
		for(int i = 0;i < dataArr.length; i++){
			for(int j = 0;j < dataArr[0].length; j++){
				allSum = allSum + dataArr[i][j];
			}
		}

		// ���
		allAvg = allSum / (dataArr.length * dataArr[0].length);



		top = dataArr[0][0];
		// ���� ���� ����
		for(int i = 0;i < dataArr.length; i++){
			for(int j = 0;j < dataArr[0].length; j++){
				if(top < dataArr[i][j]){
					top = dataArr[i][j];
				}
			}
		}
	
		low = dataArr[0][0];
		// ���� ���� ����
		for(int i = 0;i < dataArr.length; i++){
			for(int j = 0;j < dataArr[0].length; j++){
				if(low > dataArr[i][j]){
					low = dataArr[i][j];
				}
			}
		}
			
		// ���� ����, ���
		for(int i = 0;i < dataArr.length; i++){
			allLangSum = allLangSum + dataArr[i][0];
		}
		allLangAvg = allLangSum / dataArr.length;



		// ����
		for(int i = 0;i < dataArr.length; i++){
			allLangSum = allLangSum + dataArr[i][1];
		}
		allLangAvg = allLangSum / dataArr.length;

		// ����
		for(int i = 0;i < dataArr.length; i++){
			allLangSum = allLangSum + dataArr[i][2];
		}
		allLangAvg = allLangSum / dataArr.length;

		// ����	���� ���� ����
		langMax = dataArr[0][0];
		for(int i = 0;i < dataArr.length; i++){
			if(langMax < dataArr[i][0]){
				langMax = dataArr[i][0];
			}
		}


		// ���� ���� ����
		langMin = dataArr[0][0];
		for(int i = 0;i < dataArr.length; i++){
			if(langMin > dataArr[i][0]){
				langMin = dataArr[i][0];
			}
		}

		// ����	���� ���� ����
		mathMax = dataArr[0][0];
		for(int i = 0;i < dataArr.length; i++){
			if(mathMax < dataArr[i][1]){
				mathMax = dataArr[i][1];
			}
		}

		//		���� ���� ����
		mathMin = dataArr[0][0];
		for(int i = 0;i < dataArr.length; i++){
			if(mathMin > dataArr[i][1]){
				mathMin = dataArr[i][1];
			}
		}

		// ����	���� ���� ����
		engMax = dataArr[0][0];
		for(int i = 0;i < dataArr.length; i++){
			if(engMax < dataArr[i][2]){
				engMax = dataArr[i][2];
			}
		}

		//		���� ���� ����	
		engMin = dataArr[0][0];
		for(int i = 0;i < dataArr.length; i++){
			if(engMin > dataArr[i][2]){
				engMin = dataArr[i][2];
			}
		}

		/////////////////////


		
		//////// ��� ///////

		// ���� ���

		System.out.println("\n=======================\n");

		System.out.println("�� �� =="+allSum);
		System.out.println("�� �� �� =="+allAvg);

		System.out.println("\n=======================\n");

		// ���� ����, ���
		System.out.println("���� ���� == "+allLangSum);
		System.out.println("���� �� ��� == "+allLangAvg);
	
		// ����
		System.out.println("���� ���� == "+allLangSum);
		System.out.println("���� �� ��� == "+allLangAvg);
		// ����
		System.out.println("���� ���� == "+allLangSum);
		System.out.println("���� �� ��� == "+allLangAvg);

		// ����	���� ���� ����
		System.out.println("\n=======================\n");
		System.out.println("���� ���� ���� ���� = "+langMax);
		//		���� ���� ����
		System.out.println("���� ���� ���� ���� = "+langMin);

		// ����	���� ���� ����				
		System.out.println("\n=======================\n");
		System.out.println("���� ���� ���� ���� = "+mathMax);
		//		���� ���� ����
		System.out.println("���� ���� ���� ���� = "+mathMin);
		// ����	���� ���� ����
		System.out.println("\n=======================\n");
		System.out.println("���� ���� ���� ���� = "+engMax);
		//		���� ���� ����
		System.out.println("���� ���� ���� ���� = "+engMin);
		System.out.println("\n=======================\n");
		
	}
}
