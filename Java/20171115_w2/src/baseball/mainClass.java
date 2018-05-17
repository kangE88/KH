package baseball;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String re="";
		
		baseball bb = new baseball();
		
		bb.input();
		
		while(true) {
			
			bb._random();
			
			bb.loop();
			
			bb.resultPrint();
			
			//regame 
			System.out.print("다시 하실?");
			re = sc.next();
			if("Y".equalsIgnoreCase(re)) {
				continue;
			}else {
				break;
			}
		}

	}

}
